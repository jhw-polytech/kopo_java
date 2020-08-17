package Assignments.threads;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MessengerServerMain {
    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(10005);
            HashMap<String, Object> hm = new HashMap<String, Object>();
            while (true) {
                System.out.println("사용자의 접속을 기다립니다. . .");
                Socket socket = server.accept();
                MessengerServerThread chatThread = new MessengerServerThread(socket, hm);
                chatThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
