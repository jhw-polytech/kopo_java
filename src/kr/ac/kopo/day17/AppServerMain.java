package kr.ac.kopo.day17;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1000번대 포트는 벤더회사들이 쓰고있는 경우가 많기 때문에 혹여 충돌이 날 수 있으므로, 10000번대를 사용하길 추천
 * 
 */

public class AppServerMain {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10000); // 10000은 port
			System.out.println("애플리케이션 서버 구동 ...");

			Socket client = server.accept(); // 클라이언트가 올 때까지 대기하는 역할
			System.out.println("접속된 클라이언트 정보: " + client);
//			System.out.println("로컬 socket port : " + client.getLocalPort());
//			System.out.println("클라이언트 socket port  : " + client.getPort());
//			System.out.println("클라이언트 socket ip : " + client.getInetAddress().getHostAddress());
			
			String msg = "이상현 바보바보";
			OutputStream os = client.getOutputStream(); // Socket 클래스에 OutputStream 객체를 넘기는 getOutputStream() 메소드가 존재한다.
			DataOutputStream dos = new DataOutputStream(os); // DataOutputStream은 기본자료형을 날리는 출력
			dos.writeUTF(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
