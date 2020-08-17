package kr.ac.kopo.day20.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiver implements Runnable {
	
	private BufferedReader br;
	private Socket socket;
	private String ServerMsg;
	
	public ClientReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				ServerMsg = br.readLine();		
				System.out.println(ServerMsg);
			}
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
				socket.close();
			} catch(Exception e) {
				
			}
		}
	}
}
