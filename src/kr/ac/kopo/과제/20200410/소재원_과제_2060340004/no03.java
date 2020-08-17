package exam0410;

import java.util.Scanner;

public class no03 {
	
	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 정수를 입력받아 1부터 정수 사이의 숫자 출력.
		// 단순 반복
		Scanner sc = new Scanner(System.in); 
		System.out.println("1 ~ 100 사이의 아무 숫자를 입력하세요.");
		int selectNum = sc.nextInt();
		sc.close();
		
		if ((selectNum < 0) || (selectNum > 100)) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i <= selectNum; i++) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
}
