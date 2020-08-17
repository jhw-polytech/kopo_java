package kr.ac.kopo.day20.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerReceiver implements Runnable {

	private Map<String, ClientVO> cMap = new HashMap<String, ClientVO>();
	private List<String> msgQueue = new ArrayList<String>();
	private BufferedReader br;
	private String receiveMsg;
	private String nickName;
	
	public ServerReceiver(String nickName, Map<String, ClientVO> cMap, List<String> msgQueue) {

		this.nickName = nickName;
		this.cMap = cMap;
		this.msgQueue = msgQueue;
	}

	@Override
	public void run() {
		
		try {
			while (true) {
				br = new BufferedReader(new InputStreamReader(cMap.get(nickName).getSocket().getInputStream()));
				receiveMsg = br.readLine();
				if(receiveMsg.equals("/quit")) {
					br.close();
					cMap.get(nickName).getSocket().close();
					cMap.remove(nickName);
				}
				System.out.println(receiveMsg);
				msgQueue.add(receiveMsg);
			}
		} catch (Exception e) {
			msgQueue.add(nickName + "님이 채팅방을 나갔습니다.");
		}
	}
}
