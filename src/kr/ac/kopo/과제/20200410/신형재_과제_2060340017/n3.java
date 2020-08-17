package homework0410;

/*
 * 2060340017 신형재 과제 3번
 * 
 * 입력되는 정수와 1 사이의 모든 정수를 출력하는 문제
 * for문을 통해 입력되는 정수 수만큼 반복을 진행,
 * 출력되는 숫자는 i로 입력 시 모든 정수 출력 가능 * 
 * 
 */
import java.util.Scanner;

public class n3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이 정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("<1 ~ "+ num+ " 100 정수 출력>");
		
		for(int i = 1; i<=num; i++) {
			System.out.printf("%d ",i);
		}
		
	}
}
