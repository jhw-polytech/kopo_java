package kr.ac.kopo.day18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * Reciever는 일종의 서버역할
 */

public class RecieverMain {

	public static void main(String[] args) {

		try {
			// Reciever는 일종의 서버역할 >> 포트 하나를 열어줘야 함
			DatagramSocket socket = new DatagramSocket(10002);
			System.out.println("[수신 시작]");

			byte[] buf = new byte[100];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);

			while (true) { //메시지 받아오기 반복
				socket.receive(packet);
				String msg = new String(packet.getData());
				System.out.println("[수신된 내용] : " + msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
