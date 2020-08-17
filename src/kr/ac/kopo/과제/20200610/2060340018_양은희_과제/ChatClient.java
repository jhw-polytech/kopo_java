package chatProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ChatClient {

	String user_id;
	String ipAddress;
	String sendMsg;
	BufferedReader br;
	PrintWriter pw;
	boolean end = false;
	Socket client;

	public ChatClient(String id, String ip) {

		// Arguments에 사용자의 id를 미리 지정해두었다.
		user_id = id;
		ipAddress = ip;
		try {
			System.out.println("$ java ChatClient " + id + " " + ip);
			System.out.println("당신의 id는 " + id + "입니다. " + id + "뒤에 덧붙일 닉네임을 입력한 후 채팅을 시작해주세요.");
			client = new Socket(ipAddress, 10001);

			// 서버에 전송할 메세지를 키보드로 입력받는 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			// 키보드로 입력받은 메세지를 서버에 전송할 객체
			pw = new PrintWriter(client.getOutputStream());
			
			// 서버에서 보내준 메세지를 수신할 객체
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			pw.print(user_id);
			pw.flush();

			ReceiveThread rt = new ReceiveThread(client, br);
			Thread t = new Thread(rt);
			t.start();

			while (true) {
				sendMsg = keyboard.readLine();
				pw.println(sendMsg);
				pw.flush();

				if (sendMsg.equals("quit")) {
					end = true;
					break;
				}
			}
			System.out.println("채팅방을 종료합니다.");
			System.exit(0);

		} catch (Exception e) {
			if (!end)
				e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				client.close();
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		if (args.length != 2) {

			System.out.println("----------------------------------------------------");

			System.out.println("  사용법이 잘못되었습니다");

			System.out.println("  사용법 :  java EchoClientMain  서버IP  접속PORT번호");

			System.out.println("----------------------------------------------------");

			System.exit(0);

		}
		new ChatClient(args[0], args[1]);
	}
}