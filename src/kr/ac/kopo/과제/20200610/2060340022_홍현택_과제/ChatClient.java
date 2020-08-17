package Exam_0614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class ChatClient {

	static final int portNo = 10002;
	String ipAddress;
	Socket client = null;
	String sendData;
	String reveiveData;
	String userId;
	ReceiveDataThread rt;
	BufferedReader br;
	PrintWriter pw;
	boolean endflag = false;
	BufferedReader keyboard;
	OutputStream os ;
	InputStreamReader isr;

	public ChatClient(String id, String ip) {
		ipAddress = ip;
		userId = id;

		try {
			System.out.println("********클라이언트********");
			System.out.println("채팅을 시작합니다.(q 입력시 종료)");
			Socket client = new Socket(ipAddress, portNo);

			// 서버에 전송할 메세지를 키보드로 입력받는 객체
			keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			os = client.getOutputStream();
			pw = new PrintWriter(os);

			// 서버에서 보내준 메세지를 수신할 객체
			isr = new InputStreamReader(client.getInputStream());
			br = new BufferedReader(isr);
			
			//수정
			
			pw.println(userId);
			pw.flush();
			
			rt = new ReceiveDataThread(client, br);
			Thread t = new Thread(rt);
			t.start();
			
			

			while (true) {
				sendData = keyboard.readLine();

				pw.println(sendData);
				pw.flush();

				if (sendData.equalsIgnoreCase("/q")) {
					endflag = true;
					break;
				}
			}
			System.out.println("서버와의 접속종료...");
			System.exit(0);

		} catch (Exception e) {
			if(!endflag) e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				client.close();
				System.exit(0);
			} catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.print("USAGE : java  ChatClient  사용자_id  서버_ip");
			System.exit(0);
		}
		new ChatClient(args[0], args[1]);
	}
}
