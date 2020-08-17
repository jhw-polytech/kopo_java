package kr.ac.yeongnam.day18.homework2;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

class  ChatServer{
	int port = 10001;
	ServerSocket server = null;
	Socket client = null;

	HashMap<String, PrintWriter> hm;

	public ChatServer() {
		ChatSverThread sr;
		Thread t;

		try {
			server = new ServerSocket(port);
			
			System.out.println( "** 채팅 서버 시작 **" );
			hm = new HashMap<String, PrintWriter>();

			while(true) {
				client = server.accept();
				if(client != null) {
					sr = new ChatSverThread(client, hm);
					t = new Thread(sr);
					t.start();
				}
			}
		}
		catch (Exception e)	{
			e.printStackTrace();
		}
	}
}
