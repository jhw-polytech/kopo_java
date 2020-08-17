package kr.ac.kopo.assignment.day04;

import java.util.Scanner;

public class No01 {
	
	/*
	 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오
	 <짝수>
	 n n n n n
	 총합 : nnn
	 <홀수>
	 n n n n n
	 총합 : nnn
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int even = 0;	//짝수의 합
		String evenNum = "";	
		int odd = 0;	//홀수의 합
		String oddNum = "";
		/*
		교수님! String oddNum = null;로 초기화를 하려고하니,
		밑 반복문에서 evenNum += (num[i] + " ")를 하니 결과값이
		null2 4 6 8 10 
		 이런식으로 null도 출력이 돼서 
		String oddNum = "";로 초기화했습니다! 
		이 방식으로 하면 되는게 맞나요??
		 */
		 /*
		 	==> 답변
			 네네 만일 문자열로 기억하시려면 String oddNum = ""; 또는 String oddNum = new String(); 이 맞는 코드입니다.
		 */
		
				
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + "'s num : ");
			num[i] = sc.nextInt();
			
			if((num[i] % 2) == 0) {
				even += num[i];
				evenNum += (num[i] + " ");
			}else {
				odd += num[i];
				oddNum += (num[i] + " ");
			}
		}
		

		
		System.out.println("\n< 짝수 >");
		System.out.println(evenNum);
		System.out.println("짝수의 총합 : " + even + "\n");
		
		System.out.println("< 홀수 >");
		System.out.println(oddNum);
		System.out.println("홀수의 총합 : " + odd);	
		
	}

}
