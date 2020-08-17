package chatting;
import java.net.*;
import java.io.*;
import java.util.*;

public class  ChattingClient {
	String ipAddress;
	static final int port=6000;
	Socket client=null;
	BufferedReader read;
	PrintWriter oos;
	BufferedReader ois; 
	String sendData;
	String receiveData;

	String user_id;
	DataThread datathread;
	boolean endflag=false;

	public ChattingClient(String id, String ip) {
		user_id=id;
		ipAddress=ip;
		try{
			System.out.println("["+user_id+"] 님이 접속했습니다.");
			client = new Socket(ipAddress, port); 

			read= new BufferedReader(new InputStreamReader(System.in));
			ois = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			oos = new PrintWriter( client.getOutputStream() );

			oos.println( user_id );
			oos.flush();            

			datathread= new DataThread(client, ois);
			Thread t = new Thread(datathread);
			t.start(); 

			while(true){
				sendData = read.readLine();

				oos.println( sendData );
				oos.flush();            

				if(sendData.equals( "/quit") ) { 
					endflag = true;
					break;
				}
			}
			System.out.print("클라이트의 접속을 종료합니다. ");
			System.exit( 0 );
		} catch(Exception e){  
			if(!endflag) e.printStackTrace();
		}
		finally{
			try{
				ois.close();
				oos.close();
				client.close();   
				System.exit(0);
			}catch(IOException e2){
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.print("사용법 : java  ChatClient  사용자_id  서버_ip");
			System.exit(0);
		}
		new ChattingClient(args[0], args[1]);
	}
}