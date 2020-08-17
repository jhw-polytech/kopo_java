package kr.ac.kopo.day19.homework01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient01 {

	 public static void main(String[] args) {
		 try {
			
			 Socket socket = new Socket("localhost", 10000);
			 
			//서버에 전송할 메세지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			//키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			//서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				System.out.println("전송할 메세지를 입력하세요. quit 입력시 종료됩니다. ");
				System.out.print("입력 : ");
				String msg = keyboard.readLine();
				if (msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료...");
					socket.close();
					break;
				}
				//PrintWriter는 println, print같은 것을 맘껏 사용가능~
				pw.println(msg);
				pw.flush();
				
				String echoMsg = br.readLine();
				System.out.println("서버 : " + echoMsg);
			}
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}
