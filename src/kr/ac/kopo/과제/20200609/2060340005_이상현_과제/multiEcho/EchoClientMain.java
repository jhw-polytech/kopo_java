package day0609.homework.multiEcho;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {
	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		int port = 10001;

		try {
			Socket socket = new Socket(serverIP, port);

			// 서버에 전송할 메세지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // 한줄로 선언

			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			// 서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr); // 속도를 빠르게 하기 위해
			while (true) {
				System.out.println("전송할 메세지를 입력하세여요(quit입력시 종료) : ");
				String msg = keyboard.readLine();

				pw.println(msg);
				pw.flush();
				if (msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와 접속 종료...");
					socket.close();
					break;
				}				
				
				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지  : [" +  echoMsg + "]");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
