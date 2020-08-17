package gneegnee;

import java.net.*;
import java.io.*;
import java.util.*;

public class ChatSeverThread implements Runnable
{
	Socket client;

	BufferedReader ois;
	PrintWriter oos;
	
	String user_id;
	HashMap<String, PrintWriter> hs;
	InetAddress ip;
	String msg;

	public ChatSeverThread( Socket s, HashMap<String, PrintWriter> h ) {
		client = s;
		hs = h;

		try	{
			ois = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			oos = new PrintWriter( client.getOutputStream() );

			user_id = ois.readLine();
			ip = client.getInetAddress();
			System.out.println( ip + "로부터 " + user_id + "님이 접속하였습니다." );
			broadcast(user_id + "님이 접속하셨습니다.");

			synchronized( hs ) {	
				hs.put( user_id, oos );
			}
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
	}

	public void run() {
		String receiveData;

		try
		{
			while( (receiveData = ois.readLine()) != null ) {

				if( receiveData.equals( "/quit" ) ) {
					synchronized( hs ) {
						hs.remove( user_id );
					}
					break;
				}
				else if( receiveData.indexOf( "/to" ) >= 0 ) {
					sendMsg( receiveData );
				}
				else broadcast( user_id + " >> " + receiveData );
			}
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			synchronized( hs ) {
				hs.remove( user_id );
			}
			broadcast( user_id + "님이 퇴장했습니다." );
			System.out.println( user_id + "님이 퇴장했습니다." );
			try
			{
				if( client != null ) {
					ois.close();
					oos.close();
					client.close();
				}
			}
			catch ( Exception e) {}
		}
	}

	public void broadcast(String message){
		synchronized( hs ) {
			try{
				for( PrintWriter oos : hs.values( )){
				  oos.println( message );
				  oos.flush();
				}
			}catch(Exception e){ }
		}
	}

	public void sendMsg(String message){
		int begin = message.indexOf(" ") + 1;
		int end   = message.indexOf(" ", begin);

		if(end != -1){
			String id = message.substring(begin, end);
			String msg = message.substring(end+1);
			PrintWriter oos = hs.get(id);
			try{
				if(oos != null){
					oos.println( user_id + "님이 다음과 같은 귓속말을 보냈습니다. : " + msg );
					oos.flush();
				}
			}catch(Exception e){ }
		}
	}
}

