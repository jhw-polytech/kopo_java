package test0430;

import java.util.Scanner;

public class StackQueueMain {
	
	public static void main(String[] args) {
		
		StackUtil su = new StackUtil();
		QueueUtil qu = new QueueUtil();
		Scanner sc = new Scanner(System.in);
						
		loop : while(true) {
			
			System.out.println("1. STACK 방식의 데이터 입력 2. STACK 방식의 데이터 삭제 3. QUEUE 방식의 데이터 입력 4. QUEUE 방식의 데이터 삭제 5. 전체 데이터 출력 6. 종료");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			 case 1 :
			
				System.out.println("1. STACK 방식의 데이터 입력");
			    su.getStackData();
			    break;
			
			 case 2 :
			    System.out.println("2. STACK 방식의 데이터 삭제");
			    su.removeStackData();
			    break;
			
			 case 3 :
			    System.out.println("3. QUEUE 방식의 데이터 입력");
			    qu.getQueueData();
			    break;
			
			 case 4 :
			    System.out.println("4. QUEUE 방식의 데이터 삭제");
			    qu.removeQueueData();
			    break;
			
			 case 5 :
			    System.out.println("5. 전체 데이터 출력");
			    su.printStackData();
			    qu.printQueueData();
			    break;
			
			 case 6 :
			    System.out.println("6. 종료");
			    break loop;
			}
		}
	}

}
