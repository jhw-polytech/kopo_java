package Assignments.threads;

import java.io.BufferedReader;
import java.net.Socket;

public class MessengerClientThread extends Thread {

    private Socket socket = null;
    private BufferedReader br = null;

    public MessengerClientThread(Socket socket, BufferedReader br) {
        this.socket = socket;
        this.br = br;
    }

    public void run() {
        try {
            System.out.println("");
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


