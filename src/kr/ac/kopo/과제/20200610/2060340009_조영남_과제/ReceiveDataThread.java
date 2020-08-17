package kr.ac.yeongnam.day18.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

class ReceiveDataThread implements Runnable{
	Socket client;
	BufferedReader br;
	String receiveData;

	public ReceiveDataThread(Socket socket, BufferedReader br){ 
		client = socket;
		this.br = br;
	}
  
  public void run(){
	try{
		
		while((receiveData = br.readLine() ) != null) System.out.println(receiveData);
	}catch(Exception e){  
		e.printStackTrace();  
    }
    finally{
		try{
			br.close();
			client.close();  
		}catch(Exception e2){
			e2.printStackTrace();
		}
    }
  }
}
