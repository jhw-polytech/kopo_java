package homework;

import java.util.Scanner;

public class BoardView {
	Scanner sc = new Scanner(System.in);
	BoardUtil BU = new BoardUtil();

	public void play() {
		System.out.println("1. ��ü �Խù� ��ȸ\n"
						 + "2. �� ��ȣ�� ��ȸ\n"
						 + "3. �� ���\n" 
						 + "4. �� ����\n"
						 + "5. �� ����\n"
						 + "0. ����");
		end:while (true) {
			System.out.println("\n�޴� �� ó���� �׸��� �����ϼ��� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			
			case 1:
				BU.searchAll();
				break;
			case 2:
				BU.search();
				break;
			case 3:
				BU.regist();
				break;
			case 4:
				BU.update();
				break;
			case 5:
				BU.del();
				break;
			case 0:	
				System.out.println("�Խ��� ���α׷��� �����մϴ�.");
				break end;
			}
			
		}
	}
}
