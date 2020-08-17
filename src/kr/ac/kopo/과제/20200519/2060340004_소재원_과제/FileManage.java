package kr.ac.kopo.day14.homework;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileManage {
	
	private static FileWriter fw = null;
	private static Scanner sc = new Scanner(System.in);
	private static String fileName;
	private static String rePath;
	private static FileExam fe = new FileExam();
	
	public static void makeFolder(File file) {
		
		String path = file.getPath();
		System.out.println("원하시는 파일명을 입력해주세요.");
		fileName = sc.nextLine();
		File newFolder = new File(file.getPath()+"/"+ fileName);
		newFolder.mkdir();
	}
	
	public static void rename(File file) {

		String filePath = file.getParent() + "\\";
		System.out.println("바꿀 파일명을 입력해주세요.");
		fileName = sc.nextLine();

		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		file.renameTo(new File(filePath+fileName));
		System.out.println("파일명을 변경하였습니다.");
		
	}
	
	public static void delete(File file) {
		
		if(file.exists()) {
			file.delete();
			System.out.println(file.getName() + "파일을 삭제했습니다.");
		} else {
			System.out.println("파일 삭제에 실패했습니다.");
		}
	}
	
	public static void upTo(File file) {

		if (file.getParent() == null) {
			System.out.println("최상위 디렉토리입니다.");
			fe.startFileSystem(file.getPath());
		} 
		
		rePath = file.getParent();
		fe.startFileSystem(rePath);
		
	}
	
	public static void underTo(File file) {
		if(file.listFiles().length==0) {
			System.out.println("최하위 디렉토리입니다.");
			fe.startFileSystem(file.getParent());
		}
		
		if(!file.isDirectory()) {
			System.out.println("디렉토리가 아닙니다.");
			fe.startFileSystem(file.getParent());
		}

		fe.startFileSystem(file.getPath());
	}
}
