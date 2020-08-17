package kr.ac.kopo.day17.homework;

public class MultiChatServerMain {
	

	public static void main(String[] args) {
		
		System.out.println("==============================================");
		System.out.println("    서버와의 접속을 시도합니다.");
		System.out.println("==============================================");

		
		if (args.length != 1) {
			System.out.println("-------------------------------------------------------");
			System.out.println("    port번호가 제대로 되어있는지 확인해주세요.");
			System.out.println("    사용법 : java EchoServerMain  port번호");
			System.out.println("-------------------------------------------------------");
			System.exit(0);
		}

		int portNo = Integer.parseInt(args[0]);

		try {
			System.out.println("==============================================");
			System.out.println("    서버와 접속합니다 . . .");
			System.out.println("==============================================");
			MultiChatServerGatekeeper gate = new MultiChatServerGatekeeper(portNo);
			gate.start();			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
