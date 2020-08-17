package shlee1993.day16.homework;

import java.io.BufferedReader;
import java.net.Socket;

public class ChattingClientThread extends Thread {
	private Socket socket = null;
	private BufferedReader br = null;

	public ChattingClientThread(Socket socket, BufferedReader br) {
		this.socket = socket;
		this.br = br;
	}

	public void run() {
		try {
			String line = null;
			while (((line = br.readLine()) != null)) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}