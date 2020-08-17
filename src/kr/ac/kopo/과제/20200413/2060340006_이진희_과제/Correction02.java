package java.lang;

import java.util.Scanner;

public class m02 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);   
	     
		 int numArr[]=new int[5]; 
	      System.out.println("5개의 짝수를 입력하시오."); 
	      

		 for (int i=0; i<numArr.length; i++) {
	    	  numArr[i]=scan.nextInt();      //배열에 정수 입력받기 
	      

	     System.out.println(i+1 + "'s 정수"+numArr[i]);    //입력받은 정수 출력 
	    	  
	       if(numArr[i]%2!=0) {   //만약 홀수이면 실행
	    	   numArr[i]=0;      //홀수이면 i번째에 입력받은 값을 초기화
	    	   i--;               //i번째에 다시 값을 입력받기 위해 이전값으로 돌려줌 
	       }
		} 
	     System.out.println(" \n <5개의 정수 출력> ");  
		  for (int i=0; i<numArr.length; i++) 
			  System.out.print(numArr[i]+ " ");	//5개의 정수, 입력받은 짝수만 출력하기 	
			
		}
	}


