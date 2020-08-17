package homework0519;

import java.util.Scanner;

public class MakeDown {
	Scanner sc=new Scanner(System.in);
	public void start(String str) {
		System.out.println("이동할 폴더명은 ?");
		String name = sc.nextLine();
		str = str+"\\"+name;
		System.out.println("이동 완료");
	}
}
