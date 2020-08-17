package Assignments.threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MessengerServerThread extends Thread {

    private Socket socket;
    private String nickname;
    private BufferedReader br;
    private HashMap<String, Object> hm;

    public MessengerServerThread(Socket socket, HashMap<String, Object> hm) {
        this.socket = socket;
        this.hm = hm;

        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            nickname = br.readLine();
            System.out.println("*** 신규 접속자 발생");
            System.out.println("* 접속 사용자 닉네임 : " + nickname);
            System.out.println("* 접속 사용자 클라이언트 정보 : " + socket.getInetAddress());

            synchronized (hm) {
                hm.put(this.nickname, pw);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String line = null; // 받아올 문장
            while ((line = br.readLine()) != null) {

                // 일반 메시지와 키워드 메시지를 구분하기 위해 키워드 앞에 슬래시 문자를 붙여준다.
                if (line.equalsIgnoreCase("/quit")) {
                    break;
                }

                // 소문자 또는 대문자로 /to 입력 후 닉네임을 입력하면 해당 상대에게 귓속말 전송
                if (line.indexOf("/to") == 0 || line.indexOf("/TO") == 0) {
                    secreteMsg(line);
                } else {
                    echoMessage(nickname + " : " + line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            synchronized (hm) {
                hm.remove(nickname);
            }

            echoMessage(nickname + "님이 접속을 종료했습니다.");

            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    // 특정 상대에게 귓속말을 보내는 메소드
    public void secreteMsg(String msg) {
        int start = msg.indexOf(" ") + 1; // 귓속말 상대의 닉네임을 찾기 위함(/to + 닉네임 형식)
        int end = msg.indexOf(" ", start);
        if (end != -1) {
            String to = msg.substring(start, end);
            String msg2 = msg.substring(end + 1);
            Object obj = hm.get(to);
            if (obj != null) {
                PrintWriter pw = (PrintWriter) obj;
                pw.println(nickname + "님으로부터 귓속말이 도착했습니다. : " + msg2);
                pw.flush();
            }
        }
    }

    // 채팅 전송을 위한 메소드
    public void echoMessage(String msg) {
        synchronized (hm) {
            Collection<Object> collection = hm.values();
            Iterator<?> iter = collection.iterator();// Iterator는 Collection 에만 쓸 수 있다.
            while (iter.hasNext()) {
                PrintWriter pw = (PrintWriter) iter.next();
                pw.println(msg);
                pw.flush();
            }
        }
    }
}

