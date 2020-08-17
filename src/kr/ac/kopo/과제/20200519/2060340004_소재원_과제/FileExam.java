package kr.ac.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileExam {
	
	private Scanner sc = new Scanner(System.in);
	private int seq;
	private String select;
	private File file;
	private String[] fileList;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void startFileSystem(String path) {

		file = new File(path);
		fileList = file.list();
		
		System.out.println("==============================================================================");
		System.out.println("\t\t\t\t" + file.getPath() + "\t\t");
		System.out.println("==============================================================================");
		System.out.println("\t이름\t\t\t종류\t\t크기\t\t마지막수정일");

		for (int i = 0; i < fileList.length; i++) {
			
			System.out.printf("%-20s", file.listFiles()[i].getName());
			System.out.printf("%-20s", file.listFiles()[i].isDirectory() ? "DIR" : "FILE");
			System.out.printf("%-20s", file.listFiles()[i].length()+"byte(s)");
			System.out.printf("%-30s", sdf.format(file.listFiles()[i].lastModified()));
			System.out.println();
		}
		System.out.println("==============================================================================\n");
		
		System.out.println("[C] 폴더 생성,[R] 이름 수정, [D] 삭제, [.] 상위로 이동, [M] 하위폴더 이동, [Q] 종료");
		System.out.println("수행할 작업 : ");
		select = sc.nextLine();
		
		
		System.out.println("선택 : " + select);
		switch(select) {
		
		case "C" :  FileManage.makeFolder(file);
					break;
		case "R" :  System.out.println("수정하기 원하는 파일의 순서를 입력해주세요.");
					seq = Integer.parseInt(sc.nextLine()) - 1;
					FileManage.rename(file.listFiles()[seq]);
					break;
		case "D" :  System.out.println("삭제를 원하는 파일의 순서를 입력해주세요.");
		            seq = Integer.parseInt(sc.nextLine()) - 1;
					FileManage.delete(file.listFiles()[seq]);
					break;
		case "." :	FileManage.upTo(file);
					break;
		case "M" :  System.out.println("이동할 하위 디렉토리 순서를 입력해주세요.");
					seq = Integer.parseInt(sc.nextLine()) - 1;
					FileManage.underTo(file.listFiles()[seq]);
					break;
		case "Q" :  System.out.println("종료합니다");
					System.exit(0);
		}
	}
	
	
}

