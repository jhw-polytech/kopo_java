package Assignments.threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MessengerClientMain {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("=======================================================");
            System.out.println("  클라이언트 id 또는 서버 ip를 다시 확인해주세요.");
            System.out.println("  사용법 : java ChatClient id 접속할 서버 ip");
            System.out.println("=======================================================");
            System.exit(1);
        }

        Socket socket = null;
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            socket = new Socket(args[0], 10005); //  ip 주소, 포트
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("반갑습니다, " + args[1] + "님!");
            System.out.println("메시지를 입력 후 엔터를 눌러주세요.");

            pw.println(args[1]);
            pw.flush();
            MessengerClientThread it = new MessengerClientThread(socket, br);
            it.start();
            String line = null;

            while ((line = keyboard.readLine()) != null) {

                pw.println(line);
                pw.flush();

                if (line.equalsIgnoreCase("/quit")) {
                    break;
                }
            }
            System.out.println("서버와의 접속을 종료합니다.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
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