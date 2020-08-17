package kr.ac.kopo.day20.chatting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class ServerSender implements Runnable {

	   private Map<String, ClientVO> cMap = new HashMap<String, ClientVO>();
	   private List<String> msgQueue = new ArrayList<String>();
	   private StringTokenizer tokenizer;
	   private String sendUser, destUser, Message = "";
	   private StringBuffer sb;
	   public ServerSender(Map<String, ClientVO> cMap, List<String> msgQueue) {
	      this.cMap = cMap;
	      this.msgQueue = msgQueue;
	   }

	   @Override
	   public void run() {
	   
	      try {
	         while(true) {
	            Thread.sleep(100);
	            
	            if(msgQueue.size() > 0) {
	            	
					tokenizer = new StringTokenizer(msgQueue.get(0));

					sendUser = tokenizer.nextToken();
					tokenizer.nextToken(); // 세미콜론
					Message = tokenizer.nextToken();

					if (Message.equalsIgnoreCase("/to")) {

						destUser = tokenizer.nextToken();
						sb = new StringBuffer();
						int count = tokenizer.countTokens();

						for (int i = 0; i < count; i++) {
							sb.append(tokenizer.nextToken() + " ");
						}
						cMap.get(destUser).getPw("**[" + sendUser + "] 님이 보낸 귓속말 : " + sb);
						cMap.get(sendUser).getPw("[" + destUser + "] 에게 보낸 귓속말 : " + sb);
						msgQueue.remove(0);

	            	} else {
	            		Set<Entry<String, ClientVO>> entry = cMap.entrySet();
	            		for (Entry<String, ClientVO> info : entry) {
	            			info.getValue().getPw(msgQueue.get(0));
	            		}
	            		msgQueue.remove(0);
	            	}
	           }
	        }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	 }
}
