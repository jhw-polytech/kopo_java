package kr.ac.kopo.day18.homework;

import java.net.Socket;

public class MultichatClientMain {

	public static void main (String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE: java TcpIpMultichatClient 대화명");
			System.exit(0);
		}
		
		try {
			String serverIp = "127.0.0.1";
			
			Socket socket = new Socket(serverIp,10002);
			System.out.println("["+args[0]+"]님 채팅방에 오신걸 환영합니다.");
			
			MultichatClientSender sender = new MultichatClientSender(socket,args[0]);
			MultichatClientReceiver receiver = new MultichatClientReceiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
