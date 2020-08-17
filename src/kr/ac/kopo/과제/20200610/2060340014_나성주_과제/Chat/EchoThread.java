package homework.day17.EchoServer2.EchoServer;

// 아직 다 구현하지 못했습니다.. 좀 더 공부해서 다음주 내로 꼭 제출하도록 하겠습니다!

import java.io.*;
import java.net.InetAddress;

class EchoThread extends Thread {

//    private Socket client;

//    private List<Socket> clientSocketList;
    private ClientSocketsVO clientSocketsVO;
    private int seqNo = 0; // 서버에 접속한 순서


    // 메인 클래스에서 클라이언트와 연결함으로써 받아온 클라이언트 소켓 정보
    public EchoThread(ClientSocketsVO clientSocketsVO) {
        this.clientSocketsVO = clientSocketsVO;

    }


//    private Map<InetAddress,PrintWriter> printWriterList;



    @Override
    public void run() {
        InetAddress clientIpAddress = clientSocketsVO.getSocketList().get(seqNo).getInetAddress(); // 클라이언트의 ip주소
//        seqNo++;
        System.out.println("[" + clientIpAddress + "] 님이 접속하였습니다.");

        try (
                InputStream is = clientSocketsVO.getSocketList().get(seqNo).getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);



                OutputStream os = clientSocketsVO.getSocketList().get(seqNo).getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                PrintWriter pw = new PrintWriter(osw);

                clientSocketsVO.getPrintWriterList().put(clientIpAddress,pw)
        ) {
            while (true) {
                String msg = br.readLine(); // 클라이언트가 보낸 메세지
                if (msg == null) {
                    System.out.println("[" + clientIpAddress + "]님과의 접속이 종료되었습니다.");
                    clientSocketList.get(seqNo).close();
                    break;
                }
                System.out.println("[" + clientIpAddress + "]님이 보낸 메세지 : " + msg); // 메세지 출력

                pw.println(msg); // 클라이언트 측에 메세지 전송
                pw.flush();
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
