package exam0413;

import java.util.Scanner;

public class no02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 짝수를 입력해주세요.");
		
		int temp = 0;
		int arr[] = new int[5];
		
		for (int i = 1; i < 6; i++) {

			System.out.println(i + "\'s 정수 : ");
			temp = sc.nextInt();
			
			if (temp % 2 == 0) {
				arr[i-1] = temp;
			} else {
				i--;
			}
		}
		sc.close();
		System.out.println("===5개의 정수 출력===");
		for (int t : arr) {
			System.out.print(t + " ");
		}
	}
}
