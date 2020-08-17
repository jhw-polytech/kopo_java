package kr.ac.kopo.day17.homework;

import java.net.ServerSocket;
import java.net.Socket;

import kr.ac.kopo.day17.homework.util.SocketClose;

/*
 	java EchoServerMain 10001
 */

public class MultiEchoServerMain {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket client = null;
		try {
			int portNo = Integer.parseInt(args[0]);
			server = new ServerSocket(portNo);
			System.out.println("클라이언트의 접속을 기다립니다....");
			while(true) {
		
				client = server.accept();
				new MultiEchoServerThread(client).start();
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			SocketClose.close(client);
			SocketClose.close(server);
		}
		
	}

}
