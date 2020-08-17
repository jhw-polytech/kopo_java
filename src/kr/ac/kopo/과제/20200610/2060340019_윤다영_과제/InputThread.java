package kr.ac.kopo.assignment.chat;

import java.io.BufferedReader;
import java.net.Socket;

public class InputThread extends Thread {
	
	private Socket sock = null;
    private BufferedReader br = null;
    
    public InputThread(Socket sock,BufferedReader br) {
        this.sock = sock;
        this.br = br;
    }
    public void run() {
        try {
        	String line = null;
        	while((line = br.readLine()) != null) {
        		
        		System.out.println(line);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                    br.close();
                    sock.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




}
