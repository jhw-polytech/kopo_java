package homework.day17.EchoServer;

import java.io.*;
import java.net.Socket;

// cmd 창이 한글 인코딩이 되지 않아 cmd에서의 실행까지는 구현하지 못했습니다.

/*
    java EchoClientMain 172.16.88.129 10001

*/
public class EchoClientMain {

    public static void main(String[] args) {

//        if (args.length != 2) {
//            System.out.println("------------------------------------------------------");
//            System.out.println("사용법이 잘못되었습니다.");
//            System.out.println("사용법: java EchoClientMain 서버IP 접속PORT번호");
//            System.out.println("------------------------------------------------------");
//            System.exit(0);
//        }

//        String serverIP = args[0];
//        int port = Integer.parseInt(args[1]);

        try {
            Socket serverSocket = new Socket("localhost", 10001); // 서버와 통신할 서버 소켓 객체 생성

            //서버에 전송할 메세지를 키보드로 입력받는 객체
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            //키보드로 입력받은 메세지를 서버에 전송할 객체
            OutputStream os = serverSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            PrintWriter pw = new PrintWriter(osw);

            //서버에 전송할 메세지를 수신할 객체
            InputStream is = serverSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            while (true) {
                System.out.print("전송할 메세지를 입력하세요 (quit입력시 종료) : ");
                String msg = keyboard.readLine();

                pw.println(msg);
                pw.flush();

                if (msg.equalsIgnoreCase("quit")) {
                    System.out.println("서버와의 접속종료...");
                    serverSocket.close();
                    break;
                }


                String echMsg = br.readLine();
                System.out.println("서버에서 재전송한 메세지 : [" + echMsg + "]");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
