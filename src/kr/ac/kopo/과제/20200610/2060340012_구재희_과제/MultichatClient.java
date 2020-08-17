package multiChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MultichatClient {
	public static void main(String[] args) {
		
		try {
			String serverIp = "localhost";
			
			Socket socket = new Socket(serverIp, 10001);
			System.out.println("서버에 연결");
			
			Thread sender = new Thread(new ClientSender(socket,serverIp));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {}
	}

	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream dos;
		String name;
		
		ClientSender(Socket socket, String name){
			this.socket = socket;
			try {
				dos = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {}
		}
		
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				if(dos != null) {
					dos.writeUTF(name);
				}
				
				while(dos != null) {
					dos.writeUTF("[" + name + "]" + sc.nextLine());
				}
			} catch (Exception e) {}
		}
	}
	
	
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream din;
		
		ClientReceiver(Socket socket){
			this.socket = socket;
			try {
				din = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {}
		}
		
		public void run() {
			while(din != null) {
				try {
					System.out.println(din.readUTF());
				} catch (Exception e) {}
			}
		}
	}

}
