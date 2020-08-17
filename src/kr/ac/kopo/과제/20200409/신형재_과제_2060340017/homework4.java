package homework0409;

/*
 * 2060340017 신형재 과제 4번
 * 
 * 정수 및 정수를 나눌 수를 입력 받고 나눈 후 나머지와 몫을 출력
 */
import java.util.Scanner;
// 사용자로부터 수 입력을 받기 위해 Scanner import

public class homework4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		// 사용자로부터 정수 입력
		
		// 입력된 값이 양수인 경우만 허용, 음수인 경우 별도 메세지 출력 
		if(num>0) {
		System.out.print("나눌 수를 입력하세요 : ");
		int div = sc.nextInt();
		
		if(div >0) {
		System.out.println("몫 : "+ num/div);
		System.out.println("나머지 : "+ num%div);
		} else {
			System.out.println("1 이상을 입력해 주세요.");
		}
		} else {
			System.out.println("1 이상을 입력해 주세요.");
		}
	}

}
