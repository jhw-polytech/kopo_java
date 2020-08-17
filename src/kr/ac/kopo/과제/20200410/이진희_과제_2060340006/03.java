package chap1;

import java.util.Scanner;

public class pr3 {
	public static void main(String[] args){
	
		

		//정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
		//1-100사이의 정수를 입력:
		//<1-60 정수 출력>
		// 1 2 3 ...60

				
		Scanner sc= new Scanner(System.in);
		
                         System.out.println("1~100 사이의 정수를 입력 : ");
		 int num= sc.nextInt();    //입력받은 정수 num에 저장 
				
		    for(int i=1;i<=num; i++)             //1부터 입력받은 정수 num까지 반복   
			System.out.printf("%d ",i);      // 정수로 출력 

  }
 }

