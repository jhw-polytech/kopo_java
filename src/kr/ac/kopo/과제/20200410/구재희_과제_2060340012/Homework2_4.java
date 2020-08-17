package jaeheehomework;
//Homework2_4new에 고친 코드 올렸습니다!
import java.util.Scanner;

public class Homework2_4 {
	public static void main(String[] args) {
		/*4. 1-100 사이의 정수를 입력 : 40
        2-10 사이의 정수를 입력 : 5
        <1 ~ 40사이의 5의 배수를 제외한 정수 출력>
        <1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
		 */
		System.out.println("4번\n");
		
		System.out.println("1 - 100 사이의 정수를 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int num9 = Integer.parseInt(sc.nextLine());
		System.out.println("2 - 10 사이의 정수를 입력 : ");
		int num10 = Integer.parseInt(sc.nextLine());
		sc.close();
		
		// 5의 배수 제외하고 출력
				System.out.printf("<1 ~ %d사이의 %d의 배수를 제외한 정수 출력>\n", num9, num10);
				for(int i = 1; i <= num9; i++) {
					if(i % num10 != 0) {
						System.out.print(i + " ");
					}
				}
				
				// 5열로 출력 -> 5의 배수일때 "\n"
				/*
					중간에 5개씩 찍으면서 라인이 여러줄 나오는 곳도 있지 않았어요???? 그랬을 거 같은데....
					45라인의 if문을 조금만 더 생각해보세요 수고하셨습니다 ^^
				*/
				System.out.printf("\n<1 ~ %d사이의 %d의 배수를 제외한 정수 %d개씩 출력>\n", num9, num10, num10);
				int j = 0;
				for(int i = 1; i <= num9; i++) {
					
					if(i % num10 != 0) {
						System.out.print(i + " ");
						
						//출력이 될때마다, 출력되는 개수를 세는 j변수 만듦
						j++;
					}
					// 출력된 개수(j)가 입력된 값의 개수가 되면 아래로 내림.
					if(j % num10 == 0) {
						System.out.print("\n");
					
					}
	
				}
	}
}
