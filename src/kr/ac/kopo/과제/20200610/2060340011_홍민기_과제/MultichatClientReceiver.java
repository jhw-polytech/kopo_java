package kr.ac.kopo.day18.homework;

import java.io.DataInputStream;
import java.net.Socket;

import kr.ac.kopo.util.FileClose;

public class MultichatClientReceiver extends Thread{

	private Socket socket;
	private DataInputStream in;

	public MultichatClientReceiver(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {

		try {
			while(true) {
				String msg = in.readUTF();
				
				if(msg.equalsIgnoreCase("/quit")) { // Sender가 quit를 보내면 서버에서 다시 recevier로 보내서 소켓 close
					socket.close();
					break;
				}
				System.out.println(msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(in);
		}
	} 
}

