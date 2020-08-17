package homework0428_1;

import java.util.Scanner;

public class StackView {
	
	Scanner sc = new Scanner(System.in);
	boolean check=true;
	StackUtil su = new StackUtil();
	int select3;
	public int stackStart() {
		System.out.println("Stack 입력 방식을 선택했습니다.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 전체 데이터 출력([0]~[size()-1)");
		System.out.println("4. 종료");
		System.out.println("원하는 기능을 선택하세요(1~4)");
		select3 = sc.nextInt();
		sc.nextLine();
		return select3;
	}
	
	public void execute() {
		stackStart();		
		while(check) {
			switch(select3) {
			case 1:
				su.push();
				break;
			case 2:
				su.pop();
				break;
			case 3:
				su.print();
				break;
			case 4:
				System.out.println("종료합니다.");
				check=false;
				break;
			default :
				System.out.println("다시 입력하세요.(1~4 사이)");
				break;
			}
		}
		
	}
}