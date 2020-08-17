package chatting;

import java.io.BufferedReader;
import java.io.Reader;
import java.net.Socket;

public class ReceiveDataThread implements Runnable {

	Socket client;
	BufferedReader br;
	String receiveData;
	
	public ReceiveDataThread(Socket client,BufferedReader ois) {
		this.client = client;
		this.br = br;
	}
	
	@Override
	public void run() {
		
		try {
			
			while((receiveData = br.readLine()) != null) {
				System.out.println(receiveData);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			
			try {
				br.close();
				client.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
