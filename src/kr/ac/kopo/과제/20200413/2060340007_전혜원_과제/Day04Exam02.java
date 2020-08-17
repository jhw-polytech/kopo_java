package kr.ac.kopo.day04.exam;

import java.util.Scanner;

/*
2. 5개의 짝수를 입력받아 출력하는 코드를 작성
	1's 정수 : 12
	2's 정수 : 5
	2's 정수 : 20
	3's 정수 : 10
	4's 정수 : 26
	5's 정수 : 5
	5's 정수 : 11
	5's 정수 : 4
	
	< 5개의 정수 출력 >
	12 20 10 26 4
*/

public class Day04Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//입력받은 짝수 값을 세기 위한 변수
		int cnt=0;
		
		//짝수를 저장하기 위한 배열
		int[] arr = new int[5];
		
		
		//cnt가 0~4일 때까지만 실행 
		while(cnt<5) {	
			System.out.printf("%d's 정수 : ", cnt+1);
			arr[cnt] = sc.nextInt();
			if(arr[cnt]%2==0) {
				cnt++;
			}
		}
		
		System.out.println();
		
		System.out.println("< 5개의 정수 출력 >");
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+"  ");
		}

	}

}
