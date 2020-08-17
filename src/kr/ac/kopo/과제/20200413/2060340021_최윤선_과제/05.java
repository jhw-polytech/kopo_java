package prac;

import java.util.*;

/*
	윤선씨 이거 5번과제 아닌거 같아요~~~
	다시 5번 과제 올려주세요... ^^
*/

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner sc = new Scanner(System.in);
		int[] iptarr = new int[30]; 
		int cnt=0; // 약수 개수
		int loc=0;
		
		System.out.printf("1~100 사이의 정수를 입력하시오 : ");
		int num  = sc.nextInt();
		sc.nextLine();
		

		for (int i=1 ; i<=num ; i++) { // 1부터 num까지 돌리는 반복문
			if(num%i==0) {
				cnt++;
				iptarr[loc++]=i;
			}
		}
		
		
		System.out.printf("%d의 약수의 개수 : %d\n",num,cnt);
		System.out.printf("<%d의 %d개 약수 출력>\n",num,cnt);
		for(int j=0 ; j < cnt ; j++) {
			System.out.printf("%d\t",iptarr[j]);
		}
	
	
	
	
	
	
	
	}
}