package homework0428_1;

import java.util.Scanner;

public class QueueView {
	
	Scanner sc = new Scanner(System.in);
	boolean check = true;
	QueueUtil queueUtil = new QueueUtil();
	int select4;
	
	public int queueStart() {
		System.out.println("Queue 입력 방식을 선택했습니다.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 전체 데이터 출력([0]~[size()-1)");
		System.out.println("4. 종료");
		System.out.println("원하는 기능을 선택하세요(1~4)");
		select4 = sc.nextInt();
		return select4;
	}

	public void execute() {
		queueStart();	
		while(check) {
			if(select4==1) {
				queueUtil.offer();
				break;
			}else if(select4==2) {
				queueUtil.pool();
				break;
			}else if(select4==3) {
				queueUtil.print();
				break;
			}else if(select4==4) {
				System.out.println("종료합니다.");
				check=false;
				break;
			}else {
				System.out.println("다시 입력하세요.(1~4 사이)");
				execute();
				break;
			}
		}
		
	}
	
}