package kr.co.hana.homework14;

import java.io.File;
import java.util.Scanner;

public class DeleteDir {
	public static void deleteDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 디렉토리명을 입력하세요.");
		String delDir = sc.nextLine();

		File folder = new File(delDir);

		try {
			while (folder.exists()) {
				File[] folderList = folder.listFiles();

				for (int i = 0; i < folderList.length; i++) {
					folderList[i].delete();
					System.out.println("파일을 삭제했습니다.");
				}

				if (folderList.length == 0 && folder.isDirectory()) {
					folder.delete();
					System.out.println("디렉토리를 삭제했습니다.");
				} 
				break;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println("[" + delDir + "] 디렉토리가 존재하지 않습니다");
	}
}
