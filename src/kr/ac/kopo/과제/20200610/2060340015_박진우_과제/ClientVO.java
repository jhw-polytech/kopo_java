package kr.ac.kopo.day18.homework.chat;

import java.io.PrintWriter;
import java.net.Socket;

public class ClientVO {
	
	private Socket socket = null;
	private PrintWriter pw = null;
	
	public ClientVO() {
		super();
	}

	public ClientVO(Socket socket, PrintWriter pw) {
		super();
		this.socket = socket;
		this.pw = pw;
	}
	
	public Socket getSocket() {
		return socket;
	}


	public void setSocket(Socket socket) {
		this.socket = socket;
	}


	public PrintWriter getPw() {
		return pw;
	}


	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}


	
}
