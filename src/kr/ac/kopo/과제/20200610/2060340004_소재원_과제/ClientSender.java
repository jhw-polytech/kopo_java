package kr.ac.kopo.day20.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSender implements Runnable {

	private String nickName;
	private Socket socket;
	private PrintWriter pw;
	private BufferedReader keyboard;
	private BufferedReader br;

	public ClientSender(Socket socket, BufferedReader keyboard) {
		
		this.socket = socket;
		this.keyboard = keyboard;
		
		try {
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			System.out.println("채팅방에서 사용하실 닉네임을 입력하세요 : ");
			nickName = keyboard.readLine();
			pw.println(nickName);
			pw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try { 
			while(true) {
				System.out.print("[/quit : 종료], [/to 상대방닉네임  내용 : 귓속말] 메세지 입력 :");
				System.out.println();
				String msg = keyboard.readLine();
			
				if (msg.equalsIgnoreCase("/quit")) {
	
					pw.close();
					keyboard.close();
					br.close();
					socket.close();
					
				} else if (msg.isEmpty()) {
					continue;

				} else {
					pw.println(nickName + " : " + msg);
					pw.flush();
				}
			}
		} catch(Exception e) {
			try {
				pw.close();
				keyboard.close();
				br.close();
				socket.close();
			} catch (Exception e1) {
				
			}
		} 
	}
	
}
