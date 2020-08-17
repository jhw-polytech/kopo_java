package kr.ac.yeongnam.day17.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptThread extends Thread {
	
	private ServerSocket socket;
	
	AcceptThread(ServerSocket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		Socket client;
		try {
			client = socket.accept();
			System.out.println("[" + client.getInetAddress() + "]님이 접속했습니다.");
			
			// 클라이언트가 전송해준 메세지를 수신할 객체 필요
			InputStream is = client.getInputStream(); // 바이트 스트림
			InputStreamReader isr = new InputStreamReader(is); // 문자 스트림
			BufferedReader br = new BufferedReader(isr); // 속도를 빠르게 하기 위해서
			
			// 수신한 메세지를 클라이언트에게 재전송 할 객체 필요
			OutputStream os = client.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(ow);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println(" [" + client.getInetAddress() +"]님 접속 종료");
					client.close();
					break; //System.exit(0);
				}
				
				System.out.println("[" + client.getInetAddress() + "]보낸메세지 : " + msg);
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
