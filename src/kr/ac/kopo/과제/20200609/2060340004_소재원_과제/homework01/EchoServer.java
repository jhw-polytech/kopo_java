package kr.ac.kopo.day19.homework01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

class nClient extends Thread {

	Socket client;
	
	nClient (Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		//클라이언트가 전송한 메세지를 수신할 객체
		try {
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// 수신한 메세지를 다시 재전송할 객체

			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("클라이언트 [ " + client.getInetAddress() + "]과의 접속 해제");
					client.close();
					break;
				}
				System.out.println("[" + client.getInetAddress() + "] : " + msg);
				pw.println(msg);
				pw.flush();
			}
		} catch (SocketException soc)  {
			System.out.println("클라이언트 [ " + client.getInetAddress() + "]과의 접속 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class EchoServer {


	public static void main(String[] args) {
		try {
			ServerSocket socket = new ServerSocket(10000);
			System.out.println("에코 서버를 구동합니다..");
			while(true) {
				Socket client = socket.accept();
				System.out.println("접속된 클라이언트 정보 : [" + client.getInetAddress() + "]");
				nClient nc = new nClient(client);
				nc.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
