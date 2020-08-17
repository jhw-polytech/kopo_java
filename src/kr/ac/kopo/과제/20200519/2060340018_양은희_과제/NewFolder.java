package dirFile;

import java.io.File;
import java.util.Scanner;

public class NewFolder {
	
	public static String folderName;
	static Scanner sc = new Scanner(System.in);
	
	public static void newFolder(File f) {
		String path = f.getPath();
		System.out.println("생성할 폴더 이름 : ");
		folderName = sc.nextLine();
		File newFolder = new File(f.getPath() + "/" + folderName);
		newFolder.mkdir();		
	}
}
