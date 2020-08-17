package kr.ac.kopo.day17.homework.echoServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class PrintAndRemoveClient extends Thread {

	private List<Socket> clientList;
	private Socket client;

	public PrintAndRemoveClient(List<Socket> list, Socket client) {
		this.clientList = list;
		this.client = client;
	}

	@Override
	public void run() {

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		// 수신할 메세지를 클라이언트에게 재전송할 객체
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		try {
			is = client.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os = client.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			while (true) {
				String msg = br.readLine();

				if (msg == null) {
					System.out.println("클라이언트 [" + client.getInetAddress() + "] 과의 접속해제");
					client.close();
					clientList.remove(client);
					break;
				}

				System.out.println("[" + client.getInetAddress() + "] : " + msg);

				pw.println(msg);
				pw.flush();
			}

		} 
		catch (SocketException s) {
			System.out.println("클라이언트 [" +  client.getInetAddress() + "] 과의 접속해제");
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			clientList.remove(client);
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(br);
			FileClose.close(isr);
			FileClose.close(is);
			
			FileClose.close(pw);
			FileClose.close(osw);
			FileClose.close(os);
		}

	}
}
