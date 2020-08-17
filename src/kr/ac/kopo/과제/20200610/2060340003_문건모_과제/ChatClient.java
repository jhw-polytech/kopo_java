package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	private String ip;
	private static final int port = 9999;
	private Socket client;
	private String sendData;
	private String receiveData;
	private String userid;
	private ReceiveDataThread rt;
	private boolean end=false;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ChatClient(String userid, String ip) {
		this.userid = userid;
		this.ip = ip;
		
		try {
			
			System.out.println("---------------------------------");
			System.out.println("\t 클라이언트");
			System.out.println("---------------------------------");
			
			client = new Socket(ip,port);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			
			pw.println(userid);
			pw.flush();
			
			rt = new ReceiveDataThread(client, br);
			Thread th = new Thread(rt);
			th.start();
			
			while(true) {
				sendData = br.readLine();
				
				pw.println(sendData);
				pw.flush();
				
				if(sendData.equals("quit")) {
					end = true;
					break;
				}
			}
			
			System.out.println("클라이언트의 접속 종료");
			System.exit(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				client.close();
				System.exit(0);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("------------------------------------------------");
			System.out.println("   사용법이 잘못되었습니다");
			System.out.println("   사용법 : java EchoClientMain  서버IP  접속PORT번호");
			System.out.println("------------------------------------------------");
			System.exit(0);
		}
		
		new ChatClient(args[0], args[1]);
	}
	
	
	

}
