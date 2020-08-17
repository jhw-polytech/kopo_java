package homework0416;

/*
 * 2060340017 신형재 과제 1번
 * 아이스크림 갯수에 대한 임의의 수를 입력받은 위
 * 개별 아이스크림 정보 저장(class 활용)
 */
 /*
	혹시 키보드 입력이 잘못되어서 sc.next() 를 사용하신것은 아니시죠????
	sc.nextLine()에서 입력을 못받아서 고친거라면 슬퍼할겁니다~~ ^^
 */

import java.util.Scanner;

public class n1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림을 몇 개 구입할래? ");
		int num = sc.nextInt();
		//사용자로부터 아이스크림 갯수 입력
		Ice arr[];
		//클래스 선언
		arr= new Ice[num];
		//클래스에서 입력된 갯수만큼의 배열 생성
		for(int i=1; i<=num; i++) {
			arr[i-1] = new Ice();
			//배열 초기화
			System.out.println("*** " + i + "번째 아이스크림 구매 정보 ***");
			
			System.out.print("아이스크림 명 : ");
			arr[i-1].name = sc.next();
			
			System.out.print("아이스크림 가격 : ");
			arr[i-1].price = sc.nextInt();
			//입력되는 이름과 가격을 해당 배열(Ice클래스)에 저장
		}
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호     아이스크림명   아이스크림 가격");
		for(int i=0; i<num; i++) {
			System.out.printf("%2d    %6s       %8d\n", i+1, arr[i].name, arr[i].price);
		}// 각 열별로 칸을 배정하여 정렬
	}
}
