package kr.ac.yeongnam.day18.homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;

public class ChatSverThread implements Runnable
{
	Socket client;

	BufferedReader br;
	PrintWriter pw;
	
	String user;
	HashMap<String, PrintWriter> hm;
	InetAddress ip;
	String msg;

	public ChatSverThread(Socket socket, HashMap<String, PrintWriter> hm) {
		client = socket;
		this.hm = hm;

		try	{
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());

			user = br.readLine();
			ip = client.getInetAddress();
			System.out.println("접속한 사용자의 아이디는 " + user + "입니다." );
			broadcast("[" + user + "] 님이 접속했습니다.");

			synchronized(hm) {	
				hm.put(user, pw);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String receiveData;

		try{
			while((receiveData = br.readLine()) != null) {
				if( receiveData.equals( "/quit" ) ) {
					synchronized( hm ) {
						hm.remove( user );
					}
					break;
				}
				else if(receiveData.indexOf( "/to" ) >= 0) {
					sendMsg( receiveData );
				}
				else broadcast(user + " : " + receiveData);
			}
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			synchronized(hm) {
				hm.remove(user);
			}
			broadcast("[" + user + "]님이 접속을 종료했습니다.");
			System.out.println("[" + user + "]님이 접속을 종료했습니다.");
			try{
				if( client != null ) {
					br.close();
					pw.close();
					client.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void broadcast(String message){
		synchronized(hm) {
			try{
				for(PrintWriter oos : hm.values()){
				  oos.println(message);
				  oos.flush();
				}
			}catch(Exception e){ 
				e.printStackTrace();
			}
		}
	}

	public void sendMsg(String message){
		int begin = message.indexOf(" ") + 1;
		int end   = message.indexOf(" ", begin);

		if(end != -1){
			String id = message.substring(begin, end);
			String msg = message.substring(end+1);
			PrintWriter oos = hm.get(id);
			try{
				if(oos != null){
					oos.println("[" + user + "님이 다음 귓속말을 보냈습니다] : " + msg);
					oos.flush();
				}
			}catch(Exception e){ 
				e.printStackTrace();
			}
		}
	}
}
