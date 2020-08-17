package homework0614;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		try {
			System.out.println("$ java ChatClient");
			System.out.println("사용자 아이디를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			String userID=sc.nextLine();
			Socket socket = new Socket("localhost", 10001);
			
			//서버에 전송할 메세지를 키보드로 입력받는 객체
			//System.in은 InputStream을 출력하기 때문에 해당 객체로 생성, 이후 buffered reader로 필터 클래스 입힘
			
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			//키보드로 입력받은 메세지를 서버에 전송할 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osr);
			
			//서버에서 보내 준 메세지를 수신할 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			DataSet dataSet = new DataSet(socket, br);
			dataSet.start();
			
			System.out.println("메세지 전송을 시작합니다.");
			while(true) {
				String msg = keyboard.readLine(); //buffered reader 객체에서 한 줄을 입력 받는 것
				if(msg.equalsIgnoreCase("quit")){
					System.out.println("접속 종료");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
