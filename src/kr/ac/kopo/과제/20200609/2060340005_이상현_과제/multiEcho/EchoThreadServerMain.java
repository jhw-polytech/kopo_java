package day0609.homework.multiEcho;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {
	private Socket socket;
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		InetAddress client = socket.getInetAddress();
		System.out.println("[" + client + "] 님이 접속");

		try (InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);) {
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("[" + client + "] 접속 종료");
					socket.close();
					break;
				}
				System.out.println("[" + client + "]님의 메세지 " + msg );
				
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class EchoThreadServerMain {
	public static void main(String[] args) {
		
		System.out.println("EchoServer 구동...");
		
		try {
			ServerSocket server = new ServerSocket(10001);
			
			while (true) {
				Socket client = server.accept();
				
				EchoThread et = new EchoThread(client);
				et.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}