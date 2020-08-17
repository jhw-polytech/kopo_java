package kr.ac.kopo.day18.homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerThread extends Thread{

	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private HashMap clients;

	public ServerThread(Socket socket, HashMap clients){
		this.socket = socket;
		this.clients = clients;
		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String name = "";

		try {
			name = in.readUTF();
			sendToAll("#"+name+"님이 들어오셨습니다.");

			clients.put(name, out);
			System.out.println("현재 서버접속자 수는 "+clients.size()+"입니다.");
			while(in!=null) {
				String msg = in.readUTF();
				if(msg.contains("/quit")) {
					removeClient(name);
				}
				else if (msg.contains("/to")){
					int index = msg.indexOf(' ');	//      [/to], [이름] 사이의 공백 index return
					int index2 = msg.indexOf(' ',index+1); // [이름], [보낼 귓속말] 사이의 공백 index return
					String toName = msg.substring(index+1,index2);
					String whisperMsg = "(["+name+"]님이 귓속말을 보냈습니다)"+ msg.substring(index2+1);
					whisper(toName, name,whisperMsg);
				}else {
					sendToAll(msg);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();

		while(it.hasNext()) {
			try {

				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void removeClient(String name) {

		System.out.println("["+name+"]님이 접속을 종료했습니다.");
		DataOutputStream out = (DataOutputStream)clients.get(name);
		try {
			out.writeUTF("/quit"); // sender가 quit를 보내면 receiver도 알 수 있게 receiver에 알려줌
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			clients.remove(name);
			sendToAll("#"+name+"님이 나가셨습니다.");
			System.out.println("현재 서버접속자 수는 "+clients.size()+"입니다.");
		}
	}
	public void whisper(String toName, String fromName ,String msg) {
		
		try {
			if(clients.get(toName)!=null) {
				DataOutputStream out = (DataOutputStream)clients.get(toName);
				out.writeUTF(msg);
			}
			else {
				msg = "["+toName+"]님은 현재 채팅방에 없습니다";
				DataOutputStream out = (DataOutputStream)clients.get(fromName);
				out.writeUTF(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
