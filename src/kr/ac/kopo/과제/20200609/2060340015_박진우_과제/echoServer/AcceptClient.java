package kr.ac.kopo.day17.homework.echoServer;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class AcceptClient extends Thread {

	private List<Socket> clientList = new ArrayList<>();
	private ServerSocket server;
	
	public AcceptClient(ServerSocket server, List<Socket> list) {
		this.server = server;
		this.clientList = list;
	}

	@Override
	public void run() {
		
		try {
			while(true) {
				
				Socket client = server.accept();
				clientList.add(client);
				
				PrintAndRemoveClient prc = new PrintAndRemoveClient(clientList, client);
				prc.start();
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
