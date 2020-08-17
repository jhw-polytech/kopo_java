package kr.ac.kopo.day20.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClientMain {

	private Socket socket;
	private BufferedReader keyboard;
	
	public void connect() {
		
		try {
			socket = new Socket("localhost", 10000);
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			Thread cSenderThread = new Thread(new ClientSender(socket, keyboard));
			cSenderThread.start();
			
			Thread cReceiverThread = new Thread(new ClientReceiver(socket));
			cReceiverThread.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ChatClientMain chatClient = new ChatClientMain();
		chatClient.connect();
	
	}
}
