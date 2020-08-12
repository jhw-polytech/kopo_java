package kr.ac.kopo.day17.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {

	private Socket socket; // 소켓 까먹으면 안되니까 멤버변수로 가짐

	// 수신을 받아서 재전송할 소켓이 필요하므로, 생성자에 소켓이 필요
	public EchoThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		InetAddress client = socket.getInetAddress();
		System.out.println("[" + client + "]님이 접속하셨습니다.");

		try (InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);) {

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("[" + client + "]님과의 접속이 종료되었습니다.");
					socket.close();
					break;
				}
				System.out.println("[" + client + "]님이 보낸 메세지 : " + msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class EchoThreadServerMain {
	public static void main(String[] args) {

		System.out.println("EchoServer를 구동하겠습니다 . . .");

		try {
			ServerSocket server = new ServerSocket(10001);

			// 계속 대기하고 있다가 요청이 들어오면 소켓 만들어 반환 ==> while
			while (true) {
				Socket client = server.accept();
				System.out.println("cleint: " + client);

				EchoThread et = new EchoThread(client);
				et.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
