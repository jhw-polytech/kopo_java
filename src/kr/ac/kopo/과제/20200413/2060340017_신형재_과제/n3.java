package homework0413;

/*
 * 2060340017 신형재 과제 3번
 * 
 *임의의 수 5개를 입력(이때 n번째 수는 n-1번째 수 보다 커야 한다.)
 *매 행마다 해당 정수 출력
 *규칙에 맞지 않을 때, 새로운 임의의 수 입력 요청
 *입력된 수 배열 출력
 *입력된 수 배열 역순으로 출력
 *
 */
import java.util.Scanner;

public class n3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int[] numArr = new int[5];
		//입력된 수 중 규칙에 어긋나는 수까지 보관하는 "보관"배열 추가(확인용)
		//해당 배열을 이용하여 현재 입력 수와 이전 수 비교 가능
		int[] 보관 = new int[100];
		
		for(int i = 1; i<=5; i++) {
			System.out.printf("%d번째 정수 : ", i);
			num = sc.nextInt();
			보관[i] = num;
			/*
			 * 입력된 수는 최초 "보관"배열에 입력되며, numArr은 이전에 입력한 수보다 큰 경우만 입력
			 */
			if(num > 보관[i-1]) {
				numArr[i-1] = num;
			}else {
				System.out.printf("%d보다 큰 수가 와야합니다.\n", 보관[i-1]);
				i--;
			}
			
		}
		//입력된 수 배열 출력
		System.out.println("< PRINT >");
		for(int j : numArr) {
			System.out.print(j + " ");
			}
		System.out.println();
		//역순으로 배열 출력
		/*
			역순으로 출력시 34가 43으로 출력이 되어야 합니다...
			한번만 더 생각해주세요
		*/
		System.out.println("< REVERSE >");
			for(int k = 4; k>=0; k--) {
			System.out.print(numArr[k] + " ");			
			}
	}
}