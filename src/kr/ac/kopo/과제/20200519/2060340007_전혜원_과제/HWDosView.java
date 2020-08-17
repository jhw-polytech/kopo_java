package kr.ac.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HWDosView {

	private Scanner sc = new Scanner(System.in);
	private HWDosUtil dosUtil;
	private File file = new File("iotest");
	private File[] fileList = file.listFiles();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public HWDosView() {
		dosUtil = new HWDosUtil();
	}

	// 실행 메소드
	public void exe() {
		while (true) {
			folderInfo();
			menu();
		}
	}

	// 콘솔에 폴더정보를 출력하는 메소드
	public void folderInfo() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t\t\t" + file.getName() + "의 폴더정보");
		System.out.println("---------------------------------------------------------------");
		System.out.println("  파일명\t종류\t크기\t마지막수정날짜");
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < fileList.length; i++) {
			String name = fileList[i].getName();
			System.out.print((i + 1) +"  "+ name + "\t");

			boolean bool = fileList[i].isFile();
			System.out.print(bool ? "FILE\t" : "Dir\n");

			if (bool) {
				long length = fileList[i].length();
				System.out.print(length + " bytes\t");

				long lastTime = fileList[i].lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:ss");
				System.out.println(sdf.format(new Date(lastTime)));
			}
		}

		System.out.println("---------------------------------------------------------------");

	}

	// 폴더정보를 확인 후 어떤 동작을 실행할지 고르는 메뉴 메소드
	public void menu() {

		System.out.println("[C]폴더생성 [R]이름수정 [D]삭제 [.]상위폴더이동 [m]하위폴더이동 [Q]종료");
		String command = sc.nextLine();

		switch (command) {
		case "C":
		case "c":
			dosUtil.createFolder();
			break;
		case "R":
		case "r":
			dosUtil.reName();
			break;
		case "D":
		case "d":
			dosUtil.deleteFolder();
			break;
		case ".":
			dosUtil.goToParentDirectory();
			break;
		case "M":
		case "m":
			dosUtil.goDownDirectory();
			break;
		case "Q":
		case "q":
			sc.close();
			dosUtil.exitSystem();
			break;
		}
	}

}
