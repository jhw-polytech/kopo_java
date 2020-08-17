package kr.ac.yeongnam.day18.homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class  ChatClient {
	
	//클라이언트가 접속 할 IP / PORT 정보
	String ipAddress;
	int port = 10001;
	
	//Socket 변수 생성
	Socket client = null;
	
	//입출력 API
	BufferedReader read;
	BufferedReader br; 
	
	PrintWriter pw;
	String toMsg;
	String fromMsg;

	String user;
	ReceiveDataThread rt;
	
	//종료 여부 boolean
	boolean endflag = false;

	public ChatClient(String id, String ip) {
		user = id;
		ipAddress = ip;
		
		try{
			//클라이언트 객체 생성
			client = new Socket(ipAddress, port); 

			read= new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader( new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());

			pw.println( user );
			pw.flush();            

			rt = new ReceiveDataThread(client, br);
			Thread t = new Thread(rt);
			t.start(); 

			while(true){
				toMsg = read.readLine();

				pw.println( toMsg );
				pw.flush();            

				//quit 입력 시 종료
				if(toMsg.equals( "/quit") ) { 
					endflag = true; 
					break;
				}
			}
			System.out.print("접속을 종료합니다. ");
			System.exit(0);
			
		} catch(Exception e){  
			if(!endflag) {
				e.printStackTrace();
			}
		}
		finally{
			try{
				br.close();
				pw.close();
				client.close();   
				System.exit(0);
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
}