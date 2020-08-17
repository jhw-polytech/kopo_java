package kr.ac.kopo.day17.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import kr.ac.kopo.day17.homework.util.FileClose;
import kr.ac.kopo.day17.homework.util.SocketClose;

/*
 	java EchoServerMain 10001
 */

public class MultiEchoServerThread extends Thread{

	Socket socket;
	public MultiEchoServerThread(Socket socket){
		this.socket = socket; 
	}
	public void run() {

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;

		try {
			System.out.println("["+socket.getInetAddress().getHostAddress()+"]님이 접속하셨습니다");

			// 클라이언트가 전송해준 메시지를 수신할 객체
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			// 수신한 메시지를 클라이언트에게 재전송할 객체
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);

			while(true) {
				String msg = br.readLine();
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("클라이언트 ["+socket.getInetAddress()+"]과의 접속해제");
					break;
				}
				System.out.println("["+socket.getInetAddress()+"] 보낸 메세지 : "+msg);

				pw.println(msg);
				pw.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			SocketClose.close(socket);
			FileClose.close(br,pw);
			FileClose.close(isr,osw);
			FileClose.close(is,os);

		}
	}

}
