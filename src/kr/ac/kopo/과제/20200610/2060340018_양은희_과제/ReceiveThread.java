package chatProject;

import java.io.BufferedReader;
import java.net.Socket;

public class ReceiveThread extends Thread {

	Socket client;
	BufferedReader br;
	String receiveMsg;

	public ReceiveThread(Socket s, BufferedReader br) {
		client = s;
		this.br = br;
	}

	@Override
	public void run() {
		try {
			while ((receiveMsg = br.readLine()) != null)
				System.out.println(receiveMsg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				client.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
