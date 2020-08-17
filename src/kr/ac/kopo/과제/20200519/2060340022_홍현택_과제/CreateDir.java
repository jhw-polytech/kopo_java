package kr.co.hana.homework14;

import java.io.File;
import java.util.Scanner;

public class CreateDir {
	public static void createDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더 이름을 입력하세요");
		String str = sc.nextLine();
		
		File folder = new File(str);

		if (!folder.exists()) {
			try {
				folder.mkdir();
				System.out.println("폴더 생성");
			}

			catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			System.out.println("동일한 폴더가 이미존재");
		}
	}
}