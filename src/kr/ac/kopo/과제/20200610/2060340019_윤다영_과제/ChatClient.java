package kr.ac.kopo.assignment.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("사용법 : java ChatClient id 접속할 서버 ip");
            System.exit(1);
        }
        Socket sock = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        
        try {
            sock = new Socket(args[1], 10001); 		//localhost
            //키보드로 입력받은 메세지를 서버에 전송할 객체
            pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
            //서버에서 보내준 메세지를 수신할 객체
            br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            //서버에 전송할 메세지를 키보드로 입력받는 객체
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            
            //id 넘겨줌
            pw.println(args[0]);
            pw.flush();
            
            InputThread it = new InputThread(sock,br);
            
            it.start();
            
            String line = null;
            
            while((line = keyboard.readLine()) != null) {
            	
            	pw.println(line);
            	pw.flush();
            	
            	if(line.equalsIgnoreCase("quit")) {
            		System.out.println("서버와의 접속 종료...");
            		
            		break;
            	}
            }
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
            	br.close();
            	pw.close();
            	sock.close();
            	                
                
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
 
