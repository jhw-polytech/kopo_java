package Exam_0609;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class EchoServerExam extends Thread {
	private Socket client;

	public EchoServerExam(Socket so) {
		this.client = so;
	}

	public void run() {

		try {
			System.out.println("[" + client.getInetAddress() + "] 님이 접속했습니다.");

			// 클라이언트가 전송해준 메세지를 수신할 객체
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// 수신한 메세지를 클라이언트에 재전송할 객체
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("[" + client.getInetAddress() + "] 님이 채팅방에서 나갔습니다.");
					client.close();
					break;
				}
				System.out.println("[" + client.getInetAddress() + "] : " + msg);
				pw.println(msg);
				pw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class EchoServerExamMain {
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("--------------------------------------------");
			System.out.println("사용법 : java EchoServerMain port번호");
			System.out.println("--------------------------------------------");
			System.exit(0);
		}

		int portNo = Integer.parseInt(args[0]);
		ServerSocket ss = null;
		Socket client = null;

		try {
			ss = new ServerSocket(portNo);
			System.out.println("클라이언트의 접속을 기다립니다...");

			while (true) {
				client = ss.accept();
				EchoServerExam ese = new EchoServerExam(client);
				ese.start();


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
