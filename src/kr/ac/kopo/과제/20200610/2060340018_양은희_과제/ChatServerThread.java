package chatProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

public class ChatServerThread extends Thread {

	String user_id;
	String msg;

	Socket client;
	HashMap<String, PrintWriter> hm;
	BufferedReader br;

	public ChatServerThread(Socket s, HashMap<String, PrintWriter> h) {
		client = s;
		hm = h;

		try {
			
			//클라이언트가 전송해준 메세지를 수신할 객체
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// 수신한 메세지를 클라이언트에게 재전송할 객체
			PrintWriter pw = new PrintWriter(client.getOutputStream());

			user_id = br.readLine();
			System.out.println("접속한 사용자의 아이디는 " + user_id +"입니다.");
			broadcast("[" + user_id + "]님이 접속하셨습니다.");

			synchronized (hm) {
				hm.put(user_id, pw);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String receiveMsg;

		try {
			while ((receiveMsg = br.readLine()) != null) {
				if (receiveMsg.equals("quit")) {
					synchronized (hm) {
						hm.remove(user_id);
					}
					break;
				}

				else if (receiveMsg.contains("/to")) {	// 귓속말을 걸 땐 "/to 닉네임 메세지"의 형식을 가져야한다.
					sendMsg(receiveMsg);
				} else {
					System.out.println("["+ user_id + "] : " + receiveMsg);
					broadcast("["+ user_id + "] : " + receiveMsg);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			synchronized (hm) {
				hm.remove(user_id);
			}
			broadcast(user_id + "님이 퇴장하셨습니다.");
			System.out.println(user_id + "님이 퇴장하셨습니다.");
		}
	}

	public void broadcast(String msg) {
		synchronized (hm) {
			try {
				for (PrintWriter pw : hm.values()) {
					pw.println(msg);
					pw.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void sendMsg(String msg) {
		int begin = msg.indexOf(' ') + 1;	// 귓속말을 걸 땐 "/to 닉네임 메세지"의 형식을 가져야한다.
		int end = msg.indexOf(' ', begin);
		
		if(end != -1) {
			String id = msg.substring(begin, end);
			String message = msg.substring(end+1);
			PrintWriter pw = hm.get(id);
			
			try {
				if(pw != null) {
					pw.println(user_id + "님이 다음과 같은 귓속말을 보냈습니다. : "+ message);
					pw.flush();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
