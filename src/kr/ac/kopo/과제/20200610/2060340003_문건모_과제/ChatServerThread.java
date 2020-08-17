package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;

public class ChatServerThread  implements Runnable{

	Socket child;
	BufferedReader br;
	PrintWriter pw;
	String userid;
	HashMap<String, PrintWriter> hashmap;
	InetAddress ip;
	String msg;
	
	public ChatServerThread(Socket child, HashMap<String, PrintWriter> hashmap) {
		this.child = child;
		this.hashmap = hashmap;
		
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(child.getInputStream()));
				PrintWriter pw = new PrintWriter(child.getOutputStream());
				){
			
			userid = br.readLine();
			ip = child.getInetAddress();
			System.out.println(ip + "에서" + userid + "님이 접속하였습니다.");
			broadcast(userid + "님이 접속하였습니다");
			
			synchronized(hashmap) {
				hashmap.put(userid, pw);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	@Override
	public void run() {
		String receiveData;
		
		try {
			while((receiveData = br.readLine()) != null) {
				
				if(receiveData.equals("quit")) {
					synchronized(hashmap) {
						hashmap.remove(userid);
					}
					
					break;
				} else {
					broadcast(userid + " : " + receiveData);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			synchronized(hashmap) {
				hashmap.remove(userid);
			}
			
			broadcast(userid + "님이 퇴장했습니다");
			System.out.println(userid + "님이 퇴장했습니다");
			
			try {
				if(child != null) {
					br.close();
					pw.close();
					child.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void broadcast(String msg) {
		synchronized(hashmap) {
			try {
				for(PrintWriter pw : hashmap.values()) {
					pw.println(msg);
					pw.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
