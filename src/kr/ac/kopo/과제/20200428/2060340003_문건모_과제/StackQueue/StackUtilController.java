package test0430;

import java.util.Scanner;

public class StackUtilController {
	
	private Scanner sc;
	private StackUtil su;
	
	public StackUtilController() {
		sc = new Scanner(System.in);
		su = new StackUtil();
	}
	
	public void stackUtilManual() {
		
		while(true) {
		
			System.out.println("1.데이터 입력 2.데이터 삭제 3.전체 데이터 출력  4.종료");
            int num = sc.nextInt();
            sc.nextLine();
            
            switch(num) {
            
            case 1 :
            	su.getStackData();
            	break;
            case 2 :
            	su.removeStackData();
            	break;
            case 3 :
            	su.printStackData();
            	break;
            case 4 :
            	System.out.println("종료합니다");
            	System.exit(0);
            }
             
		}
		
	}
	
}
	
            
