package Test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoChattingServerMain {
   public static void main(String[] args) {
      try {
         ServerSocket server = new ServerSocket(10003);
         System.out.println("채팅 서버 프로그램을 가동합니다.");
         while(true) {
            Socket client = server.accept();
            Talker talker = new Talker(client);
            talker.start();
         }
      } catch (IOException e) {        
         e.printStackTrace();
      }
   }
}

class Talker extends Thread{
   
   private Socket client;
   
   public Talker(Socket client) {
      this.client = client;
   }
   
   @Override
   public void run() {
      
      try (
    		  InputStream is = client.getInputStream();
    	      InputStreamReader isr = new InputStreamReader(is);
    	      BufferedReader br = new BufferedReader(isr);
    		  
    		  OutputStream os = client.getOutputStream();
    	      OutputStreamWriter osr = new OutputStreamWriter(os);
    	      PrintWriter pw = new PrintWriter(osr);
    		  
    		  ){
      
      while(true) {
         String msg = br.readLine();
         if(msg==null) {
            System.out.println("클라이언트의 접속을 해제 ( " + client.getInetAddress()+")");
            client.close();
            break;
         }else {
            System.out.println(client.getInetAddress()+"님 접속하셨습니다.");
         }
         System.out.println(client.getInetAddress()+"님이 보낸 메세지 : "+msg);
         
         pw.println(msg);
         pw.flush();
         
      }
      }catch(Exception e) {
         e.printStackTrace();
      }
   
   }
}
