package test0414;

import java.util.Arrays;

/*
 다음의 결과를 보이는 프로그램을 작성하시오. 
 int[] nums = new int[30]; 
 1 – 100사이의 정수를 입력하시오 : 64 
 64의 약수의 개수 : 7개 
 < 64의 7개 약수 출력 >
 1 2 4 8 16 32 64
 
 1 – 100사이의 정수를 입력하시오 : 79
 79의 약수의 개수 : 2개 
 < 79의 2개 약수 출력 >
 1 79  
 */

import java.util.Scanner;

public class exam04 {
	
	public static void main(String[] args) {
		
		System.out.println("1 - 100 사이의 정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] nums = new int[30]; // 약수
		int[] ar = new int[100];  // 약수를 구하기 위한 1부터 100가지 수를 각각 할당함
		int[] br = new int[1];  //약수의 개수를 세기 위해 cnt를 할당
		
		
		
		int cnt = 0;
		/*
			굳이 배열 개수만큼 반복문을 동작할 필요가 있을까요???
			한번 생각해보세요~~
		*/
		for(int i = 0;i<ar.length;i++) {
			
			ar[i] = i + 1;
            if(num%ar[i] == 0) {
				
				++cnt;
	
				nums[cnt-1] = ar[i]; // nums 배열에 약수를 차례대로 대입
				
				
			}
			
            br[0] = cnt;
		}
										
		System.out.println(num + "의 약수의 개수 :" + br[0] + "개");
		System.out.println(num + "의" + br[0] +"개 약수 출력");
		
		
		/* 
		 * 처음에 Arrays.toString을 통해 배열을 나열하려 했지만 약수가 아닌 수는 초기값인 0으로 출력이되어서
		 * 예를 들어 10의 약수의 배열을 나타내면 [1,2,5,10,0,0,0,0,0,0] 으로 출력이 되어서 
		 * 아래와 같은 방식을 사용해 보았습니다       
         */
		System.out.println(Arrays.toString(nums));
		for(int i = 0;i<nums.length;i++) { 
			if(nums[i] != 0) {
				
				System.out.printf("%-3d\t",nums[i]);
			}
		}
		
		
		
		
	}

}
