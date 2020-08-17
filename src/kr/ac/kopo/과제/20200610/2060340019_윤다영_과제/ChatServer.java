package kr.ac.kopo.assignment.chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChatServer {
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket sock = null;
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
        try {
            server = new ServerSocket(10001);
            System.out.println("접속을 기다립니다.");
            
            while(true) {
                sock = server.accept();
                ChatThread chatThread = new ChatThread(sock, hm);
                chatThread.start();
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
//        	try {
//				server.close();
//				sock.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
        }
    }
}
 

