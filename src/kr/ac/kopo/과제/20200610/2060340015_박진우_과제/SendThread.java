package kr.ac.kopo.day18.homework.chat;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SendThread extends Thread {

	List<String> queue = null;
	Map<String, ClientVO> clientMap = null;

	public SendThread(List<String> queue, Map<String, ClientVO> clientMap) {
		super();
		this.queue = queue;
		this.clientMap = clientMap;
	}

	@Override
	public void run() {

		try {

			while (true) {

				Thread.sleep(10);
				if (queue.size() > 0) {

					String msg = queue.get(0);

					System.out.println(msg);
					if (msg.charAt(0) == (char)8) { // backspace

						String[] splitMsg = msg.split("\\[", 2);
						String receiver = splitMsg[0].substring(1, splitMsg[0].length());
						String sendMsg = "[" + splitMsg[1];

						Set<Entry<String, ClientVO>> entrySet = clientMap.entrySet();

						for (Entry<String, ClientVO> entry : entrySet) {

							if (entry.getKey().equals(receiver)) {
								entry.getValue().getPw().println(sendMsg);
								entry.getValue().getPw().flush();
							}

						}

					} else {
						Set<Entry<String, ClientVO>> entrySet = clientMap.entrySet();
						for (Entry<String, ClientVO> entry : entrySet) {

							entry.getValue().getPw().println(msg);
							entry.getValue().getPw().flush();

						}
					}


					queue.remove(0);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}