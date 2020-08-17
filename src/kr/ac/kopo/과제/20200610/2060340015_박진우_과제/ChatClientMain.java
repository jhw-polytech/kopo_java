package kr.ac.kopo.day18.homework.chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class ClientSendThread extends Thread {
	
	public Socket socket = null;
	public String nickname = null;
	public BufferedReader keyboard = null;
	
	public ClientSendThread(Socket socket, BufferedReader br, String nickname) {
		keyboard = br;
		this.socket = socket;
		this.nickname = nickname;
	}

	@Override
	public void run() {
		
		try {
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println(nickname);
			pw.flush();
			
			while(true) {
			
//				System.out.print("전송할 메시지를 입력하세요(quit 입력 시 종료) : ");
				String msg = keyboard.readLine();
					
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료...");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

class ClientReceiveThread extends Thread {
	
	public Socket socket;

	public ClientReceiveThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String echoMsg = br.readLine();
			System.out.println("\t" + echoMsg);
			
			while(true) {
				
				echoMsg = br.readLine();
				System.out.println("\t" + echoMsg);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class ChatClientMain {
	
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("----------------------------------");
			System.out.println("  사용법이 잘못되었습니다.");
			System.out.println("  사용법  : java EchoClientMain NickName serverIP");
			System.out.println("----------------------  -----------");
			System.exit(0);
		}
		
		String serverIP = args[1];

		int port = 10005;
		
		try {
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			String nick = args[0];
			Socket socket = new Socket(serverIP, port);
			
			ClientReceiveThread rt = new ClientReceiveThread(socket);
			rt.start();
			
			ClientSendThread st = new ClientSendThread(socket, keyboard, nick);
			st.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
