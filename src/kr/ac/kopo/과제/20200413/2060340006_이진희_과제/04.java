import java.util.Scanner;

public class ar4 {
	
	public static void main (String[]args) {
	
/*
 * 다음의 결과를 보이는 프로그램을 작성하시오.
 * int[] nums = new int[30];
 * 1 - 100 사이의 정수를 입력하시오 : 64
 * 64의 약수의 개수 : 7개
 * <64의 7개 약수 출력>
 * 1 2 4 8 16 32 64
 * 
 * 1-100사이의 정수를 입력하시오 : 79
 * 79의 약수의 개수 : 2개 
 * <79의 2개 약수 출력>
 * 1 79
 */
	Scanner scan = new Scanner(System.in);  
     int nums[]= new int [30];  //입력받은 수의 약수들을 저장하는 배열 선언 
     int num=0;                //입력받을 수를 저장할 변수 
     int cnt=0;              //약수의 개수를 저장할 변수 
     
     
     System.out.println("1~100사이의 정수를 입력하시오:");
     
     num =scan.nextInt();  //1-100사이의 정수 입력
     
     for(int i=1; i<=num;i++) {  //입력받은 숫자까지 약수를 찾는 반복문 생성
    	 if(num%i==0) {          //입력받은 숫자(num)가 i로 나눠지면 i는 num의 약수
    		 nums[cnt]=i;        //i라는 값을  배열에 저장
    		 cnt++;              //약수일때만 count+1 해주어 약수의 개수 저장 
    	 }
     }
    
     System.out.println();  //엔터
     System.out.println(num+"의 약수의 개수:" + cnt +"개");   //약수의 개수 출력
     System.out.println();  //엔터
     System.out.println("<" +num+"의" +cnt+ "개의 약수 출력>");
     
     for(int i=0; i<cnt;i++) {                 //약수의 개수까지 반복문 
    	 System.out.print(nums[i] + " " );        //약수 출력 
        }
    	 
       }
     }
     