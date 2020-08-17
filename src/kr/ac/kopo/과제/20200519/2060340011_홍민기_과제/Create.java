package kr.ac.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class Create implements FileUsable {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		while(true) {
			System.out.print("폴더의 이름을 적으시오 : ");
			name = sc.nextLine();
			File curFile = new File(FileCMD.path);

			boolean check = true;
			
			for(int i=0;check &&i<curFile.list().length;i++) {
				if(curFile.list()[i].equals(name)) {
					check = false;
					break;
				}
			}

			if(check) {
				break;
			}
			else {
				System.out.println(name+"(은)는 중복된 이름입니다.");
			}
		}
		File newDirObj = new File(FileCMD.path+"\\"+name);

		boolean bool = newDirObj.mkdir();

		if(bool) {
			System.out.println("폴더 생성 성공");
		}
		else {
			System.out.println("폴더 생성 실패");
		}
	}

}
