package kr.ac.kopo.day19.echoServerTry03;

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
import java.util.HashMap;

/**
 * 귓속말은 받을 상대방이 액션을 취해야 받아집니다.
 * @author seung
 *
 */

class User {
	
	String id;
	int port;
	InetAddress inetAddress;
	private Socket socket;
	
	public User(String id, int port, InetAddress inetAddress, Socket socket) {
		this.id = id;
		this.port = port;
		this.inetAddress = inetAddress;
		this.setSocket(socket);
//		System.out.println(socket);
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	
}


class EchoThread extends Thread {
	
	// STATIC 이여야 했다
	private static HashMap<String, Socket> users = new HashMap<String, Socket>();
	private static HashMap<InetAddress, User> usersByInetAddress = new HashMap<InetAddress, User>();
	private Socket socket;
	
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		// 어떤 소켓이 어떤 소켓과 관계되어있는지 알아야 한다.
		InetAddress client = socket.getInetAddress();
		
		try (
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr); // client의 socket
				
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				PrintWriter pw = new PrintWriter(osw); // socket에 전달
		)
		{
			String id = br.readLine();
			System.out.println("[ "+id+" ] 님이 접속하였습니다.");
			
			User user = new User(id, socket.getPort(), client, socket);
			setUsers(id, socket);
			setUsersByInetAddress(client, user);
//			System.out.println(user.getSocket()); // socket
			
			while(true) {
				Thread.sleep(1000);
				String msg = br.readLine();
				String currId = getUsersByInetAddress(client).id;
				if (msg == null) {
					System.out.println("[ "+currId+" ] 님이 접속을 종료합니다.");
					socket.close();
					break;
				}
				if (msg.equals("/")) {
					msg = br.readLine();
					msg = br.
							readLine();
					System.out.println("[ "+currId + " ] : " + msg);
					pw.println("/");
					pw.println(msg);
//					pw.flush();
				} else if (msg.equals("/to")) { // 귓속말인 경우!
					String toId = br.readLine(); // 보낼 id
					msg = br.readLine(); // 보낼 msg
					Socket toUserSocket = getUsers(toId);
					System.out.println("귓속말로 전달할 데이터 :" + msg);

					try 
					{								
						OutputStream toos = toUserSocket.getOutputStream();
						OutputStreamWriter toosw = new OutputStreamWriter(toos);
						PrintWriter topw = new PrintWriter(toosw); // socket에 전달
						
//						System.out.println("가져온 소켓 "+toUserSocket);
						// 좀 느리게 움직이네?
						pw.println("/to");
						pw.println( toId +"님께 보낸 귓속말: "+ msg);
						
						// topw가 제대로 만들어진게 맞을까?
						// 전달이 잘 안된다? 연결 자체가 끊긴 느낌이다.
						topw.println("/to");
						topw.println(currId +"님께서 보낸 귓속말 : "+ msg);
						
						topw.flush();
						
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
				pw.flush();				
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public Socket getUsers(String id) {
		return users.get(id);
	}

	public void setUsers(String id, Socket user) {
		this.users.put(id, user);
	}
	
	public User getUsersByInetAddress(InetAddress inetAddress) {
		return usersByInetAddress.get(inetAddress);
	}

	public void setUsersByInetAddress(InetAddress inetAddress, User user) {
		this.usersByInetAddress.put(inetAddress, user);
	}
	
}


public class EchoThreadServerMain {

	public static void main(String[] args) {
		
		System.out.println("** 채팅 서버 시작 **");
		try {
			ServerSocket server = new ServerSocket(10001);
			while(true) {
				// 클라이언트의 접속을  기다린다.
				Socket socketClient = server.accept();
				// 소켓통신을 각각의 thread형식으로 진행
				
				EchoThread echoServer = new EchoThread(socketClient);
				echoServer.start();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
