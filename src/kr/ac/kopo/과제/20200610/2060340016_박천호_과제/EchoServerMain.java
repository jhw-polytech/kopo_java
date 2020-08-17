package kr.ac.kopo.day18.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class EchoThread extends Thread{

	private Socket client;
	private static HashMap<String, PrintWriter> clientpw = new HashMap<String, PrintWriter>();


	public EchoThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		try (
				// 클라이언트가 전송해준 메세지를 수신할 객체가 필요함 inputstream 필요
				InputStream is = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);

				// 수신한 메세지를 클라이언트에게 재전송할 객체
				OutputStream os = client.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);
				)
		{
			// 닉네임을 입력 받아서 해당 클라이언트에게 출력할 PrintWriter와 함께 map에 저장	
			String msg = br.readLine();
			clientpw.put(msg, pw);

			//사용자 접속 알리기
			System.out.println("접속한 사용자의 아이디 : " + msg);
			for(String key: clientpw.keySet()) {
				//사용자들에게 전송
				clientpw.get(key).println("[" + msg + "]님이 접속했습니다.");
				clientpw.get(key).flush();
			}

			//메세지 입력 & 재전송 
			while(true) {
				msg = br.readLine();

				// 접속 종료
				if(msg == null) {
					System.out.println("클라이언트 [" + client.getInetAddress() + "] 과의 접속 해제");
					client.close();
					break; // System.exit(0);
				}

				//귓속말
				if(msg.startsWith("/to")) {
					String[] strs = msg.split("\\s+", 3);
					System.out.println(strs[0] + "/" + strs[1] + "/" + strs[2]);
					clientpw.get(strs[1]).println("[" + getkey(clinetpw, pw)
					+ "님이 귓속말을 보냈습니다] : " + strs[2]);
					clientpw.get(strs[1]).flush();

					//일반메세지 - 다른 사용자에게 보여야함	
				} else {
					for(String key: clientpw.keySet()) {
						//서버가 클라이언트에게 받은 메세지를 전송
						clientpw.get(key).println("[" + getkey(clinetpw, pw) + "]" + msg);
						clientpw.get(key).flush();
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	//value로 key찾기 -> 클라이언트의 아이디 찾으려고
	public <K, V> K getkey(HashMap<K, V> map, V value) {
		//찾을 hashmap과 주어진 value
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
	
}

public class EchoServerMain {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(11005);
			System.out.println("클라이언트의 접속을 기다립니다!");

			while(true) {
				Socket client = server.accept();
				System.out.println("접속된 클라이언트 정보  : [" + client.getInetAddress() + " ]");

				EchoThread et = new EchoThread(client);
				et.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
