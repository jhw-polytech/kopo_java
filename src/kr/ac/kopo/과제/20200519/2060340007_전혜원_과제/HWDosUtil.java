package kr.ac.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HWDosUtil {

	private String currentDir = "optest";
	private Scanner sc = new Scanner(System.in);

	
	// 폴더를 생성하는 메소드
	public void createFolder() {
		System.out.println("생성할 폴더의 이름을 입력하세요.");
		String newDir = sc.nextLine();
		
		File newDirObj = new File(currentDir + "\\" + newDir);
		System.out.println(newDirObj.mkdir() ? 
				newDir + "새 폴더가 생성되었습니다."
				: newDir + "새 폴더 생성에 실패했습니다.");
	}

	// 폴더 이름을 수정하는 메소드
	public void reName() {
		System.out.println("변경할 파일을 입력하세요.");
		String name = sc.nextLine();
		File obj = new File(currentDir + "\\"+name);
		if(obj.exists()!=true) {
			System.out.println("존재하지 않는 파일입니다.");
		} else {
			System.out.println("변경할 이름을 입력하세요.");
			String newName = sc.nextLine();
			obj.renameTo(new File(currentDir + "\\" + newName));
		}		
		
		System.out.println("폴더 이름이 수정되었습니다.");

	}

	// 폴더를 삭제하는 메소드
	public void deleteFolder() {
		System.out.println("삭제할 폴더의 이름을 입력하세요.");
		
		String name = sc.nextLine();
		File obj = new File(currentDir + "\\" + name);
		boolean check = obj.delete();
		System.out.println(check? "삭제 성공" : "삭제 실패");		
		
		System.out.println("폴더 삭제가 완료되었습니다."); 
	}

	// 상위 폴더로 이동하는 메소드
	public String goToParentDirectory() {
		File obj = new File(currentDir);
		currentDir = obj.getParent();
		return currentDir;
	}

	// 하위 폴더로 이동하는 메소드
	public void goDownDirectory() {
		System.out.println("이동할 하위 폴더를 입력하세요.");
		String name = sc.nextLine();
		currentDir = currentDir + "\\" + name;
	}

	// 프로그램을 종료하는 메소드
	public void exitSystem() {
		System.exit(0);
	}

}
