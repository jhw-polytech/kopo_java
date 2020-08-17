package shlee1993.day16.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattingClient {
	public static void main(String[] args) {
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		if(args.length != 1) {
            System.out.println("사용법 : java ChattingClient id입력");
            System.exit(0);
        }
		
		try {
			// socket = new Socket(args[1], 10001);//포트
			socket = new Socket("127.0.0.1", 10001);
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("[" + args[0] + "] 님 반갑습니다");
			
			pw.println(args[0]);
			pw.flush();
			
			ChattingClientThread client = new ChattingClientThread(socket, br);
			
			client.start();
			
			String line = null;
			while ((line = bf.readLine()) != null) {
				pw.println(line);
				pw.flush();
				
				
				if (line.equalsIgnoreCase("quit")) {	//대소문자 구별 없이 quit를 입력시 문구를 출력 후 종료
					System.out.println("클라이언트 접속 종료");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}