package chap1;
import java.util.Scanner;

public class Correction01{

	
	public static void main(String[]args) {
	          
	//10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
	/*기본형 배열
	 * 
	 * 1's num : 12
	 * 2's num : 5
	 * 3's num : 8
	 * 10's num: 22
	 * 
	 * <짝수>
	 * 12 8 ...22
	 * 짝수의 총합: xxx
	 * 
	 * <홀수>
	 * 5 ...
	 * 홀수의 총합: xxx
	 */ 
		
	    	 
	// int[]arr = {10,20,30,40,50};
	//  int[]copyarr = arr;
	//  String[] strArr = {"폴리텍", "자바", "교육"};
//	 	String[] strArr = new String [5];
//	 	int loc = 0;  //배열에 입력될 번지를 나타내는 loc, 유지보수 easy

	    Scanner scan = new Scanner(System.in); // 공간 확보 
	    int numArr[] = new int[10];  //배열에 10개의 정수를 입력받아 저장 [0]~[9]
	    System.out.println("정수 10개를 입력하시오.");   //정수 10개 입력 
	    
		       for (int i =0; i<10; i++) {        // 배열 주소값을 순차적으로 생성
		    	 numArr[i] = scan.nextInt();  //엔터 
				}
			
				for (int i= 0; i< numArr.length; i++) {     // 갖고 있는 배열 길이 만큼 
					System.out.println(i+1 +"'s num : " + numArr[i]);  //입력받은 배열의 값 출력 
					
				}			
	   //for if로 짝수 홀수 구하기  
	    
	    System.out.println("\n < 짝수 >");
	    
	    int evenSum=0;  // 짝수의 총합 변수 선언
	    int oddSum=0;   //홀수의 총합 변수 선언
	    int num=0;      //배열 값으로 쓰일 num변수 선언 

	    for (int j=0; j<numArr.length; j++) {  //배열 10개 저장소 생성
	    	num=numArr[j];                     //배열 값을 num로 설정 
	    	if(num%2 == 0) {
	    		  System.out.print(num + " ");  //짝수 값들 출력
	    		  evenSum=evenSum+num;  //짝수 일 때 총합	구하기
	    	}
	    }
	    System.out.println("\n 짝수의 총합:" +evenSum);	 //짝수의 총합 출력 
	    
	    
	    System.out.println("\n < 홀수 >");
	   
	    for (int j=0; j<numArr.length; j++) {  //배열 10개 저장소 생성
	    	num=numArr[j];                     //배열 값을 num로 설정 
	    	if(num%2 != 0) {                    //홀수 값 설정
	    		System.out.print(num + " "); //홀수인 값들 출력
	    		oddSum= oddSum+num; 
	    	}
	    }	
	    System.out.println("\n 홀수의 총합:" +evenSum);		
	    		
	 }
	}

