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
		print("데이터 입력 방식을 선택하세요(1 또는 2)");
		print("1. Stack(선입 후출)");
		print("2. Queue(선입 선출)");
		print("3. 종료");
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
				print("종료합니다.");
				check=false;
				break;
			}else {
				print("잘못된 입력입니다. 1~3 사이의 수를 입력해 주세요.");
				execute();
			}
		}
		
	}
}