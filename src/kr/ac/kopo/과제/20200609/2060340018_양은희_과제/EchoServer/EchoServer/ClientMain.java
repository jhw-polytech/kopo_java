package EchoServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 	java EchoClientMain 127.0.0.1 10001
 */

public class ClientMain {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("-------------------------------------------------------");
			System.out.println("\t사용법이 잘못되었습니다.");
			System.out.println("\t사용법 : java EchoClientMain 서버IP 접속port번호");
			System.out.println("-------------------------------------------------------");
			System.exit(0);
		}

		String serverIP = args[0];
		int port = Integer.parseInt(args[1]);

		try {
			Socket socket = new Socket(serverIP, port);

			// 서버에 전송할 메세지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			// 서버에서 보내준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8"); // utf-8 안써도 되긴 함
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				System.out.print("전송할 메세지를 입력하세요(quit입력시 종료) : ");
				String msg = keyboard.readLine(); // 한 줄만 입력받음

				if (msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료");
					socket.close();
					break;
				}
				
				// msg를 서버에 전송
				pw.println(msg);
				pw.flush();
				
				// 서버에서 다시 날아오는 msg 읽기
				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : [" + echoMsg + "]");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
