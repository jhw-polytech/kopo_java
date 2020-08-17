package kr.ac.kopo.day4.assignment;

import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
	/*다음의 결과를 보이는 프로그램을 작성하시오.   
	 	int[] nums = new int[30]; 
	 	1 – 100사이의 정수를 입력하시오 : 64 
	 	64의 약수의 개수 : 7개 
	 	< 64의 7개 약수 출력 > 
	 	1 2 4 8 16 32 64 
 
		1 – 100사이의 정수를 입력하시오 : 79 
		79의 약수의 개수 : 2개 
		< 79의 2개 약수 출력 > 1 79 
	 */
	
		//약수를 저장할 배열과 약수의 개수를 셀 변수 선언 
		int[] nums = new int[30];
		int count = 0;
		
		
		//정수 입력받기
		System.out.println("1 - 100사이의 정수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		
		//1부터 입력받은 정수까지의 모든 수에 대하여, 입력받은 정수를 나눠떨어지게 하는 수가 있다면 배열에 저장한 뒤 개수 누적
		for(int i = 1; i <= input; i++) {
			if(input % i ==0) {
				count += 1;				//몇번째 약수인지 먼저 인덱스를 구한 다음
				nums[count-1] = i;		//대응하는 순서의 배열 원소에 저장(0번 인덱스 원소부터 차례대로 저장된다)
			}
		}
		
		
		//약수를 담은 배열 출력
		System.out.printf("< %d의 %d개 약수 출력 >", input, count);
		System.out.println("");
		for(int i = 0; i < count; i++) {	//약수의 개수만큼의 배열 원소를 차례대로 출력
			System.out.print(nums[i]+"  ");
		}	
		
		
		
	}
}
