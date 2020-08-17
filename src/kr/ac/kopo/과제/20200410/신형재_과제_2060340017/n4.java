package homework0410;


/*
 * 2060340017 신형재 과제 4번
 * 
 * 2개의 정수를 사용자로부터 입력받음 
 * 이후 첫번째 정수와 1 사이의 두번째 정수의 배수를 제외한 정수 출력
 * 해당 출력물을 두번째 정수의 갯수만큼 출력, 이후 줄 바꿈
 * 
 */

import java.util.Scanner;

public class n4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("<1 ~ %d사이의 %d의 배수를 제외한 정수 출력>\n", num1, num2);
		for(int i = 1; i<=num1; i++) {
			if(i%num2 != 0) {
				System.out.printf("%d ", i);
			}
		}System.out.print("\n");
		
		
		System.out.printf("<1 ~ %d사이의 %d의 배수를 제외한 정수 %d개씩 출력>\n", num1, num2, num2);
		
		// 줄 바꿈을 하기위해 1개의 변수 추가 = j
		// 해당 변수는 num2로 나눴을 때 나머지가 0일때만 줄바꿈을 출력
		
		int j = 0;
		for(int i = 1; i<=num1; i++) {
			if(i%num2 != 0) {
				System.out.printf("%d ", i);
				j++;
				if(j%num2 == 0) {
					System.out.print("\n");
				}
			}
		}
	}
}
