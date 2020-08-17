package kr.ac.kopo.day18.homework;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

import kr.ac.kopo.util.FileClose;

public class MultichatServer {
	HashMap clients;
	private DataInputStream in;
	
	MultichatServer(){
		clients = new HashMap();
		Collections.synchronizedMap(clients);	// clients 동기화
		
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(10002);
			System.out.println("서버가 시작되었습니다.");

			while(true) {
				String name ="";
				socket = serverSocket.accept();
				in = new DataInputStream(socket.getInputStream());
				name = in.readUTF();
				System.out.println("접속한 사용자의 아이디는 "+name+"입니다.");
				ServerThread thread = new ServerThread(socket, clients);
				thread.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(in);
		}
	}

}
