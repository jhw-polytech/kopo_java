package kr.co.hana.homework14;

import java.io.File;
import java.util.Scanner;

public class RenameDir {
	public static void renameDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 디렉토리명을 입력하세요.");
		String exDir = sc.nextLine();
		File folder = new File(exDir);

		System.out.println("새로운 디렉토리명을 입력하세요.");
		String reDir = sc.nextLine();
		File folderNew = new File(reDir);

		if (folder.isDirectory()) {
			folder.renameTo(folderNew);
			System.out.println("디렉토리 명이 [" + reDir +"]로 변경");
		} else {
			System.out.println("[에러] 이름을 변경하지 못했습니다 : " + reDir);
		}
	}
}
