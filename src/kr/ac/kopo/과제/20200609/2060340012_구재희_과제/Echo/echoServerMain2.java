package echoHomework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class echoServerMain2 {

public static void main(String[] args) {
				
		try {
			
			ServerSocket server = new ServerSocket(10003);
			System.out.println("클라이언트의 접속을 기다립니다...");
			while(true) {
				Socket client = server.accept();

				Talk talk = new Talk(client);
				talk.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Talk extends Thread{
	Socket client;
	Talk(Socket client){
		this.client = client;
	}
	public void run() {
		try (
				// 클라이언트가 전송해준 메세지를 수신할 객체
				InputStream is = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8"); // char이기 때문에 사용...
				BufferedReader br = new BufferedReader(isr); // 빠르게 하기 위해 ...

				// 수신한 메세지를 클라이언트에게 재전송할 객체
				OutputStream os = client.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw); 

		) {

			System.out.println("접속된 클라이언트 정보 : [" + client.getInetAddress() + " ]");

			// 클라이언트가 보낸 메세지를 계속 읽어야함..
			while (true) {
				String msg = br.readLine();

				if (msg == null) {
					System.out.println("클라이언트 [" + client.getInetAddress() + " ]과의 접속 해제");
					client.close();
					break;
				}

				System.out.println("[" + client.getInetAddress() + "] 보낸 메세지 : " + msg);

				pw.println(msg);
				pw.flush();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
