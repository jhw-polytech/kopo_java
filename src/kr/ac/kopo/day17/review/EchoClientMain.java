package kr.ac.kopo.day17.review;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 	java EchoClientMain 172.16.88.137 10001
  	args 에 172.16.88.137 10001 이렇게 변수 2개 등록해줘야 함
 */
public class EchoClientMain {

	public static void main(String[] args) {



		try {
			Socket socket = new Socket("172.16.88.129", 10001);
//			Socket socket = new Socket(serverIP, port);

			// 서버에 전송할 메세지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			// 서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				System.out.println("전송할 메세지를 입력하세요(quit 입력시 종료) : ");
				String msg = keyboard.readLine();

				// 여기에 전송이 위치해도 된다.
//				pw.println(msg);
//				pw.flush();

				if (msg.equalsIgnoreCase("case")) { // == 이딴거 쓰지 마랏,,, equalsIgnoreCase > 대소문자 관계 없이 비교
					System.out.println("서버와의 접속종료");
					socket.close();
					break;
				}

				pw.println(msg);
				pw.flush();

				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : [ " + echoMsg + " ]");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
