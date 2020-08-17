package homework0519;

import java.io.File;
import java.util.Scanner;

public class Change {
	Scanner sc = new Scanner(System.in);
	public void print(String msg) {
		System.out.println(msg);
	}
	public void start(String str) {
		print("변경할 파일의 이름은? ");
		String name1 = sc.nextLine();
		File obj = new File(str+"\\"+name1);
		if(obj.exists()!=true) {
			print("잘못된 파일명입니다.");
		}else {
			print("새로운 이름은? ");
			String name2 = sc.nextLine();
			obj.renameTo(new File(str+"\\"+name2));
			print("변경 완료");
		}
	}
}
