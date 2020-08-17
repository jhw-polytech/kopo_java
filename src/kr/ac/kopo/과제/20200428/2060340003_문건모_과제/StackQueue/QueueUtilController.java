package test0430;

import java.util.Scanner;

public class QueueUtilController {
	
	private Scanner sc;
	private QueueUtil qu;
	
	public QueueUtilController() {
		sc = new Scanner(System.in);
		qu = new QueueUtil();
	}

	public void queueUtilManual() {
		
		while(true) {
		
			System.out.println("1.데이터 입력 2.데이터 삭제 3.전체 데이터 출력  4.종료");
            int num = sc.nextInt();
            sc.nextLine();
            
            switch(num) {
            
            case 1 :
            	qu.getQueueData();
            	break;
            case 2 :
            	qu.removeQueueData();
            	break;
            case 3 :
            	qu.printQueueData();
            	break;
            case 4 :
            	System.out.println("종료합니다");
            	System.exit(0);
            }
             
		}
		
	}

}
