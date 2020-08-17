package kr.ac.yeongnam.day17.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	public static void main(String[] args) {
		try {

			ServerSocket socket = new ServerSocket(10000);
			System.out.println("클라이언트 기둘 중임다.");

			while(true) {
				AcceptThread at = new AcceptThread(socket);
				at.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
