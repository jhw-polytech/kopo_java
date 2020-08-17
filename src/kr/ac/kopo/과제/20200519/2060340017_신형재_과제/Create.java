package homework0519;

import java.io.File;
import java.util.Scanner;

public class Create {
	Scanner sc = new Scanner(System.in);
	public void start(String str) {
		System.out.println("생성할 폴더 이름은 ?");
		String name = sc.nextLine();
		
		File newDirec = new File(str+"\\"+name);
		boolean check = newDirec.mkdir();
		System.out.println(check? "폴더 생성 성공" : "폴더 생성 실패");
	}
}
