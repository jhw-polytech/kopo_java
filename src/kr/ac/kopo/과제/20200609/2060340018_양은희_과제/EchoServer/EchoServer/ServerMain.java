package EchoServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
	java EchoServerMain 10001
*/

public class ServerMain {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("-------------------------------------------------------");
			System.out.println("\t사용법 : java EchoServerMain port번호");
			System.out.println("-------------------------------------------------------");
		}
		
		int portNo = Integer.parseInt(args[0]);
		
		 try {
	            ServerSocket server = new ServerSocket(portNo);
	            System.out.println("클라이언트의 접속을 기다립니다");
	            
	            while(true){
	                Socket client = server.accept();
	                ServerThread st = new ServerThread(client);
	                st.start();
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

	class ServerThread extends Thread{
	    private Socket client;
	    public ServerThread(Socket client){
	        this.client = client;
	    }
	    public void run(){
	        try
	        (	        	//클라이언트가 전송해준 메세지를 수신할 객체
				InputStream is = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8"); // utf-8 안써도 되긴 함
				BufferedReader br = new BufferedReader(isr);

				// 수신한 메세지를 클라이언트에게 재전송할 객체
				OutputStream os = client.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);
				)
	        
			{
	        	InetAddress inetAddr = client.getInetAddress();
	            System.out.println("["+ inetAddr.getHostAddress() + "] 님이 접속했습니다.");
				while (true) {
					String msg = br.readLine();
					if (msg == null) {
						System.out.println("클라이언트 [" + client.getInetAddress() + "]과의 접속해제");
						client.close();
						break;
					}
					System.out.println("[" + client.getInetAddress() + "] :" + msg);
					
					pw.println(msg);
					pw.flush();
				}
	            
	        }catch(Exception e){
	        	e.printStackTrace();
	    }
	}
}