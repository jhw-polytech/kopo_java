package chatting;
import java.net.*;

import java.io.*;

import java.util.*;



public class ChattingserverThread implements Runnable

{
	Socket child;
	BufferedReader ois;
	PrintWriter oos;
	String user_id;
	HashMap<String, PrintWriter> mapping;
	InetAddress ip;
	String msg;

	public ChattingserverThread( Socket sock, HashMap<String, PrintWriter> map ) {
		child = sock;
		mapping = map;
		try	{
			ois = new BufferedReader( new InputStreamReader( child.getInputStream() ) );
			oos = new PrintWriter( child.getOutputStream() );
			user_id = ois.readLine();
			ip = child.getInetAddress();

			System.out.println( "접속한 사용자의 아이디는 [ " + user_id + " ]입니다." );
			toAll("["+user_id + "]님이 접속하셨습니다.");

			synchronized( mapping ) {	
				mapping.put( user_id, oos );
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
					synchronized( mapping ) {
						mapping.remove( user_id );
					}
					break;
				}
				else if( receiveData.indexOf( "/to" ) >= 0 ) {
					sendMsg( receiveData );
				}
				else toAll( user_id + " >> " + receiveData );
			}
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			synchronized( mapping ) {
				mapping.remove( user_id );
			}
			toAll("["+ user_id + "]님이 접속을 종료했습니다." );
			System.out.println( "["+user_id + "]님이 퇴장했습니다." );
			try
			{
				if( child != null ) {
					ois.close();
					oos.close();
					child.close();
				}
			}
			catch ( Exception e) {}
		}
	}

	public void toAll(String message){
		synchronized( mapping ) {
			try{
				for( PrintWriter oos : mapping.values( )){
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
			PrintWriter oos = mapping.get(id);
			try{
				if(oos != null){
					oos.println( user_id + "님이 다음과 같은 귀속말을 보내셨습니다. : " + msg );
					oos.flush();
				}
			}catch(Exception e){ }
		}
	}
}
