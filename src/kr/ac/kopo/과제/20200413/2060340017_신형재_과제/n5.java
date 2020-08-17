package homework0413;

/*
 * 2060340017 신형재 과제 5번
 * 
 *임의의 수를 1개 입력
 *2부터 해당 수까지의 소수를 모두 출력
 *
 *<교수님 설명> 2부터 시작하여 그 배수들을 모두 지우는 방식으로 소수 찾기
 *
 */

 /*
	형재씨... 제가 설명한 알고리즘으로 코드가 작성되어있지 않은거 같아요~~
	다시한번 생각해주실래요??? 수고하셨습니다
 */

import java.util.Scanner;

public class n5 {
	public static void main(String[] arg){
		  
		  Scanner sc = new Scanner(System.in);
		  // 임의의 수 입력
		  System.out.print("2 이상의 정수를 입력하시오 : ");
		  int num = sc.nextInt();
		  System.out.printf("< 2 ~ %d 사이의 소수 출력 >\n", num);
		  
		  int k;
		// 소수 여부를 저장하기, boolean형 변수 대신 int형 변수를 배정, 1이면 소수(true) 0이면 소수가 아닌수(false)
		  int check = 1; 
		  // 소수가 들어갈 배열 설정
		  int[] kArr = new int[num];
		  
		  // 변수 i는 입력된 수까지의 모든 수, 이때 1, 0운 제외
		  for(int i=2; i<=num; i++){
			// 소수는 1과 자신으로만 나누어 지는 수이므로 1과 자기 자신은 제외
			  for(int j=2; j<i; j++){    
		          k=i%j;
		          if(k==0) {
		          check = 0;
		          }
		      }
			  // i변수가 1씩 증가하면서 그 수를 2부터 나눠줬을 때, check 변수를 통해 0인 경우 제외
			  // 1인 경우만 배열에 포함, 이때 배열의 위치를 어떻게 설정해야 할 지 몰라서 임의의 값 배정
		      if(check == 1 ) {
		    	  kArr[i-2] = i;
		    	  System.out.println(kArr[i-2]);
		      }
		      else {
		    	  check = 1;
		      }
		 }
	}
}
