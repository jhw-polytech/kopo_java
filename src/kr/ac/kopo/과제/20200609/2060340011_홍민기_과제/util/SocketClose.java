package kr.ac.kopo.day17.homework.util;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketClose {

	public static void close(Socket socket) {
		// TODO Auto-generated method stub
		if(socket != null) {
			try {
				socket.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ServerSocket socket) {
		// TODO Auto-generated method stub
		if(socket != null) {
			try {
				socket.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
