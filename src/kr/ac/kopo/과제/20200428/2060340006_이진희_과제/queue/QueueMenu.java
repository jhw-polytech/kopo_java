package queue;

import java.util.Scanner;

public class QueueMenu {
	void setQueue() {
		Queue queue = new Queue();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("========[큐]========");
			System.out.println("1.데이터 입력");
			System.out.println("2.데이터 삭제");
			System.out.println("3.전체 데이터 출력([0] ~ [size()-1]");
			System.out.println("4.종료");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("데이터를 입력하세요 : ");
				String data = scan.next();
				queue.enQueue(data);
			}else if(sel == 2) {
				queue.deQueue();
			}else if(sel == 3) {
				queue.printQueue();
			}else if(sel == 4) {
				break;
			}
			
		}
	}
}
