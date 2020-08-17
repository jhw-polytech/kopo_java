package homework.day17.EchoServer2.EchoServer;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientSocketsVO {

    private Socket clientSocket;
    private ArrayList<Socket> socketList = new ArrayList<>();

    private Map<InetAddress,PrintWriter> printWriterList = new HashMap<>();

    public Socket getClientSocket() {
        return clientSocket;
    }

    public List<Socket> getSocketList() {
        return socketList;
    }

    public Map<InetAddress, PrintWriter> getPrintWriterList() {
        return printWriterList;
    }
}
