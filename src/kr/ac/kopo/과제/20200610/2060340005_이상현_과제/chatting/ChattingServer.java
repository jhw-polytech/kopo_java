package shlee1993.day16.homework;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChattingServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			HashMap<String, PrintWriter> hm = new HashMap<String, PrintWriter>();
			
			while (true) {
				System.out.println("접속 대기중...");
				Socket socket = server.accept();
				ChattingServerThread cs = new ChattingServerThread(socket, hm);
				cs.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}