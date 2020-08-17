package dirFile;

import java.io.File;
import java.util.Scanner;

public class ReName {
	
	public static String fileName;
	static Scanner sc = new Scanner(System.in);
	
	public static void reName(File f) {
		String path = f.getParent();
		System.out.println("수정할 이름을 입력 : ");
		fileName = sc.nextLine();
		
		f.renameTo(new File(path+fileName));
		System.out.println("변경 완료");
		
	}

}
