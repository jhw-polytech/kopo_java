package kr.ac.kopo.day20.chatting;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientVO {

	private String nickName;
	private Socket socket;
	private PrintWriter pw;
	
	public ClientVO() {
		
	}

	public ClientVO(String nickName, Socket socket, PrintWriter pw) {
	
		this.nickName = nickName;
		this.socket = socket;
		this.pw = pw;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Socket getSocket() {
		return socket;
	}
	
	public void getPw(String msg) {
		try {
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			pw.println(msg);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
