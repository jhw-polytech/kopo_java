package kr.ac.kopo.day17.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiChatServerUtil {

	public void start(Socket socket) {

		Socket client = socket;

		try {
			// 클라이언트가 전송해준 메세지를 수신할 객체
			InputStream is;
			is = client.getInputStream();

			// 클라이언트가 전송해준 메세지를 수신할 객체
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			// 수신한 메세지를 클라이언트에게 재전송할 객체
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				String msg = br.readLine();

				pw.println(msg);
				pw.flush();

				if (msg == null) {
					System.out.println("==============================================");
					System.out.println("클라이언트 [ " + client.getInetAddress() + " ]과의 접속해제");
					System.out.println("==============================================");
					client.close();
					break;
				}

				System.out.println("[" + client.getInetAddress() + "] : " + msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
