package kr.ac.kopo.day18.homework;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import kr.ac.kopo.util.FileClose;

public class MultichatClientSender extends Thread{

	private Socket socket;
	private DataOutputStream out;
	private String name;

	public MultichatClientSender(Socket socket, String name){
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			this.name = name;

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			out.writeUTF(name); // 맨 처음 접속시 누가 들어왔는지 알려줄 outputstream
			
			if(out!= null) {
				out.writeUTF(name); // 접속 시 계속해서 쓸 이름
				
			}
			
			while(true) {
				String msg = sc.nextLine();
				
				out.writeUTF("["+name+"]"+msg);
				if(msg.equalsIgnoreCase("/quit")) {
					break;	// Sender먼저 소켓을 닫으면 Receiver가 받을 수 없으므로 쓰레드만 정지시킨다 (이 부분에서 socket.close() 시, receiver에서 에러)
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();

		} finally {
		}
	}
}
