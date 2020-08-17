package kr.ac.kopo.day14.homework;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Update implements FileUsable {

	@Override
	public void execute() {
		
		File file = new File(FileCMD.path);
		if(file.list().length==0) {
			System.out.println("비어있는 폴더 입니다.");
			return;
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 변경할 폴더를 선택하세요");
		
		for(int i=0;i<file.list().length;i++) {
			System.out.println((i+1)+". "+file.list()[i]);
		}
		
		int choice =-1;
		while(true) {
			System.out.print("선택(번호) : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice >file.list().length) {
				System.out.println("없는 디렉토리 입니다.");
			}
			else if(choice>=1 && choice<=file.list().length) {
				break;
			}
		}
		
		
		String newName = "";
		while(true) {
			System.out.print("바꿀 이름을 입력하세요 : ");
			
			newName = sc.nextLine();
			File curFile = new File(FileCMD.path);

			boolean check = true;
			for(int i=0;check &&i<curFile.list().length;i++) {
				if(curFile.list()[i].equals(newName)) {
					check = false;
					break;
				}
			}
			if(check) {
				break;
			}
			else {
				System.out.println(newName+"(은)는 중복된 이름입니다.");
			}
		}
		
		File reNameFile = new File(FileCMD.path+"\\"+file.list()[choice-1]);
		reNameFile.renameTo(new File(FileCMD.path+"\\"+newName));
		
		reNameFile.setLastModified(System.currentTimeMillis());
		System.out.println("파일 이름 수정을 완료했습니다.");
	}

}
