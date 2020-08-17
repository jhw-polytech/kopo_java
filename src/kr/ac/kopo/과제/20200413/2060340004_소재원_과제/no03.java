package exam0413;

import java.util.Scanner;

public class no03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int temp = 0;	
		System.out.println("두 자리 이하의 정수를 입력해주세요.");
		System.out.println("1번째 정수 : ");
		arr[0] = sc.nextInt();

		
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i+1 + "번째 정수 : ");
			temp = sc.nextInt();
			/*
				if문의 조건때문에 i를 항상 1로 초기화하시는 건가요???
				앞에 코드들도 항상 i를 1로 초기화하길래 궁금해서요~~ ^^
			*/
			if (arr[i-1] < temp) {
				arr[i] = temp;
			} else {
				for (int j = 0; j <= i-1; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.print("보다 큰 수가 와야합니다.\n");
				i--;
			}
		}
		sc.close();
		
		System.out.println("=====PRINT=====");
		for(int k : arr) {
			System.out.print(k + " ");
		}
		
		int frontNum = 0, backNum = 0;
		
		System.out.println("\n\n====REVERSE====");
		for(int i = arr.length - 1; i >= 0; i--) {

			frontNum = arr[i] % 10;
			backNum = arr[i] / 10;
			
			if (frontNum != 0) {
				System.out.printf("%d%d ", frontNum, backNum);				
			} else {
				System.out.printf("%d ", backNum);
			}
		}
	}
}
