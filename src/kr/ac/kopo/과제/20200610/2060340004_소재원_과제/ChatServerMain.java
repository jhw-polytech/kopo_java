package kr.ac.kopo.day20.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServerMain {

	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br; 
	private PrintWriter pw;
	private Map<String, ClientVO> cMap = new HashMap<String, ClientVO>();
	private List<String> msgQueue = new ArrayList<String>();
	private String nickName;

	public void setting() {
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("============== 채팅방 서버 구동 ==============");

			while(true) {
				
				socket = serverSocket.accept();
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));		
				pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				nickName = br.readLine();
				
				System.out.println("[ IP : " + socket.getInetAddress().getHostAddress() + ", 닉네임 : " + nickName + " ] 접속");
				msgQueue.add("[" + nickName + "] 님이 입장하셨습니다.");
				cMap.put(nickName, new ClientVO(nickName, socket, pw));
		
				Thread sSenderThread = new Thread(new ServerSender(cMap, msgQueue));
				sSenderThread.start();
				
				Thread sReceiverThread = new Thread(new ServerReceiver(nickName, cMap, msgQueue));
				sReceiverThread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		
		ChatServerMain chatServer = new ChatServerMain();
		chatServer.setting();
	}

}
