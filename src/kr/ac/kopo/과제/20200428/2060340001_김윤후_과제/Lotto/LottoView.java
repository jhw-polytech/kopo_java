package homework;

import java.util.Scanner;

public class LottoView {
	private int ipt;
	
	LottoView(){}
	
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("게임의 수를 입력하세요 : ");
		ipt= sc.nextInt();
		sc.nextLine();
		
		Lotto lo = new Lotto();
		
		lo.useList(ipt); //리스트로 구하기. 
		lo.useTreeSet(ipt); //Treeset으로 구하기.
		lo.useHashSet(ipt); //Hashset으로 구하기.
		lo.useArr(ipt);  //int형 arr로 구하기

		
	}
}
