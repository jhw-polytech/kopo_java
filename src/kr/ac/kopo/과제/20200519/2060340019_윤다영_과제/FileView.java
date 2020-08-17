package kr.ac.kopo.assignment.day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileView {
	
	private Scanner sc;
	private static File dirObj;
	private SimpleDateFormat sdf;	
	
	
	public FileView() {
		sc = new Scanner(System.in);
		dirObj = new File("C:\\Lecture\\java-workspace\\java\\iotest");	 //기본위치를 iotest로 설정한다.
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	
	public void menu() {
		String[] strArr = dirObj.list();
		
		System.out.println("-----------------------------------------------");
		System.out.print("현재 위치 : " + dirObj.getAbsolutePath()+"\n");		
		System.out.println("-----------------------------------------------");
		System.out.print("이름\t\t종류\t크기\t마지막수정날짜\n");
		for(int i = 0; i < strArr.length; i++) {
			File fileIn = new File(dirObj.getPath() + "\\" + strArr[i]);
			System.out.printf(strArr[i] + "\t\t" + (fileIn.isDirectory() ? "dir" : "file") + "\t" 
							+ fileIn.length() + "\t" + sdf.format(new Date(fileIn.lastModified()))+"\n");			
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("[c]디렉토리생성 , [f]파일생성, [r]이름수정, [d]삭제, [.]상위폴더이동, [m]하위폴더이동");
		
		this.selectMenu();
	}
	
	public void selectMenu() {
		
		char select = sc.nextLine().charAt(0);
		
		switch(select){
			case 'c': MakeDirectory mkd = new MakeDirectory();
					  mkd.makeDir(dirObj);
					  break;
			case 'f': MakeFile mkf = new MakeFile();
					  mkf.makeFile(dirObj);
					  break;
			case 'r': NameEdit edit = new NameEdit();
					  edit.edit(dirObj);
					  break;
			case 'd': Delete del = new Delete();
					  del.delete(dirObj);
					  break;
			case '.': dirObj = dirObj.getParentFile();
					  System.out.println("현재 디렉토리 : " + dirObj.getAbsolutePath());
					  break;
			case 'm': Move move = new Move();
					  dirObj = move.move(dirObj);
					  System.out.println("현재 디렉토리 : " + dirObj.getAbsolutePath());
					  break;
			default:
					System.out.println("잘못 입력했습니다.");
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
			
		}
		
		
	}

}
