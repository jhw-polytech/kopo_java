package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardUtil {

	Scanner sc=new Scanner(System.in);
	
	private static int num;
	private ArrayList<UserInfo> arr = new ArrayList<>();
	private int num2;
	//�Խ��� �� ���
	
	
	public void regist () {

		UserInfo user =new UserInfo();
		
		System.out.println("���� �Է� : ");
		String title =sc.nextLine();
		user.setTitle();
		
		System.out.println("�۾��� �Է� : ");
		String Writer=sc.nextLine();
		user.setTitle();
		
		num +=1;
		user.setNum(num);
		
		arr.add(user);
	}
	
	
	//�� ����
	public void update() {
		
		System.out.println("������ �� ��ȣ��?");
		num2=sc.nextInt();
		sc.nextLine();
		
		for (UserInfo up : arr) {
				if(up.getNum()==num2) {
				System.out.println("���� ���Է�");
				
				up.setTitle();
				sc.nextLine();
				
				System.out.println("�۾��� ���Է�");
				up.setWriter();
				sc.nextLine();
			}
		}
	}
	//�� ����
	
	public void del() {
		int size= arr.size();
		
		System.out.println("������ �� ��ȣ��?");
		num2=sc.nextInt();
		sc.nextLine();
		
		for(int i =0; i< size; i ++) {
			int num = arr.get(i).getNum();
			if(num == num2) {
				arr.remove(arr.get(i));
				size--;
				i--;
			}
		}
		System.out.println("���� �Ϸ�");
	}
	//�� ��ȣ�� ��ȸ
public void search() {
		
		System.out.println("��ȸ�� �� ��ȣ �Է� : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		
		for(UserInfo notice : arr) {
			if(notice.getNum() == num2) {
				System.out.printf("%s\t%s\t\t%s\t%s\n", "��ȣ", "����", "�۾���", "�����");
				System.out.printf("%d\t%s\t\t%s\t%s\n",
								  notice.getNum(), notice.getTitle(), notice.getWriter(), notice.getDate());
				
			} 
		}
	}
	//��ü �Խù�
public void searchAll() {
	System.out.println("<��ü �Խñ� ��ȸ>");
	
	if(arr.size() == 0) {
		System.out.println("��ϵ� ���� �������� �ʽ��ϴ�!");
	}
	
	System.out.printf("%s\t%s\t\t%s\t%s\n", "��ȣ", "����", "�۾���", "�����");
	
	for(UserInfo notice : arr) {	
		System.out.printf("%d\t%s\t\t%s\t%s\n",
				  notice.getNum(), notice.getTitle(), notice.getWriter(), notice.getDate());
	}
	
}
}
