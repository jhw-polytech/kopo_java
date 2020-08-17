package homework0428_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QueueUtil {

	Scanner sc = new Scanner(System.in);
	QueueView qv = new QueueView();
	List<String> queueList = new ArrayList<>();
	boolean check;
	
	public String scanStr(String msg) {
		System.out.println(msg);
		String val = sc.nextLine();
		return val;
	}
	
	public boolean isEmpty() {
		if(queueList.size()<1) {
			System.out.println("Queue�� ��� �ֽ��ϴ�. �����͸� ������ �ּ���.");
			check = true;
			return check;
		}else {
			check = false;
			return check;
		}
	}	
	public void offer() {
		String value = scanStr("�Է� ���� �־��ּ���.");
		queueList.add(value);
	}
	public void pool() {
		queueList.remove(0);
		System.out.println("���� ���� �Էµ� �����͸� �����Ͽ����ϴ�.");
	}
	public void print() {
		System.out.println("������ ��� : " + Arrays.deepToString(queueList.toArray()));
	}
	
}