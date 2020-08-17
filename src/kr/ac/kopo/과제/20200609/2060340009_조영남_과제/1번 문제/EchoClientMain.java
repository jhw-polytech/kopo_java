package kr.ac.yeongnam.day17.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {
	public static void main(String[] args) {
		
		String serverIp = "172.16.88.139";
		int port = 10000;
		
		try {
			Socket socket = new Socket(serverIp, port);
			
			// 서버에 전송할 메세지를 키보드로 입력받는 객체 필요
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			// 키보드로 입력받은 메시지를 서버에 전송할 객체 필요
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(ow);
			
						
			// 서버에서 보내준 메세지를 수신할 객체 필요
			InputStream is = socket.getInputStream(); // 바이트 스트림
			InputStreamReader isr = new InputStreamReader(is); // 문자 스트림
			BufferedReader br = new BufferedReader(isr); // 속도를 빠르게 하기 위해서
			
			
			while(true) {
				
				System.out.print("전송할 메세지를 입력하세요(quit 입력시 종료) : ");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료...");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
				
				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : [" + echoMsg + "]" );
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
