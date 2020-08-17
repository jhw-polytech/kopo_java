package test.copy;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Controller {
	private static Scanner sc = new Scanner(System.in);
	private static String fileName;
	private static String rePath;

	
	public static void make(File file) {
	
		System.out.println("폴더 생성을 선택하셨습니다.");
		System.out.println("폴더 이름: ");
		String str = sc.next();
		File newDirObj = new File(str);
		System.out.println(newDirObj.mkdir() ? " 폴더 생성 성공" : "폴더 생성 실패");
	}
	
	public static void rename(File fp) {

		String str= sc.next();
	    File file = new File("변경할 파일"+str);
	    File newFolder = new File(fp.getPath()+"/"+ str);
		newFolder.mkdir();
        
		if(fp.exists()) {
		String filePath = fp.getParent() + "\\";
		
		fp.renameTo(new File(filePath+fileName));
		System.out.println("파일명을 변경하였습니다.");
            
		}else{
			System.out.println("파일이 존재하지 않습니다.");
		}				
	}
	
	public static void delete(File fp) {	
		int num = sc.nextInt();
		if(fp.exists()) {
			fp.delete();	
			System.out.println(num + "파일을 삭제했습니다.");
		} else {
			System.out.println("파일 삭제에 실패했습니다.");
		}
	}
		
	public static void up(File fp) {
		String File = sc.next();
		File file = new File("이동할 파일"+File);
		if (fp.getParent() == null) {
			System.out.println("최상위 디렉토리입니다.");
		} 		
		rePath = file.getParent();	
	}
	
	public static void down(File fp) {
		String File = sc.next();
		File file = new File("이동할 파일"+File);
		
		if(fp.listFiles().length==0) {
			System.out.println("최하위 디렉토리입니다.");
		}		
		if(!file.isDirectory()) {
			System.out.println("디렉토리가 아닙니다.");
		}
	}
}