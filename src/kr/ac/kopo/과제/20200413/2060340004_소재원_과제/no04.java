package exam0413;

import java.util.Scanner;

public class no04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[50];
		int cnt = 0;
		
		System.out.println("1-100 사이의 정수를 입력하시오 : ");
		int inputInt = sc.nextInt();
		sc.close();
		

		for (int i = 1; i <= inputInt; i++) {
			if (inputInt % i == 0) {
				nums[cnt] = i;
				cnt++;
			}
		}
		
		System.out.printf("\n%d의 약수의 개수 : %d개\n", inputInt, cnt);
		System.out.printf("===%d의 %d개 약수 출력===\n", inputInt, cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
}
