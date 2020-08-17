package day0410;

import java.util.Scanner;

//단을 입력받아 구구단을 출력하세요
//2-9단을 입력:6
//***6단***
//6*1=6
//...
//6*9=54
public class practice6 {	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
	System.out.println("2-9단을 입력: ");

	     int i;    // 변수와 곱해 줄 변수i를 저장 
         int num= sc.nextInt();    //입력 변수 num 저장 
         
         System.out.println("\n*** "+num+"단  ***\n");   //*** (num)단 *** 출력
         
         for(i=1; i<=9 ; i++)  //반복문 사용해 *9까지 시행 
             System.out.printf("%d * %d = %d \n",num, i, num*i); 	
	} 

}