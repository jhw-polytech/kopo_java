package kr.ac.kopo.day17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println("내 컴퓨터의 네트워크 이름: " + localhost.getHostName());
			System.out.println("내 컴퓨터의 IP 정보: " + localhost.getHostAddress());
			
			InetAddress addr = InetAddress.getByName("www.kopo.ac.kr");
			System.out.println("폴리텍 IP 정보 : " + addr);
			// 찍어보면 폴리텍 IP 정보 : www.kopo.ac.kr/112.76.2.124 라고 나오는데,
			// host name + ip 정보의 조합을 toString() 한 형태이다.
			// 보안이 철저한 곳은 막아놔서 이렇게 ip주소 따오지 못할 수도 있다.
			
			
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com"); // 여러 ip를 받아오므로 배열로 받아야 함
			System.out.println("=================================================");
			System.out.println("네이버 IP 정보 =>");
			System.out.println("=================================================");
			for(InetAddress a: addrs) {
				System.out.println(a);
			}
			System.out.println("=================================================");
			
		} catch (UnknownHostException e) {
			e.printStackTrace(); // catched exception을 갖고있음
		}
	}
}