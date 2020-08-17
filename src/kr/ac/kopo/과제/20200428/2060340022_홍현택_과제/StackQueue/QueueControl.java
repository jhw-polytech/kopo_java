package kr.co.hana.homework12.Structure;

import java.util.Scanner;

public class QueueControl {

	static void controller() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<Queue>");
		System.out.println("1. 데이터 입력" + "\n" + "2. 데이터 삭제" + "\n" + "3. 데이터 조회" + "\n" + "4. 종료");
		boolean flag = false;
		QueueUtill qu = new QueueUtill();

		for (;;) {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				qu.insert(QueueUtill.queue);
				controller();
				break;
			case 2:
				qu.remove(QueueUtill.queue);
				controller();
				break;
			case 3:
				qu.queueList(QueueUtill.queue);
				controller();
				break;
			case 4:
				flag = true;
				break;
			default:
				System.out.println("1~4 사이의 숫자를 입력하세요.");
				controller();
				break;
			}
			if (flag == true) {
				break;
			}
		}
		qu.queueList(QueueUtill.queue);
		System.out.println("프로그램 종료");
	}
}
