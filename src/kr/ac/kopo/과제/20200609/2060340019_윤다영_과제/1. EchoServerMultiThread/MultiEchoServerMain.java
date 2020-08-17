package kr.ac.kopo.assignment.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import kr.ac.kopo.util.FileClose;


class MultiEchoChat extends Thread{
	
    private Socket client;
    
    public MultiEchoChat(Socket sock){
        this.client = sock;
    }
    
    
    public void run(){
    	
    	InputStream is = null;
    	BufferedReader br = null;
    	
    	OutputStream os = null;
    	PrintWriter pw = null;
    	
    	
        try{
            InetAddress inetAddr = client.getInetAddress();
            System.out.println("["+inetAddr.getHostAddress() + "]님이 접속하였습니다.");
            
            is = client.getInputStream();
            br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            
            os = client.getOutputStream();
            pw = new PrintWriter(new OutputStreamWriter(os));
            
            
            while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("["+ client.getInetAddress().getHostAddress() + "]님이 접속을 종료했습니다.");
					client.close();
					break;
				}
				
				System.out.println("[" + client.getInetAddress().getHostAddress()+"]님이 보낸 메세지 : " + msg);
				pw.println(msg);
				pw.flush();
            }
           
                        
        }catch(Exception ex){
            System.out.println(ex);
        }finally {
        	FileClose.close(pw, os);
        	FileClose.close(br, is);
        	try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	
        }
    }

}


public class MultiEchoServerMain {

	public static void main(String[] args) {
		
	      if (args.length != 1) {
	         System.out.println("-------------------------------------------------------");
	         System.out.println("\t사용법 : java EchoServerMain port번호");
	         System.out.println("-------------------------------------------------------");
	         System.exit(0);
	      }
	      
	      int portNo = Integer.parseInt(args[0]);
	      ServerSocket server = null;
	      Socket socket = null;
	      
	       try{
	               server = new ServerSocket(portNo);
	               System.out.println("접속을 기다립니다.");
	               while(true){
	                   socket = server.accept();
	                   MultiEchoChat mec = new MultiEchoChat(socket);
	                   mec.start();
	               }
	           } catch (Exception e) {
	               e.printStackTrace();
	           }finally {
	        	  try {
	        		socket.close();
					server.close();					
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	   
	           }
       }
}

   
