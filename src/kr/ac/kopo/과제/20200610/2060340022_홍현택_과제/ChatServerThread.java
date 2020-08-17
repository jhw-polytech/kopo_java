package Exam_0614;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;

public class ChatServerThread implements Runnable {
	Socket client;

	BufferedReader br;
	PrintWriter pw;

	String userId;
	HashMap<String, PrintWriter> hm;
	InetAddress ip;
	String msg;

	public ChatServerThread(Socket s, HashMap<String, PrintWriter> h) {
		client = s;
		hm = h;
		try	{
			br = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			pw = new PrintWriter( client.getOutputStream() );

			userId = br.readLine();
			ip = client.getInetAddress();
			System.out.println( ip + "로부터 " + userId + "님이 접속하였습니다." );
			broadcast(userId + "님이 접속하셨습니다.");

			synchronized( hm ) {	
				hm.put( userId, pw );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String receiveData;

		try
		{
			while( (receiveData = br.readLine()) != null ) {

				if( receiveData.equalsIgnoreCase( "/q" ) ) {
					synchronized( hm ) {
						hm.remove( userId );
					}
					break;
				}
				else if( receiveData.indexOf( "/to" ) >= 0 ) {
					sendMsg( receiveData );
				}
				else broadcast( userId + " >> " + receiveData );
			}
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			synchronized( hm ) {
				hm.remove( userId );
			}
			broadcast( userId + "님이 퇴장했습니다." );
			System.out.println( userId + "님이 퇴장했습니다." );
			try
			{
				if( client != null ) {
					br.close();
					pw.close();
					client.close();
				}
			}
			catch ( Exception e) {}
		}
	}

	public void broadcast(String message){
		synchronized( hm ) {
			try{
				for( PrintWriter pw : hm.values( )){
				  pw.println( message );
				  pw.flush();
				}
			}catch(Exception e){ 
				e.printStackTrace();
			}
		}
	}

	public void sendMsg(String message){
		int begin = message.indexOf(" ") + 1;
		int end   = message.indexOf(" ", begin);

		if(end != -1){
			String id = message.substring(begin, end);
			String msg = message.substring(end+1);
			PrintWriter pw = hm.get(id);
			try{
				if(pw != null){
					pw.println( userId + "님의 귓속말 : " + msg );
					pw.flush();
				}
			}catch(Exception e){ }
		}
	}
}

