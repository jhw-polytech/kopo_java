import java.util.Scanner;

public class ar2 {

	public void main (String[] args) {
/*
 * 5개의 짝수를 입력받아 출력하는 코드를 작성
 * 1's 정수: 12
 * 2's 정수: 5
 * 2's 정수: 20
 * 3's 정수: 10
 * 4's 정수: 26
 * 5's 정수: 5
 * 5's 정수: 4
 * 
 * 5개 정수 중 짝수만 출력하기 
 * <5개의 정수 출력>
 * 12 20 10 26 4 
 */
 /*
	진희씨 5개의 변수를 입력받는데 왜 배열의 크기를 100개나 잡았어요??? 여유롭게???
	5개의 크기를 잡고도 코드를 작성할 수 있을 거 같아요
	조금만 더 생각해주세요.. ^^
 */
    Scanner scan = new Scanner(System.in);   
      int num_arr[]=new int[100]; 
      System.out.println("5개의 짝수를 입력하시오."); 
      

	 for (int i=0; i<num_arr.length; i++) {
    	  num_arr[i]=scan.nextInt();      //배열에 정수 입력받기 
      

     System.out.println(i+1 + "'s 정수"+num_arr[i]);    //입력받은 정수 출력 
    	  
       if(num_arr[i]%2!=0) {   //만약 홀수이면 실행
    	   num_arr[i]=0;      //홀수이면 i번째에 입력받은 값을 초기화
    	   i--;               //i번째에 다시 값을 입력받기 위해 이전값으로 돌려줌 
       }
	} 
     System.out.println(" \n <5개의 정수 출력> ");  
	  for (int i=0; i<num_arr.length; i++) 
		  System.out.print(num_arr[i]+ " ");	//5개의 정수, 입력받은 짝수만 출력하기 	
		
	}
}