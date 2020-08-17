package kr.co.hana.homework12.Structure;

import java.util.*;

public class StackControl {

	static void controller() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<STACK>");
		System.out.println("1. 데이터 입력" + "\n" + "2. 데이터 삭제" + "\n" + "3. 데이터 조회" + "\n" + "4. 종료");
		boolean flag = false;
		StackUtill su = new StackUtill();

		for (;;) {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				su.push(StackUtill.stack);
				controller();
				break;
			case 2:
				su.pop(StackUtill.stack);
				controller();
				break;
			case 3:
				su.stackList(StackUtill.stack);
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
		su.stackList(StackUtill.stack);
		System.out.println("프로그램 종료");
	}
}
