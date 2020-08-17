package kr.ac.kopo.day18.homework.chat;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * java EchoServerMain 172.16.88.145 10001
 */

public class ChatServerMain {

	public static void main(String[] args) {
		
		List<String> msgQueue = new ArrayList<>();
		
		Map<String, ClientVO> clientMap = new HashMap<>();
		
		int portNo = 10005;
		
		try {
			ServerSocket server = new ServerSocket(portNo);
			
			System.out.println("** 채팅 서버 시작 **");
			
			SendThread mt = new SendThread(msgQueue, clientMap);
			mt.start();
			while(true) {
				
				Socket client = server.accept();
				
				PrintWriter ptw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
				
				ReceiveThread prc = new ReceiveThread(clientMap, msgQueue, client);
				prc.start();
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
