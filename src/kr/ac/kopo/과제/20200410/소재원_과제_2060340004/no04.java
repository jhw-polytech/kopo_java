package exam0410;

import java.util.Scanner;

public class no04 {

	/*
	 * 메소드를 대충 이렇게 만드는 거 같은데..
	 * static을 빼니까 오류가 나더라구요..
	 * 아직 static을 잘 모르겠습니다 -_-;
	 */

	/*
		static은 조만간 곧 설명해드릴게요
		쉽게 생각하면 static을 포함한 메소드에서의 호출은 반드시 static만 가능합니다
	*/

	public static void printInteger(int a, int b) {
		
		System.out.printf("1 ~ %d 사이의 %d의 배수를 제외한 정수를 출력합니다.\n", a, b);
		int i = 0;
		while(i <= a) {
			if (i % b != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.printf("\n\n1 ~ %d 사이의 %d의 배수를 제외한 정수를 5개씩 출력합니다.\n", a, b);
		
		int k = 0;
		for (int j = 1; j <= a; j++) {
			
			if (j % b != 0) {
				System.out.printf("%2d ", j);
				k++;
				if (k % 5 == 0) {
					System.out.println();
				}
			} 
		}
	}
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1-100 사이의 정수를 입력하세요. :");
		a = sc.nextInt();
		System.out.println("2-10사이의 정수를 입력하세요 : ");
		b = sc.nextInt();
		sc.close();
		printInteger(a, b);
		
		
		
		
	}
	
}
