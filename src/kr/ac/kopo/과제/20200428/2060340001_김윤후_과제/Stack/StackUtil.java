package homework;

import java.util.ArrayList;
import java.util.Scanner;

/*
	ArrayList는 동적이기 때문에 굳이 top을 몰라도.... 맨마지막 데이터를 알수있지 않을까요??????????
*/
public class StackUtil {

	Scanner sc=new Scanner(System.in);
	static int top =-1;
	String str;
	
	ArrayList<String> sta= new ArrayList<String>();
	
	public void pushStack(ArrayList<String> sta) {
		System.out.println("������ �Է��ϼ���");
		str=sc.nextLine();
		sta.add(str);
		top++;
		System.out.println("���� ��ȣ:"+ top+" �Է��� ������"+str);
	}
	
	public void popStack(ArrayList<String> sta) {
		if(top==-1) {
			System.out.println("������ �����");
			
		}
		else {
			System.out.println(sta.get(0)+"������ ����");
			sta.remove(top);
			top--;
		}
	}
	
	
	public void stackView(ArrayList<String> sta) {
		System.out.println("���� ����");
		for(String a : sta) {
			System.out.println(a);
		}
		System.out.println();
		
	}
}
