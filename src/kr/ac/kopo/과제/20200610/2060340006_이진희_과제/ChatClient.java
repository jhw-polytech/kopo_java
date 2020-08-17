package gneegnee;

import java.net.*;
import java.io.*;

public class  ChatClient {
	String ipAddress;
	static final int port=10002;
	Socket client=null;
	BufferedReader read;
	PrintWriter oos;
	BufferedReader ois; 
	String sendData;
	String receiveData;

	String user_id;
	ReceiveDataThread rt;
	boolean endflag=false;

	public ChatClient(String id, String ip) {
		user_id=id;
		ipAddress=ip;
		
		try{
			System.out.println("----- 클라이언트 -----");
			System.out.println("채팅이 시작되었습니다...(quit 입력시 종료)");
			client = new Socket(ipAddress, port); 

			read= new BufferedReader(new InputStreamReader(System.in));
			ois = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			oos = new PrintWriter( client.getOutputStream() );

			oos.println( user_id );
			oos.flush();            

			rt= new ReceiveDataThread(client, ois);
			Thread t = new Thread(rt);
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
			System.out.print("서버와의 접속을 종료합니다... ");
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
			System.out.print("USAGE : java  ChatClient  사용자_id  서버_ip");
			System.exit(0);
		}
		new ChatClient(args[0], args[1]);
	}
}
