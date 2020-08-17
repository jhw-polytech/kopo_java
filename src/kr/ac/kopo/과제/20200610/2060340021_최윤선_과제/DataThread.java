package chatting;
import java.net.*;

import java.io.*;



class DataThread implements Runnable{

	Socket client;
	BufferedReader ois;
	String receiveData;


	public DataThread(Socket sock, BufferedReader ois){ 
		client = sock;
		this.ois = ois;
	}

  

  public void run(){
	try{
		while( ( receiveData = ois.readLine() ) != null ) System.out.println( receiveData );
	}catch(Exception e){  
		e.printStackTrace();  
    }
    finally{
		try{
			ois.close();
			client.close();  
		}catch(IOException e2){
			e2.printStackTrace();
		}
    }
  }
}