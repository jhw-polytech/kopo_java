package homework0609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("채팅 서버 프로그램을 가동합니다.");
			while(true) {
				Socket client = server.accept();
				Chatbot chatbot = new Chatbot(client);
				chatbot.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Chatbot extends Thread{
	Socket client;
	public Chatbot(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		
		try {
		// TODO Auto-generated method stub
		//클라이언트가 전송해준 메세지를 수신할 객체를 생성(String 객체)
		InputStream is = client.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		//수신한 메세지를 클라이언트에게 재 전송할 객체를 생성(String 객체)
		//이때 print, println, printf까지 모두 사용 가능한 printwriter객체로 필터 클래스 입힘
		OutputStream os = client.getOutputStream();
		OutputStreamWriter osr = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osr);
		
		while(true) {
			String msg = br.readLine();
			if(msg==null) {
				System.out.println("클라이언트의 접속을 해제 ( " + client.getInetAddress()+")");
				client.close();
				break;
			}else {
				System.out.println(client.getInetAddress()+"님 접속하셨습니다.");
			}
			System.out.println(client.getInetAddress()+"님이 보낸 메세지 : "+msg);
			
			pw.println(msg);
			pw.flush();
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
