import java.util.Scanner;

public class ar3 {
	
	public static void main (String[]args) {
/*
 * 다음의 결과를 보이는 코드를 작성하시오
 * 1번째 정수 : 10
 * 2번째 정수: 5
 *   10보다 큰수가 와야합니다.
 * 2번째 정수: 12
 * 3번째 정수: 36
 * 4번째 정수: 6
 *   10,12,36보다 큰수가 와야합니다.
 * 4번째 정수: 40
 * 5번째 정수: 67
 * 
 * <PRINT>
 * 10 12 36 40 67
 * 
 * <REVERSE>
 * 76 4 63 21 1
 */
   Scanner scan = new Scanner(System.in);   
	
   int num_arr[] = new int[10];
	 System.out.println("정수를 입력하시오");
	
	 for (int i=0; i<5; i++) {
		 num_arr[i]=scan.nextInt();         //배열에 정수 입력받기 

	System.out.println(i+1 + "번째 정수:" + num_arr[i]);   //입력받은 정수 출력

		/*
			만일 5개의 정수가 아니라 10개의 정수를 입력받는 코드면 워쩔려고 이렇게 if문을 ㅋㅋㅋ
			조금만 더 생각해보면 조금 더 효율적인 코드로 작성하실 수 있을 거 같습니다. 생각한번 해봅시다

			그리고 reverse 가 45 -> 54로 출력되어야 하지 않나요??
			그것도 수정해봅시당
		*/

	 
	  if(i>=1 && num_arr[i]<num_arr[i-1]) {          //입력받은 값이 이전값보다 작은 경우 실행
      
       if(i==1)
	        System.out.println(num_arr[i-1]+"보다 큰 수가 와야 합니다.");   //두번째 값이 첫번째 값보다 작은 경우 출력
	   else if(i==2)
		    System.out.println(num_arr[i-2]+","+num_arr[i-1]+"보다 큰 수가 와야 합니다."); //세번째 값이 이전 값보다 작은 경우 출력
	   else if(i==3)
			System.out.println(num_arr[i-3]+","+num_arr[i-2]+","+num_arr[i-1]+"보다 큰 수가 와야 합니다."); //네번째 값이 이전보다 작은 경우 출력
	   else if(i==4)
			System.out.println(num_arr[i-4]+","+num_arr[i-3]+","+num_arr[i-2]+","+num_arr[i-1]+"보다 큰 수가 와야 합니다."); //다섯번째 값이 이전보다 작은 경우 출력
	 
		i--;	  //위의 조건에 일치하지 않으면 배열값 초기화 후 일치하면 그 배열값에 입력
	  }
	 
	 }
	 System.out.println("\n <PRINT>");
	     for (int i=0; i<5; i++)                   
	  System.out.print( num_arr[i] + " ");          //배열의 첫번째-다섯번째 값까지 출력
		
	 System.out.println("\n <REVERSE>");
	     for (int i=4; i>=0; i--) 
	  System.out.print( num_arr[i] + " ");          //배열의 다섯번째부터 첫번째값까지 출력
		
	}
}
