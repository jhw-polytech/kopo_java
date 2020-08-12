package kr.ac.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class HWDosUtil {

	private File idrObj;
	private String path;

	public HWDosUtil() {
		idrObj = new File("startDir");

	}

	public HWDosUtil(String folderName) {
		idrObj = new File("startDir");

		this.path = folderName;
	}

	// [C + 폴더명] 입력시 폴더를 생성하는 메소드
	public void createFolder(String folderName) {

		System.out.println("폴더 생성이 완료되었습니다.");

	}

	// [R + 폴더명] 입력시 폴더 이름을 수정하는 메소드
	public void reName(String folderName) {

		System.out.println("폴더 이름이 수정되었습니다.");

	}

	// [D + 폴더명] 입력시 폴더를 삭제하는 메소드
	public void deleteFolder(String folderName) {

		System.out.println("폴더 삭제가 완료되었습니다.");

	}

	// . 입력시 상위 폴더로 이동하는 메소드
	public void goToParentDirectory() {
		System.out.println("상위 폴더로 이동합니다.");

	}

	// [M + 폴더명] 입력시 하위 폴더로 이동하는 메소드
	public void goDownDirectory() {
		System.out.println("하위 폴더로 이동합니다.");

	}

	// [Q] 입력시 프로그램을 종료하는 메소드
	public void exitSystem() {
		System.exit(0);
	}

}
