package multiChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultichatServer {

	//서버에 접속한 클라이언트를 HashMap에 저장하여 관리
	HashMap clients;
	
	MultichatServer(){
		clients = new HashMap();
		Collections.synchronizedMap(clients); //동기화
	}

	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(10001);
			System.out.println("서버 시작");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() +"]에서 접속");
				
				//클라이언트가 추가될 때마다 ServerReceiver 쓰레드 생성
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	void send(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String args[]) {
		new MultichatServer().start();
	}
	
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket){
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {}
		}
		
		public void run() {
			String name = "";
			
			try {
				name = in.readUTF();
				send(name + "님 입장");
				
				clients.put(name, out);
				
				while(in != null) {
					send(in.readUTF());
				}
			} catch (Exception e) { 
			} finally {
				send(name + "님 퇴장");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] 에서 접속 종료");
			}
		}
	}
}
