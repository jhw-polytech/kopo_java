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
			System.out.println("Queue이 비어 있습니다. 데이터를 삽입해 주세요.");
			check = true;
			return check;
		}else {
			check = false;
			return check;
		}
	}	
	public void offer() {
		String value = scanStr("입력 값을 넣어주세요.");
		queueList.add(value);
	}
	public void pool() {
		queueList.remove(0);
		System.out.println("가장 먼저 입력된 데이터를 삭제하였습니다.");
	}
	public void print() {
		System.out.println("데이터 출력 : " + Arrays.deepToString(queueList.toArray()));
	}
	
}