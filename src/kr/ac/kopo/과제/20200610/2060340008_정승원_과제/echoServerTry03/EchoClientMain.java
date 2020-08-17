package kr.ac.kopo.day19.echoServerTry03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * 귓속말 도전...
 * @author seung
 *
 */
/*
 	java EchoClientMain 172.16.88.129 10001
 */

public class EchoClientMain{

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("------------------------");
			System.out.println("사용법 : java EchoServerMain 서버ip 접속port번호");
			System.out.println("------------------------");
			System.exit(0);
		}
		
		String serverIp = args[0];
		int portNo = Integer.parseInt(args[1]);
		
		try {
			
			Socket socket = new Socket(serverIp, portNo);

			BufferedReader keyboard 
								= new BufferedReader(new InputStreamReader(System.in));

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os); // filter
			PrintWriter pw = new PrintWriter(osw);
			
			InputStream is = socket.getInputStream(); // is를 가져온다.
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");	 // utf-8로 변환해준다.
			
			BufferedReader br = new BufferedReader(isr); // 빠르게 받아오도록 filter 한다.
			System.out.println("접속할 ID를 입력하세요.");
			String id = keyboard.readLine();
			System.out.println("접속한 사용자의 아이디는 [ "+id+" ] 입니다.");
			pw.println(id);
			
			while (true) {
				Thread.sleep(1000);
				
				System.out.println("전송할 메세지를 입력하세요. (q) 입력시 종료 ****"
						+ "귓속말을 보내고 싶다면 to를 입력하세요!");
				// 무조건 뭔가 받아야 다음이 읽어지는구나
				String msg = keyboard.readLine();
				if(msg.equalsIgnoreCase("q")) { // 대소문자상관x
					System.out.println("서버와의 접속 종료");
					socket.close(); // 종료
					break;
				}
				
				if(msg.equalsIgnoreCase("to")) {
					System.out.println("귓속말 요청입니다.");
					System.out.println("보내실 분의 ID를 입력하세요!");
					String toId =  keyboard.readLine();
					System.out.println("대화내용을 입력하세요.");
					String wisper =  keyboard.readLine();
					pw.println("/to");
					pw.println(toId);
					pw.println(wisper);
					
				} else {
					pw.println("/");
					pw.println("/");
					pw.println(msg);
				}
				pw.flush();
				String check = br.readLine(); // 귓속말인지 체크용
//				System.out.println(check);
				String serverBackMsg = br.readLine(); // 리시버
//				System.out.println(serverBackMsg);

				if (check.equals("/to")) {
					System.out.println(serverBackMsg);
				} else {
					System.out.println("내가 보낸 메세지입니다. :"+serverBackMsg);

				}
				
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
