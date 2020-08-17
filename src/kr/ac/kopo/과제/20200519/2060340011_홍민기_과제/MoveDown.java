package kr.ac.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class MoveDown implements FileUsable {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		File file = new File(FileCMD.path);
		if(file.list().length==0) {
			System.out.println("비어있는 폴더 입니다.");
			return;
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("하위 폴더를 선택하세요");

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
		
		String newPath =file.list()[choice-1];
		FileCMD.path = FileCMD.path+"\\"+newPath;
	}

}
