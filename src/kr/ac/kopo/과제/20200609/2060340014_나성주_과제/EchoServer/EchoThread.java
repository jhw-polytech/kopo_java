package homework.day17.EchoServer;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

class EchoThread extends Thread {

    private Socket client;


    // 메인 클래스에서 클라이언트와 연결함으로써 받아온 클라이언트 소켓 정보
    public EchoThread(Socket client) {
        this.client = client;

    }

    @Override
    public void run() {
        InetAddress clientIpAdress = client.getInetAddress(); // 클라이언트의 ip주소
        System.out.println("[" + clientIpAdress + "] 님이 접속하였습니다.");

        try (
                InputStream is = client.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                OutputStream os = client.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                PrintWriter pw = new PrintWriter(osw);
        ) {
            while (true) {
                String msg = br.readLine(); // 클라이언트가 보낸 메세지
                if (msg == null) {
                    System.out.println("[" + clientIpAdress + "]님과의 접속이 종료되었습니다.");
                    client.close();
                    break;
                }
                System.out.println("[" + clientIpAdress + "]님이 보낸 메세지 : " + msg); // 메세지 출력

                pw.println(msg); // 클라이언트 측에 메세지 전송
                pw.flush();
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
