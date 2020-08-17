package test0414;

import java.util.Scanner;

public class exam04correction {
	
public static void main(String[] args) {
		
		System.out.println("1 - 100 사이의 정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] nums = new int[30]; // 약수
		int[] ar = new int[100];  // 약수를 구하기 위한 1부터 100가지 수를 각각 할당함
		int[] br = new int[1];  //약수의 개수를 세기 위해 cnt를 할당
		
		
		
		int cnt = 0;
		int count = 0;
		
		for(int i = 0;i<num;i++) { // 배열의 길이가 아닌 입력한 num만큼 돌리게 수정했습니다!
			
			ar[i] = i + 1;
            if(num%ar[i] == 0) {
				
				++cnt;
	
				nums[cnt-1] = ar[i]; // nums 배열에 약수를 차례대로 대입
				
				
			}
			
            count = cnt; // br[0] = cnt --> count = cnt로 수정했습니다!
		}
										
		System.out.println(num + "의 약수의 개수 :" + count + "개");
		System.out.println(num + "의 " + count +"개 약수 출력");
		
		
		/* 
		 * 처음에 Arrays.toString을 통해 배열을 나열하려 했지만 약수가 아닌 수는 초기값인 0으로 출력이되어서
		 * 예를 들어 10의 약수의 배열을 나타내면 [1,2,5,10,0,0,0,0,0,...,0] 으로 출력이 되어서 
		 * 아래와 같은 방식을 사용해 보았습니다       
         */
		
		for(int i = 0;i<nums.length;i++) { 
			if(nums[i] != 0) {
				
				System.out.printf("%-3d\t",nums[i]);
			}
		}
		
		
		
		
	}

}
