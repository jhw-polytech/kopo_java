package Exam_0614;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

class ChatServer {

	protected final int portNo = 10002;
	ServerSocket ss = null;
	Socket client = null;
	
	HashMap<String, PrintWriter> hash;

	public ChatServer() {
		
		
		try {
			ss = new ServerSocket(portNo);

			System.out.println("클라이언트의 접속 대기..");

			hash = new HashMap<String, PrintWriter>();

			while (true) {
				client = ss.accept();
				if (client != null) {
					ChatServerThread cst = new ChatServerThread(client, hash);
					Thread t = new Thread(cst);
					t.start();
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