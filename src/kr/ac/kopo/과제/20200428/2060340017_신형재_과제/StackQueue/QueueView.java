package homework0428_1;

import java.util.Scanner;

public class QueueView {
	
	Scanner sc = new Scanner(System.in);
	boolean check = true;
	QueueUtil queueUtil = new QueueUtil();
	int select4;
	
	public int queueStart() {
		System.out.println("Queue �Է� ����� �����߽��ϴ�.");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ ����");
		System.out.println("3. ��ü ������ ���([0]~[size()-1)");
		System.out.println("4. ����");
		System.out.println("���ϴ� ����� �����ϼ���(1~4)");
		select4 = sc.nextInt();
		return select4;
	}

	public void execute() {
		queueStart();	
		while(check) {
			if(select4==1) {
				queueUtil.offer();
				break;
			}else if(select4==2) {
				queueUtil.pool();
				break;
			}else if(select4==3) {
				queueUtil.print();
				break;
			}else if(select4==4) {
				System.out.println("�����մϴ�.");
				check=false;
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���.(1~4 ����)");
				execute();
				break;
			}
		}
		
	}
	
}