package kr.ac.kopo.day17.homework;

import java.net.ServerSocket;
import java.net.Socket;

/*
 	클라이언트의 접속을 기다리고 있다가
 	accept()하고 소켓을 반환해주는 서버의 문지기 클래스
 */

public class MultiChatServerGatekeeper extends Thread {

	private int portNo;

	public MultiChatServerGatekeeper(int portNo) {
		this.portNo = portNo;
	}

	@Override
	public void run() {

		try (
				ServerSocket server = new ServerSocket(portNo);
		) {
			Socket client = server.accept();
			MultiChatServerUtil serverUtil = new MultiChatServerUtil();
			serverUtil.start(client);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
