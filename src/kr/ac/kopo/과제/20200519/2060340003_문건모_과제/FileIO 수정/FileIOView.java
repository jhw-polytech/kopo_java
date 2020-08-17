package kopo.ac.kr.day02;

import java.util.Scanner;

public class FileIOView {
	
	public void execute() {
		
		Scanner sc = new Scanner(System.in);
		String path = "iotest";
		FileIO fi = new FileIO();
		
		while(true) {
			fi.getFileIO(path);
			System.out.println("[C]폴더생성 [R]이름수정 [D]삭제 [.]상위폴더이동 [M]하위폴더이동 [Q]종료");
			String choice = sc.nextLine();
			
			switch(choice) {
				
			case "C" :
				Create c = new Create();
				c.create(path);
				break;
			case "R" :
				Rename r = new Rename();
				r.Rename(path);
				break;
			case "D" :
				Delete d = new Delete();
				d.Delete(path);
				break;
			case "." :
				MoveUp mu = new MoveUp();
				path = mu.moveUp(path);
				break;
			case "M" :
				MoveDown md = new MoveDown();
				path = md.moveDown(path);
				break;
			case "Q" :
				System.out.println("종료합니다");
				System.exit(0); 
			}
			
		}
		
	}

}
