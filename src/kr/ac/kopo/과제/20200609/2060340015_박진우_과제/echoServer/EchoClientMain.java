package kr.ac.kopo.day17.homework.echoServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("----------------------------------");
			System.out.println("  사용법이 잘못되었습니다.");
			System.out.println("  사용법  : java EchoClientMain ServerIP PortNo");
			System.out.println("----------------------------------");
			System.exit(0);
		}
		
		String serverIP = args[0];
		int port = Integer.parseInt(args[1]);
		
		try {
			Socket socket = new Socket(serverIP, port);
			
			// 서버에 전송할 메시지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			// 키보드로 입력받은 메시지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			// 서버에서 보내준 세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				System.out.print("전송할 메시지를 입력하세요(quit 입력 시 종료) : ");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료...");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
				
				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메시지는 : [ " + echoMsg + " ]");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
