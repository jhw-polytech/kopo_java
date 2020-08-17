package homework0519;

import java.io.File;
import java.util.Scanner;

public class Delete {
	Scanner sc = new Scanner(System.in);
	public void start(String str) {
		System.out.println("삭제할 이름은?");
		String name = sc.nextLine();
		File obj = new File(str+"\\"+name);
		boolean check = obj.delete();
		System.out.println(check? "삭제 성공" : "삭제 실패");
	}
}
