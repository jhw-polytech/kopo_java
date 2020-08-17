package chap1;
//시작단과 종료단을 입력받아 구구단을 출력하시오
//시작단을 입력: 5
//종료단을 입력: 8
//***5단***
//이때 시작단을 8, 종료단을 5로 입력해도 같은 결과가 나와야 함.

import java.util.Scanner;

public class pr8 {
	public static void main(String[] args){
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("시작단을 입력 : ");
	int s =sc.nextInt();            //시작단 입력 start
	
	System.out.println("종료단을 입력 : ");
	int e =sc.nextInt();              //종료단 입력 end
	 
	
	
	if(s < e) {                     //시작단이 종료단보다 작으면 실행
	 for(int i=s ; i<=e ; i++) {    //시작단부터 종료단까지 반복문 실행 
		System.out.println("\n*** "+i+"단 ***\n");  // *** i단 *** 반복 수행 
	    for(int count=1; count<=9; count++)   //구구단 실행
	      System.out.printf("%d * %d = %d \n", i, count, i*count); //결과 출력 
	      
	 }
	}
	else                             //시작단이 종료단보다 크면 실행    
	 for(int i=e ; i<=s ; i++) {          //입력받은 종료단이 시작단보다 더 작은 숫자이므로 종료단부터 구구단 실행 
		 System.out.println("\n*** "+i+"단 ***\n");  // *** i단 *** 반복 수행 
	    for(int count=1; count<=9; count++)  //구구단 실행
	      System.out.printf("%d * %d = %d \n", i, count, i*count); //결과 출력 
	   
	 }
	}
}