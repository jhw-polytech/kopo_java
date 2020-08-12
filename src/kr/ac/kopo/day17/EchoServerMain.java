package kr.ac.kopo.day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
	터미널에서 실행시 >>> java EchoServerMain 10001 라고 쳐서 실행하고 싶음.(10001은 포트)
	run > run configurations > arguments 탭 (main()메소드에 전달되는 매개변수) > 10001 추가
 */

public class EchoServerMain {
	public static void main(String[] args) {

		System.out.println(args.length); // 1이라고 나와야 정상(10001이라는 매개변수)

		// 올바르게 포트번호를 실행한 게 아닐 시 실행되는 if문
		if (args.length != 1) {
			System.out.println("-------------------------------------------------------");
			System.out.println("    사용법 : java EchoServerMain  port번호");
			System.out.println("-------------------------------------------------------");
			System.exit(0);
		}

		int portNo = Integer.parseInt(args[0]); // args 배열의 0번지에 입력되어 있음

		try {
			ServerSocket server = new ServerSocket(portNo);
			System.out.println("클라이언트의 접속을 기다립니다....");

			Socket client = server.accept();
			System.out.println("접속된 클라이언트 정보: [ " + client.getInetAddress() + " ]");

			// 클라이언트가 전송해준 메세지를 수신할 객체
			InputStream is = client.getInputStream(); // 클라이언트가 전송해준 메세지를 수신할 객체
			InputStreamReader isr = new InputStreamReader(is, "utf-8"); // inputstream으로 받아온 것을 필터클래스로 걸러줌
			BufferedReader br = new BufferedReader(isr); // 속도 빠르게 하기 위해서 buffer 사용

			// 수신한 메세지를 클라이언트에게 재전송할 객체
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw); // print(), printf(), println() 메소드를 맘껏 쓸 수 있게 하는 클래스

			while (true) {
				String msg = br.readLine();

				// pw.println(msg); pw.flush(); 가 위쪽에 위치할 경우
				if (msg == null) {
					System.out.println("클라이언트 [ " + client.getInetAddress() + " ]과의 접속해제");
					client.close();
					break;
				}

				System.out.println("[ " + client.getInetAddress() + " ] : " + msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
