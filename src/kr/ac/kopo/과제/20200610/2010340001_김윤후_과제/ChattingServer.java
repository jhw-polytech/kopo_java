package chatting;

import java.net.*;

import java.io.*;

import java.util.*;


class  ChattingServer

{
	int port = 6000;
	ServerSocket server = null;
	Socket child = null;
	HashMap<String, PrintWriter> mapping;
	public ChattingServer() {
		ChattingserverThread serverthread;
		Thread t;
		try {
			server = new ServerSocket( port );
			System.out.println( "************** 채팅 서버 ***********" );
			System.out.println( "클라이언트의 접속을 기다립니다." );
			mapping = new HashMap<String, PrintWriter>();

			while( true ) {
				child = server.accept();
				if( child != null ) {
					serverthread = new ChattingserverThread( child, mapping );
					t = new Thread( serverthread );
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
		new ChattingServer();
	}
}