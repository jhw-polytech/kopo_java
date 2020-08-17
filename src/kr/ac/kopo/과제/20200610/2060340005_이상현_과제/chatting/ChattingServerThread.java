package shlee1993.day16.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ChattingServerThread extends Thread {
	private Socket socket;
	private String id;
	private BufferedReader br;
	private HashMap<String, PrintWriter> hm;

	public ChattingServerThread(Socket socket, HashMap<String, PrintWriter> hm) {
		this.socket = socket;
		this.hm = hm;
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			id = br.readLine();
			
			broadcast(id + "님이 접속하셨습니다.");
			System.out.println("접속한 사용자의 아이디 : " + id);
			synchronized (hm) {
				hm.put(this.id, pw);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.equals("quit")) {
					System.out.println(id + "님이 나갔습니다");
					break;
				}
				if (line.indexOf("/to") == 0) {	// "/to"로 시작할 경우(인덱스 0) 귓속말 시작
					sendMsg(line);
				} else {
					broadcast(id + " : " + line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			synchronized (hm) {
				hm.remove(id);
			}
			broadcast(id + "님이 접속을 종료했습니다.");
			try {
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void sendMsg(String msg) {	//귓속말 전송을 위한 메소드
		int start = msg.indexOf(" ") + 1;
		int end = msg.indexOf(" ", start);

		if (end != -1) {
			String to = msg.substring(start, end);
			String whisper = msg.substring(end + 1);

			if (hm.get(to) != null) {
				PrintWriter pw = hm.get(to);
				pw.println(id + "님의 귓속말 : " + whisper);
				pw.flush();
			}
		}
	}

	public void broadcast(String msg) {	//채팅 전송을 위한 메소드
		synchronized (hm) {
			Collection<PrintWriter> entry = hm.values();
			Iterator<PrintWriter> ite = entry.iterator();

			while (ite.hasNext()) {
				PrintWriter pw = (PrintWriter) ite.next();
				pw.println(msg);
				pw.flush();
			}
		}
	}
}
