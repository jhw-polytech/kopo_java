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
			System.out.println("Stack이 비어 있습니다. 데이터를 삽입해 주세요.");
			check = true;
			return check;
		}else {
			check = false;
			return check;
		}
	}
	
	public void push() {
		String value = scanStr("입력 값을 넣어주세요.");
		stackList.add(value);
	}
	public void pop() {
		stackList.remove(stackList.size()-1);
		System.out.println("가장 최근에 입력된 데이터를 삭제하였습니다.");
	}
	public void print() {
		System.out.println("데이터 출력 : " + Arrays.deepToString(stackList.toArray()));
	}
	
}