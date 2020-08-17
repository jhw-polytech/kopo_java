package homework;

import java.util.ArrayList;
import java.util.Scanner;

/*
	QueueUtil클래스를 만들어서 사용한다면 que라는 멤버변수는 QueueUtil 클래스내에서만 사용하고 외부에서는 메소드 호출을 통해서만 접근하게 하는게 좋을 거 같아요....
	QueueUtil qUtil = new QueueUtil();
	qUtil.push(10);
	qUtil.push(20);
	int data = qUtil.pop(); 	

	이런식으로요...
*/

public class QueueUtil {
	
	
	
	Scanner sc=new Scanner(System.in);
	static int top =-1;
	String str;
	
	ArrayList<String> que= new ArrayList<String>();
	
	public void pushQueue(ArrayList<String> que) {
		System.out.println("������ �Է��ϼ���");
		str=sc.nextLine();
		que.add(str);
		top++;
		System.out.println("ť ��ȣ:"+ top+" �Է��� ������"+str);
	}
	
	public void popQueue(ArrayList<String> que) {
		if(top==-1) {
			System.out.println("ť�� �����");
			
		}
		else {
			System.out.println(que.get(0)+"������ ����");
			que.remove(0);
			top--;
		}
	}
	
	
	public void queueView(ArrayList<String> que) {
		System.out.println("ť ����");
		for(String a : que) {
			System.out.println(a);
		}
		System.out.println();
		
	}
	
	
}
