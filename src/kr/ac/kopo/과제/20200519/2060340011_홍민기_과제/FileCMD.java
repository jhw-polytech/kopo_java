package kr.ac.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FileCMD {

	private SimpleDateFormat sdf;
	private Scanner sc;
	private FileUsable use;
	public static String path;

	FileCMD(){
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		sc = new Scanner(System.in);

		File dirObj = new File("iotest");

		path = dirObj.getAbsolutePath();
		use = null;
	}

	public void windowR() {

		while(true) {
			print();

			String choice = sc.nextLine();

			if("Cc".contains(choice)) {
				use = new Create();
			}
			else if("Rr".contains(choice)) {
				use = new Update();
			}
			else if("Dd".contains(choice)) {
				use = new Remove();
			}
			else if(choice.equals(".")) {
				use = new MoveUp();
			}
			else if("Mm".contains(choice)) {
				use = new MoveDown();
			}
			else if("Qq".contains(choice)) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("잘못된 선택입니다.");
			}
			use.execute();
			System.out.println();
		}
	}

	public void print() {
		File dirObj = new File(path);
		System.out.println("--------------------------------------------");
		System.out.println("\t"+dirObj.getName() + "폴더 정보");
		System.out.println("--------------------------------------------");
		System.out.println("이름\t종류\t크기\t마지막수정날짜");
		System.out.println("--------------------------------------------");
		for(int i=0;i<dirObj.list().length;i++) {
			String fileName = dirObj.list()[i];
			File file = new File(path+"\\"+fileName);
			System.out.println(file.getName()+"\t"+(file.isDirectory() ? "dir" : "file") +
					"\t"+file.length()+
					"\t"+sdf.format(new Date(file.lastModified())));
		}
		System.out.print("[C]폴더생성 [R]이름수정 [D]삭제 [.]상위폴더이동 [M]하위폴더이동 [Q]종료 : ");
	}
}