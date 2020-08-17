package homework0420;

/*
 * 2060340017 신형재 과제 3번
 * ps. 배열 부분 확인 부탁드립니다.
 * 최종 영수증 출력 부분은 없던 부분이었으나, 코딩하던 와중에 배열에서 일부 오류를 확인하여
 * 검증하고자 추가하였습니다. 해당 결과 출력 시 오류가 발생하는데 어떤 부분에서 고쳐야 하는지 
 * 잘 모르겠습니다.
 * 
 * 이 부분은 교수님 답변과 별도로 수업 전까지 나름대로 다시 생각해 보겠습니다.
 */
 /*
	형재씨....
	우리가 아이스크림은 3개 구매하고 다시 계속할래에 의해서 2개를 다시 구매하면
	Ice.countP는 5가 됩니다.
	하지만 iceArr배열에는 처음에는 0, 1, 2에 저장 그 다음에는 0, 1에 저장이 될거에요

	printBill() 메소드에서는 Ice.countP만큼 반복을 하기 때문에 문제가 생기는 거 같네요....
	이해가실까요???
 */

import java.util.Scanner;
import java.util.Arrays;

public class IceMarket {
	Scanner sc = new Scanner(System.in);
	Ice ic = new Ice();
	int num;
	Ice[] iceArr = new Ice[100];
	
	
	int insertNum() {
		System.out.print("아이스크림 몇개 구입할래 ? ");
		num = sc.nextInt();
		sc.nextLine();
		Ice.countP++;
		return num;
	}
	void makeArr(int num) {
		String name;
		int price;
		for(int i = 0; i<num; i++) {
		System.out.println((i+1) + "번 ");
		System.out.print("아이스크림 명 : ");
		name = sc.nextLine();
		Ice.countNum++;
		System.out.print("아이스크림 가격 : ");	
		price = sc.nextInt();
		sc.nextLine();
		Ice.totalPrice += price;
		iceArr[i] = new Ice(name, price);
		}
	}
	void question() {
		System.out.println("계속 구매할래?(y/n)");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y') {
			insertNum();
			makeArr(num);
			question();
		}if(answer == 'n') {
			
		}
	}
	void printBill(int i) {
		System.out.println("번호\t 아이스크림명\t 아이스크림 가격\n");
		for(int j = 1; j<=i; j++) {
			System.out.println(j-1+"\t"+iceArr[j-1].name+"\t\t"+iceArr[j-1].price);
		}
	}
	void marketRun() {
		insertNum();
		makeArr(num);
		question();
		System.out.printf("총 %d 명의 고객이 아이스크림을 구매했습니다.\n", Ice.countP);
		System.out.printf("판매된 아이스크림의 총 개수 : %d\n", Ice.countNum);
		System.out.printf("총 판매액: %d\n\n\n", Ice.totalPrice);
		printBill(Ice.countNum);
	}
}
