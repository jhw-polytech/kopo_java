package homework0614;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class DataSet extends Thread {
	Socket client;
	BufferedReader br;
	String receiveData;
	public DataSet(Socket s, BufferedReader ois){ 
		client = s;
		this.br = ois;
	}
  public void run(){
	try{
		while( ( receiveData = br.readLine() ) != null ) System.out.println( receiveData );
	}catch(Exception e){  
		e.printStackTrace();  
    }
    finally{
		try{
			br.close();
			client.close();  
		}catch(IOException e2){
			e2.printStackTrace();
		}
    }
  }
}