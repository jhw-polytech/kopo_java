package hw.hw16.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * java EchoServerMain 10002 이렇게 시작하게
 */

class Threadserver extends Thread {
	private Socket sock;

	public Threadserver(Socket sock) {
		this.sock = sock;
	}

	public void run() {
		try(InputStream is = sock.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				OutputStream os = sock.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw);) {

			InetAddress inet = sock.getInetAddress();
			System.out.println("접속된 클라이언트의 정보 : [ " + inet.getHostAddress() +"-"+inet.getAddress()+ " ]");

			
			while(true) {
				String msg = br.readLine();
				if(msg==null) {
					System.out.println("클라이언트 [ "+inet.getHostAddress()+"-"+inet.getAddress()+" ]과의 접속 해제");
					//inet.close();
					break;
				}
				
				System.out.println("["+inet.getHostAddress()+"-"+inet.getAddress()+"] : "+msg);
				
				pw.println(msg);
				pw.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class EchoMultiServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("클라이언트의 접속을 기다립니다. ");

			while (true) {
				Socket sock = server.accept();
				Threadserver ts = new Threadserver(sock);
				ts.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
