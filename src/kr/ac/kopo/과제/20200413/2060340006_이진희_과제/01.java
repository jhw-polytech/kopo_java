import java.util.Scanner;

public class ar1 {
	
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
// 	String[] strArr = new String [5];
// 	int loc = 0;  //배열에 입력될 번지를 나타내는 loc, 유지보수 easy

/*
     진희씨 과제 잘하셨어요~
     근데 변수명이 맘에 안들어요...
     C에서는 num_arr이렇게 변수명을 만들지만 java에서는 numArr 이렇게 camel 표기법을 쓰셔야 한답니다.
*/

    Scanner scan = new Scanner(System.in); // 공간 확보 
    int num_arr[] = new int[10];  //배열에 10개의 정수를 입력받아 저장 [0]~[9]
    System.out.println("정수 10개를 입력하시오.");   //정수 10개 입력 
    
	       for (int i =0; i<10; i++) {        // 배열 주소값을 순차적으로 생성
	    	 num_arr[i] = scan.nextInt();  //엔터 
			}
		
			for (int i= 0; i< num_arr.length; i++) {     // 갖고 있는 배열 길이 만큼 
				System.out.println(i+1 +"'s num : " + num_arr[i]);  //입력받은 배열의 값 출력 
				
			}			
   //for if로 짝수 홀수 구하기  
    
    System.out.println("\n < 짝수 >");
    
    int evenSum=0;  // 짝수의 총합 변수 선언
    int oddSum=0;   //홀수의 총합 변수 선언
    int num=0;      //배열 값으로 쓰일 num변수 선언 

    for (int j=0; j<num_arr.length; j++) {  //배열 10개 저장소 생성
    	num=num_arr[j];                     //배열 값을 num로 설정 
    	if(num%2 == 0) {
    		  System.out.print(num + " ");  //짝수 값들 출력
    		  evenSum=evenSum+num;  //짝수 일 때 총합	구하기
    	}
    }
    System.out.println("\n 짝수의 총합:" +evenSum);	 //짝수의 총합 출력 
    
    
    System.out.println("\n < 홀수 >");
   
    for (int j=0; j<num_arr.length; j++) {  //배열 10개 저장소 생성
    	num=num_arr[j];                     //배열 값을 num로 설정 
    	if(num%2 != 0) {                    //홀수 값 설정
    		System.out.print(num + " "); //홀수인 값들 출력
    		oddSum= oddSum+num; 
    	}
    }	
    System.out.println("\n 홀수의 총합:" +evenSum);		
    		
 }
}