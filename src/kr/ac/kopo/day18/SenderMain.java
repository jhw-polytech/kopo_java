package kr.ac.kopo.day18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class SenderMain {
	public static void main(String[] args) {
		try {

			// DatagramSocket도 Autoclosable 상속받았기 때문에
			DatagramSocket socket = new DatagramSocket();

			System.out.println("[송신 시작]");

			for (int i = 1; i <= 3; i++) {
				String msg = "메세지 - " + i;
				byte[] bytes = msg.getBytes(); // getBytes()는 메세지가 갖고있는 문자열들을 바이트로 바꿔준다.
				
				SocketAddress addr = new InetSocketAddress("172.16.88.129", 10002);	
				
				// DatagramPacket(buf, length, address)
				// buf: 바이트 배열. 어떤 형태의 데이터가 올지 모르므로 인자가 무조건 byte[] buf로 들어간다.
				// length: 포트번호
				// address: 소켓주소
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr);
				
				// 전송!
				socket.send(packet); // send(DatagramPacket p) > 데이터그램패킷 객체를 받아서 전송한다!
				System.out.println("전송한 데이터 크기: "+bytes.length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
