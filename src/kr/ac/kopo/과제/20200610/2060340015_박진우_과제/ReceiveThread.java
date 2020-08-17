package kr.ac.kopo.day18.homework.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.Map;

import kr.ac.kopo.util.FileClose;

public class ReceiveThread extends Thread {

	private final int conn = 1;
	private final int disconn = 2;
	private final int send = 3;
	private final int whisper = 4;

	private List<String> msgQueue;
	private Socket client;
	Map<String, ClientVO>  clientMap = null;
	
	String nick;
	
	public ReceiveThread(Map<String, ClientVO> clientMap, List<String> queue, Socket client) {
		this.clientMap = clientMap;
		this.client = client;
		this.msgQueue = queue;
	}
	
	public void sendMsg(String msg, int stat, String receiver) {
		
		String str = null;
		
		if(stat == conn) {
			str = "[ " + nick + " ] 님이 접속하셨습니다.";
		}
		else if(stat == disconn) {
			str = "[ " + nick + " ] 님이 나갔습니다.";
		}
		else if(stat == send){
			str = "[ " + nick + " ] : " + msg;
		}
		else if(stat == whisper){
			str = String.valueOf((char)8)/*backspace*/+ receiver + "[ " + nick + " 님의 귓속말 : ] : " + msg;
		}
		msgQueue.add(str);
	}

	@Override
	public void run() {

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			
			is = client.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			String receiver = null;
			nick = br.readLine();
			PrintWriter ptw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
			
			clientMap.put(nick, new ClientVO(client, ptw));
			
			sendMsg("", conn, "");
			
			while (true) {
				
				String msg = br.readLine();

				if (msg == null) {
					
					sendMsg("", disconn, null);
					
					
					clientMap.get(nick).getPw().close();
					clientMap.get(nick).getSocket().close();
					client.close();
					
					clientMap.remove(nick);
					break;
				}
				
				int stat = send;
				
				if(msg.length() > 4) {
					System.out.println(msg.substring(0,4));
					if(msg.substring(0,4).equals("/to ")) {
						// 메시지 가공
						String[] splitMsg = msg.substring(4, msg.length()).split(" ", 2);
						receiver = splitMsg[0];
						msg = splitMsg[1];
						stat = whisper;
					}
				}
				
				sendMsg(msg, stat, receiver);

			}

		} 
		catch (SocketException s) {
			
			sendMsg("", disconn, null);
			try {
				clientMap.get(nick).getPw().close();
				clientMap.get(nick).getSocket().close();
				clientMap.remove(nick);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(br);
			FileClose.close(isr);
			FileClose.close(is);
			
		}

	}
}
