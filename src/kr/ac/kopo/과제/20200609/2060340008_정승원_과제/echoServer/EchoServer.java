package kr.ac.kopo.day18.project.echoServer;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("********************************************");
			System.out.println("    사용법 : java EchoServerMain  port번호  ");
			System.out.println("********************************************");
		}
		
		int portNo = Integer.parseInt(args[0]); 
		try {
			ServerSocket server = new ServerSocket(portNo);		
			while (true) {
                Socket client = server.accept();
                EchoClient echoClient = new EchoClient (client);
                echoClient.start();
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}