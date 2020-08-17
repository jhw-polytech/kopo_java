package homework0413;


/*
 * 2060340017 신형재 과제 4번
 * 
 *임의의 수를 1개 입력
 *해당 수의 약수의 갯수 출력
 *해당 수의 모든 약수(배열) 출력
 *
 */

import java.util.Scanner;

public class n4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1 - 100 사이의 정수를 입력하시오 : ");
		
		// 사용자 입력값 num 변수 입력
		int num = sc.nextInt();
		// 약수의 집합 numArr 배열 생성, 이때 length는 크게
		int[] numArr = new int[num];
		// 배열의 순서를 세기 위한 변수 cnt 생성
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			//1에서 입력된 변수까지 모든 수 = i, 입력된 수를 i로 나눴을 때 나머지가 0이어야 약수
			if(num%i == 0) {
				numArr[cnt] = i;
				// 약수가 등장할 때마다 cnt는 1씩 상승
				cnt++;
			}
		}
		System.out.printf("%d의 약수의 개수 : %d\n", num, cnt);
		System.out.printf("<%d의 %d개 약수 출력>\n", num, cnt);
		for(int j=1; j<=cnt;j++) {
			System.out.print(numArr[j-1]+" ");
		}
	}

}
