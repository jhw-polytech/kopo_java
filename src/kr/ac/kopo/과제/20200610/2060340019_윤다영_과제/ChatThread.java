package kr.ac.kopo.assignment.chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ChatThread extends Thread {
	

    private Socket sock;
    private String id;
//    private OutputStream os;
//    private OutputStreamWriter osw;
//    private PrintWriter pw;
//    private InputStream is;
//    private InputStreamReader isr;
    private BufferedReader br;
    private HashMap<String, Object> hm;
    
    public ChatThread(Socket sock, HashMap<String,Object> hm) {
        this.sock = sock;
        this.hm = hm;
        try {
        	PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(sock.getInputStream()));

            id = br.readLine();
            
            
            broadcast("[" + id + "]님이 접속했습니다");
            System.out.println("접속한 사용자의 아이디는 " + id + "입니다");
            
            synchronized (hm) {
                hm.put(this.id, pw);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void run() {
        try {
        	String line = null;
            while((line = br.readLine()) != null) {
            	
                if(line.equalsIgnoreCase("quit")) {
                	//client가 접속을 끊을때
                	System.out.println("채팅방을 종료합니다");
                    break;
                }
                if(line.indexOf("/to") == 0) {
                	//client가 귓속말을 보낼때
                    String[] toMsg = sendmsg(line);
                    System.out.println(id + "님이 " + toMsg[0] + "에게 귓속말을 보냈습니다 : " + toMsg[1]);
                }else {
                	//client 채팅
                	System.out.println("[" + id + "] : " + line);
                    broadcast("[" + id + "] : " + line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            synchronized (hm) {
                hm.remove(id);
            }
            System.out.println("["+ id + "]님이 접속을 종료했습니다");
            broadcast("["+ id + "]님이 접속을 종료했습니다");
            try {
                if(sock != null) {
                    sock.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public String[] sendmsg(String msg) {
        int start = msg.indexOf(" ") + 1;
        int end = msg.indexOf(" ",start);
        
        String[] toMsg = new String[2];
        
        if(end != -1) {
            toMsg[0] = msg.substring(start, end);
            toMsg[1] = msg.substring(end +1);
            Object obj = hm.get(toMsg[0]);
            if(obj != null) {
                PrintWriter pw = (PrintWriter)obj;
                pw.println("[" + id + "님이 귓속말을 보냈습니다] " + toMsg[1]);
                pw.flush();
            }
        }
        return toMsg;
    }
    
    
    public void broadcast(String msg) {
    	
        synchronized (hm) {
            Collection<Object> collection = hm.values();
            Iterator<?> iter = collection.iterator();
            while(iter.hasNext()) {
                PrintWriter pw = (PrintWriter)iter.next();
                pw.println(msg);
                pw.flush();
            }
        }
    }




}
