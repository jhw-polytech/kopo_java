package kr.ac.kopo.day17.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import kr.ac.kopo.util.FileClose;
import kr.ac.kopo.util.SocketClose;

/*
 	java EchoClientMain 172.16.88.141 10001
 */

public class EchoClientMain {

	public static void main(String[] args) {

		if(args.length!=2) {
			System.out.println("------------------------------------------------------");
			System.out.println(" 사용법이 잘못되었습니다");
			System.out.println(" 사용법 : java EchoClientMain	서버IP	접속PORT번호");
			System.out.println("------------------------------------------------------");
			System.exit(0);
		}
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;

		String serverIP = args[0];
		int port = Integer.parseInt(args[1]);	// args 잘못됐을 때 처리하는 거 만들기

		Socket socket = null;

		try {
			socket = new Socket(serverIP,port);

			// 서버에 전송할 메시지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);

			// 서버에서 보내준 메세지를 수신할 객체
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while(true) {
				System.out.print("전송할 메세지를 입력하세요(quit입력시 종료) : "); 
				String msg = keyboard.readLine();
				pw.println(msg);
				pw.flush();
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속종료...");
					break;
				}
				
				
				String echoMsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : ["+echoMsg+"]");
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			SocketClose.close(socket);
			FileClose.close(br,pw);
			FileClose.close(isr,osw);
			FileClose.close(is,os);
		}
	}

}
