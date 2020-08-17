package kr.ac.kopo.day17.homework.echoServer;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/*
 * java EchoServerMain 172.16.88.145 10001
 */

public class EchoServerMain {

	public static void main(String[] args) {
		
		if(args.length != 1){
			System.out.println("====================================");
			System.out.println(" 사용법 : java EchoServerMain portNo");
			System.out.println("====================================");
			System.exit(0);
		}

		int portNo = Integer.parseInt(args[0]);
		
		List<Socket> list = new ArrayList<>();
		
		try {
			ServerSocket server = new ServerSocket(portNo);
			
			System.out.println("서비스를 시작합니다.");
			AcceptClient ac = new AcceptClient(server, list);
			ac.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
