package hw.hw12.File;

import java.io.File;
import java.util.Scanner;

public class FileView {
	
	public static String pwd="C:\\Users\\HP\\eclipse-workspace\\01\\haha\\iotest";
	Scanner sc;
	private String ipt="";
	File dirObj = new File(pwd);
	
	public void execute() {
		sc = new Scanner(System.in);
		ShowList sl = new ShowList();
		
		sl.listall(dirObj);
		
		while(true) {
			System.out.println("[M]폴더생성  [R]파일 이름 수정  [D]삭제  [C]상위폴더이동  [E]하위이동폴더이동 [S]해당경로리스트확인  [Q]종료");
			System.out.print("원하는 메뉴를 선택하세요 : ");
			ipt=sc.nextLine();
			switch(ipt) {
				case "M":
				case "m":
					MakeDir md = new MakeDir();
					md.process(dirObj);
					break;
				case "R":
				case "r":
					ReName rn = new ReName();
					rn.process(dirObj);
					break;
				case "D":
				case "d":
					Delete d = new Delete();
					d.process(dirObj);
					break;
				case "C":
				case "c":
					MoveUp mu = new MoveUp();
					mu.process(dirObj);
					break;
				case "E":
				case "e":
					MoveDown mdd = new MoveDown();
					mdd.process(dirObj);
					break;
				case "S":
				case "s":
					sl.listall(dirObj);
					break;
				case "Q":
				case "q":
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
					break;
				
			}
			
			
				
		}
	}
}
