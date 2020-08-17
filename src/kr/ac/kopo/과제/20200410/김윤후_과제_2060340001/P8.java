package Assignment02;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단을 입력");
		int start =sc.nextInt();
		sc.nextLine();
		
		System.out.println("종료단을 입력");
		int end =sc.nextInt();
		sc.nextLine();
		
		if(start<end) {
			for (int i=start ; i<=end; i++) {
				System.out.printf("**%d단**",i);
				System.out.println();
				for (int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %d ", i,j,i*j);
					System.out.println();
				}
			System.out.println();
			
			}
		
		}
		else{
			for (int i=end ; i<=start; i++) {
				System.out.printf("**%d단**",i);
				System.out.println();
				for (int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %d ", i,j,i*j);
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}	
		
//입력받은 변수사이의 구구단을 출력하기위해 이중 for문을 사용함
//Start와 End값이 달라도 그대로 도출하기위해 if문을 사용하여 start보다 end가 커도 구구단을 그대로 도출하도록함.