package kr.ac.kopo.day18.project.echoServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient extends Thread {

	Socket client;
	
	public EchoClient(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		try {
			
			System.out.println("[" + client.getInetAddress() + "]님 접속하였습니다");
			
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("[" + client.getInetAddress() + "]님 접속종료 ");
					client.close();
					break;
				}
				
				System.out.println("[" + client.getInetAddress()+ "] 보낸 메세지 :" + msg);
				
				pw.println(msg);
				pw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}