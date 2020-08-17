package kr.ac.kopo.assignment.day12;

import java.util.Scanner;

public class BoardView {
	
	private Scanner sc;
	
	public BoardView() {
		sc = new Scanner(System.in);
	}
	
	public String printInputString(String str) {
		System.out.print(str);
		String result = sc.nextLine();
		return result;
	}
	
	public int printInputInt(String str) {
		System.out.print(str);
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}
	
	public int printMenu() {
		
		System.out.println("----------------");
		System.out.println("<<�Խ��� ���� �ý���>>");
		System.out.println("----------------");
		System.out.println("1.��ü�Խù� ��ȸ");
		System.out.println("2.�۹�ȣ ��ȸ");
		System.out.println("3.�۵��");
		System.out.println("4.�ۼ���");
		System.out.println("5.�ۻ���");
		System.out.println("0.����");
		
		
		System.out.print("�޴� �� ó���� �׸��� �����ϼ��� : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		return select;
	}
	

}
