package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class Icecream {

	String name;
	int price;
	Scanner sc = new Scanner(System.in);

	// 아이스크림 정보 저장할 배열을 amount크기로 생성
	// 이름과 가격이 저장되어야 하므로 이차원 배열로 생성
	String iceArr[][];

	
	public void icecream() {
		
		//구입할 아이스크림의 갯수를 입력받음
		System.out.println("아이스크림을 몇개 구입할래? ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		inputIcecream(amount);
		outputIcecream(amount, iceArr);
		
		sc.close();
	}
	
	/*
		혜원씨 2차원배열 쓰면서 머리 터지지 않았어요??? ^^
		Icecream[]을 어떻게 하면 잘 사용할 수 있는지에 대한 고민을 조금만 더 해봐주셔요~~
	*/
	

	public String[][] inputIcecream(int amount) {
		iceArr = new String[amount][2];
		
		for (int i = 0; i < amount; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
			
			//아이스크림 이름을 i번째 배열 첫 번째칸에 저장
			System.out.println("아이스크림명: ");
			iceArr[i][0] = sc.nextLine();
			
			//아이스크림 이름을 i번째 배열 두 번째칸에 저장
			System.out.println("아이스크림 가격: ");
			iceArr[i][1] = sc.nextLine();
		}
		return iceArr;
	}

	public void outputIcecream(int amount, String[][] iceArr) {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력>\n", amount);
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n");
		for(int i=0; i<amount; i++) {
			System.out.printf("%d\t%s\t\t%s\n", i+1, iceArr[i][0], iceArr[i][1]);
		}
	}

}
