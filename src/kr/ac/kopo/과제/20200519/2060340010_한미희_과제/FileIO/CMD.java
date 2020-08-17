package kr.ac.kopo.day14.assignment;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CMD{

	public static File currentDirObj = null;
	private Scanner sc;
	private SimpleDateFormat sdf;
	
	CMD(){
		currentDirObj = new File("iotest");
		sc = new Scanner(System.in);
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	}
	
	public void view() {
		while(true) {
			info();
			String option = sc.nextLine();

			if("Cc".contains(option)) {
				new MakeDir().execute();
			}
			else if("Rr".contains(option)) {
				new RenameDir().execute();
			}
			else if("Dd".contains(option)) {
				new DeleteFile().execute();
			}
			else if(option.equals(".")) {
				new UpDirectory().execute();
			}
			else if("Mm".contains(option)) {
				new DownDirectory().execute();
			}
			else if("Qq".contains(option)) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("잘못 선택했습니다.");
			}
			System.out.println();
		}
	}

	
	public void info() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t\t\t"+ currentDirObj + " 폴더 정보"); 
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("이름\t\t\t종류\t\t크기\t\t마지막수정날짜");
		System.out.println("--------------------------------------------------------------------------");

		File[] list = currentDirObj.listFiles();
		
		for(File f : list) {
			System.out.println(f.getName() + "\t\t\t" 
							+ (f.isDirectory() ? "dir" : "file") + "\t\t" 
							+ (f.isDirectory() ? "" : f.length())+ "\t\t" 
							+ (f.isDirectory() ? "" : sdf.format(new Date(f.lastModified()))));
		}
		System.out.println("[C]폴더생성 [R]이름수정 [D]삭제 [.]상위폴더이동 [M]하위폴더이동 [Q]종료  ");
		System.out.print("선택: ");
		
	}

	
}
