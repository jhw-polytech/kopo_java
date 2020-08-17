package homework0428_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StackUtil {
	
	Scanner sc = new Scanner(System.in);
	StackView sv = new StackView();
	List<String> stackList = new ArrayList<>();
	boolean check;
	
	public String scanStr(String msg) {
		System.out.println(msg);
		String val = sc.nextLine();
		return val;
	}
	
	public boolean isEmpty() {
		if(stackList.size()<1) {
			System.out.println("Stack�� ��� �ֽ��ϴ�. �����͸� ������ �ּ���.");
			check = true;
			return check;
		}else {
			check = false;
			return check;
		}
	}
	
	public void push() {
		String value = scanStr("�Է� ���� �־��ּ���.");
		stackList.add(value);
	}
	public void pop() {
		stackList.remove(stackList.size()-1);
		System.out.println("���� �ֱٿ� �Էµ� �����͸� �����Ͽ����ϴ�.");
	}
	public void print() {
		System.out.println("������ ��� : " + Arrays.deepToString(stackList.toArray()));
	}
	
}