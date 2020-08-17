package chatProject;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChatServer {

	HashMap<String, PrintWriter> hm;
	
	public ChatServer() {
		ChatServerThread sr;
		Thread tr;
		
		try {
			ServerSocket server = new ServerSocket(10001);	// 서버 소켓 선언
			
			System.out.println("$ java ChatServer");
			System.out.println();
			System.out.println("** 채팅 서버 시작 **");
			
			hm = new HashMap<String, PrintWriter>();
			
			while(true) {
				Socket child = server.accept();	// 클라이언트 소켓 연결받고
				if(child != null) {	// 성공하면
					sr = new ChatServerThread(child, hm); //채팅 스레드 생성
					tr = new Thread(sr);
					tr.start();
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
