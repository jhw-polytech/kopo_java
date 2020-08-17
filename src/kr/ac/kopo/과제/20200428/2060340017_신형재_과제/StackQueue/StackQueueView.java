package homework0428_1;
import java.util.Scanner;

public class StackQueueView {
	
	Scanner sc = new Scanner(System.in);
	
	int select1;
	boolean check=true;
	
	public void print(String msg) {
		System.out.println(msg);
		
		
	}
	
	public void execute(){
		print("������ �Է� ����� �����ϼ���(1 �Ǵ� 2)");
		print("1. Stack(���� ����)");
		print("2. Queue(���� ����)");
		print("3. ����");
		select1 = sc.nextInt();
		sc.nextLine();
		
		while(check) {
			if(select1==1) {
				StackView sv= new StackView();
				sv.execute();
				break;
			}else if(select1==2) {
				QueueView qv = new QueueView();
				qv.execute();
				break;
			}else if(select1==3){
				print("�����մϴ�.");
				check=false;
				break;
			}else {
				print("�߸��� �Է��Դϴ�. 1~3 ������ ���� �Է��� �ּ���.");
				execute();
			}
		}
		
	}
}