package chatting;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChatServer {
	
	final int port = 9999;
	ServerSocket server = null;
	Socket child = null;
	
	HashMap<String, PrintWriter> hashmap;
	
	public ChatServer() {
		ChatServerThread cst;
		Thread th;
		
		try {
			server = new ServerSocket(port);
			
			System.out.println("---------------------------------");
			System.out.println("\t서버 ON");
			System.out.println("---------------------------------");
			
			hashmap = new HashMap<String, PrintWriter>();
			
			while(true) {
				child = server.accept();
				if(child != null) {
					cst = new ChatServerThread(child, hashmap);
					th = new Thread(cst);
					th.start();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		new ChatServer();
	}
		
	
}
