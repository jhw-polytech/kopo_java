package kr.ac.kopo.day17.assignment;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread{
    private Socket client;
    public EchoThread(Socket client){
        this.client = client;
    }

	@Override
	public void run() {
		
		try {
			System.out.println("[" + client.getInetAddress().getHostAddress() + "]님 접속하였습니다");
			
			// 클라이언트가 전송해준 메세지를 수신할 객체
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// 서버가 클라이언트에게 받은 메세지를 재전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			while(true) {
				String msg = br.readLine();

				if(msg == null) {
					System.out.println("[" + client.getInetAddress().getHostAddress() + "]님 접속종료");
					client.close();
					break;
				}
				
				System.out.println("[" + client.getInetAddress().getHostAddress() + "] 보낸 메세지 : " + msg);

				pw.println(msg);
				pw.flush();
			}

			br.close();
			isr.close();
			is.close();
			pw.close();
			osw.close();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}	
}


public class EchoServerMain {

	public static void main(String[] args) {

		try {
			
			//애플리케이션 서버 구동
			ServerSocket server = new ServerSocket(10010);
			
			//클라이언트의 접속을 기다리기
			while(true) {
				Socket client = server.accept();
				EchoThread et = new EchoThread(client);
				et.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
