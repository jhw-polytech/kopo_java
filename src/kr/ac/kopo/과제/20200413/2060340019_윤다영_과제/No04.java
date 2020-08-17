package kr.ac.kopo.assignment.day04;

import java.util.Scanner;

public class No04 {
	/*
	 다음의 결과를 보이는 프로그램을 작성하시오
	 1 - 100 사이의 정수를 입력하세요 : n
	 n의 약수의 개수 : n2
	 <n의 n2개의 약수 출력>
	 i i i i ...
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100사이의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		int[] nums = new int[30];
		int j = 0; //약수 개수
		
		for(int i = 1; i <= num; i++) {
			if((num % i) == 0) {
				nums[j] = i;
				j++;
			}
		}
		
		System.out.printf("%d의 약수의 개수 : %d개\n", num, j);
		System.out.printf("< %d의 %d개 약수 출력 >\n", num, j);
		for(int i = 0; i < j ; i++) {
			if(nums[i] != 0) {
				System.out.print(nums[i] + " ");
			}
		}
		
	
		
		
	}

}
