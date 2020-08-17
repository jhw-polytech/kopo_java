package Exam_0614;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ReceiveDataThread implements Runnable {
	Socket client;
	BufferedReader br;
	String receiveData;

	public ReceiveDataThread(Socket s, BufferedReader br) {
		client = s;
		this.br = br;
	}

	public void run() {
		try {
			while ((receiveData = br.readLine()) != null)

				System.out.println(receiveData);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				client.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
