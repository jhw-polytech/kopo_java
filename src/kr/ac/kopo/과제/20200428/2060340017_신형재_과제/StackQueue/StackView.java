package homework0428_1;

import java.util.Scanner;

public class StackView {
	
	Scanner sc = new Scanner(System.in);
	boolean check=true;
	StackUtil su = new StackUtil();
	int select3;
	public int stackStart() {
		System.out.println("Stack �Է� ����� �����߽��ϴ�.");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ ����");
		System.out.println("3. ��ü ������ ���([0]~[size()-1)");
		System.out.println("4. ����");
		System.out.println("���ϴ� ����� �����ϼ���(1~4)");
		select3 = sc.nextInt();
		sc.nextLine();
		return select3;
	}
	
	public void execute() {
		stackStart();		
		while(check) {
			switch(select3) {
			case 1:
				su.push();
				break;
			case 2:
				su.pop();
				break;
			case 3:
				su.print();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				check=false;
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���.(1~4 ����)");
				break;
			}
		}
		
	}
}