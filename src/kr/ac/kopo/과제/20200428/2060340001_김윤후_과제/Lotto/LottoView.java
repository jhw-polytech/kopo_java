package homework;

import java.util.Scanner;

public class LottoView {
	private int ipt;
	
	LottoView(){}
	
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ ���� �Է��ϼ��� : ");
		ipt= sc.nextInt();
		sc.nextLine();
		
		Lotto lo = new Lotto();
		
		lo.useList(ipt); //����Ʈ�� ���ϱ�. 
		lo.useTreeSet(ipt); //Treeset���� ���ϱ�.
		lo.useHashSet(ipt); //Hashset���� ���ϱ�.
		lo.useArr(ipt);  //int�� arr�� ���ϱ�

		
	}
}
