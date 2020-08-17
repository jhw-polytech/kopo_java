package jaeheehomework;
//Homework2_8new에 고친 코드 올렸습니다!
import java.util.Scanner;

public class Homework2_8 {
	public static void main(String[] args) {
		
		//8. 시작단과 종료단을 입력받아 구구단을 출력.
		
				//시작, 종료단 받기
				Scanner sc = new Scanner(System.in);
				System.out.printf("시간단을 입력 : ");
				int startDan = Integer.parseInt(sc.nextLine());
				System.out.printf("\n종료단을 입력 : ");
				int finalDan = Integer.parseInt(sc.nextLine());
				sc.close();

				/*
					시작단을 8, 종료단을 3을 입력했을 때는 결과가 나오지 않지요??? 코드 수정 조금만 더 해주세요
				*/
				
				// 7번에서 만든 구구단에서 i의 첫값과 마지막 값을 변수로 사용
				for(int i = startDan; i <= finalDan; i++) {
					System.out.printf("\n***%d단***\n", i);
					
						for(int k = 1; k <= 9; k++) {
							System.out.printf("%d * %d = %d\n", i, k, i*k);
					}
				}
	}

}
