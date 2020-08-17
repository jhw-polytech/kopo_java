package kr.ac.kopo.day4.assignment;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
	/*5개의 짝수를 입력받아 출력하는 코드를 작성   
	 	1's 정수 : 12    
	 	2's 정수 : 5       
	 	2's 정수 : 20    
	 	3's 정수 : 10    
	 	4's 정수 : 26    
	 	5's 정수 : 5    
	 	5's 정수 : 11    
	 	5's 정수 : 4        
	 	
	 	< 5개의 정수 출력 >    
	 	12   20   10   26   4 
	 */	

	 /*
	 	미희씨 숫자를 5로 돌기보다 length를 사용하는게 더 좋을 거 같아요

	 */
		
		//5개의 짝수를 저장할 배열과 사용자로부터 정수를 입력받을 변수 선언
		int[] intArr = new int[5];
		Scanner sc = new Scanner(System.in);
		int input;
		
		
		//사용자로부터 입력받은 정수 중 짝수만 배열에 저장
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d's 정수 : ", i+1);	
			input = sc.nextInt();	//정수를 입력받음
			while (input % 2 !=0) {		//입력받은 정수가 2로 나눠떨어지지 않는다면, 계속해서 정수를 다시 입력받음
				System.out.printf("%d's 정수 : ", i+1);
				input = sc.nextInt();
			}
			intArr[i] = input;	//입력받은 정수가 비로소 짝수가 되면, 배열의 원소에 값을 저장 
		}	
		
		
		//배열의 원소 출력
		System.out.println("< 5개의 정수 출력 >");
		for(int i = 0; i < 5; i++) {
			System.out.print(intArr[i]+"   ");
		}
				

		
		
		
		
	}
}