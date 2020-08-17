package gneegnee;

import java.net.*;
import java.io.*;
import java.util.*;

public class  ChatServer
{
	protected final int port = 10002;
	ServerSocket server = null;
	Socket client = null;

	HashMap<String, PrintWriter> hs;

	public ChatServer() {
		ChatSeverThread sr;
		Thread t;

		try {
			server = new ServerSocket( port );
			
			System.out.println( "------ 채팅 서버 ------" );
			System.out.println( "클라이언트의 접속을 기다립니다..." );

			hs = new HashMap<String, PrintWriter>();

			while( true ) {
				client = server.accept();
				if( client != null ) {
					sr = new ChatSeverThread( client, hs );
					t = new Thread( sr );
					t.start();
				}
			}
		}
		catch ( Exception e )	{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		new ChatServer();
	}
}

