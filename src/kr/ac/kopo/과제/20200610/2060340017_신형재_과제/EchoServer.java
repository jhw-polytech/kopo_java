package homework0614;

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
import java.util.HashMap;

public class EchoServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("$ java ChatServer");
			System.out.println();
			System.out.println("**채팅 서버 시작**");
			HashMap<String, PrintWriter> hm = new HashMap<>();
			while(true) {
				Socket client = server.accept();
				Chatbot chatbot = new Chatbot(client, hm);
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
	String userID;
	HashMap<String, PrintWriter> hm;
	InetAddress ip;
	String msg;
	public Chatbot(Socket client, HashMap<String, PrintWriter> hm) {
		this.client = client;
		this.hm= hm;
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
		
		ip = client.getInetAddress();
		userID = br.readLine();
		
		System.out.println("접속한 사용자의 아이디는 "+userID+"입니다.("+ip+")");
		broadcast(userID+"님이 접속하셨습니다.");
		
		synchronized (hm) {
			hm.put(userID, pw);
		}
		
		while(true) {
			String msg = br.readLine();
			if(msg==null) {
				System.out.println("클라이언트의 접속을 해제 ( " + userID+")");
				client.close();
				break;
			}else if(msg.indexOf("/to")>=0) {
				sendDirect(msg);
			}else {
				broadcast(userID+ " : "+msg);
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			synchronized(hm) {
				hm.remove(userID);
			}
			broadcast(userID+"님이 나갔습니다.");
			System.out.println(userID+"님이 접속을 종료했습니다.");
		}
	}
	private void sendDirect(String msg) {
		// TODO Auto-generated method stub
		int begin = msg.indexOf(" ")+1;
		int end = msg.indexOf(" ", begin);
		if(end!=-1) {
			String id = msg.substring(begin, end);
			String msg2 = msg.substring(end+1);
			PrintWriter pw = hm.get(id);
			try {
				if(pw !=null) {
					pw.println(userID+"님의 귓속말 : "+msg2);
					pw.flush();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void broadcast(String msg) {
		synchronized(hm) {
			try {
				for(PrintWriter pw : hm.values()) {
					pw.println(msg);
					pw.flush();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
