package kr.ac.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class PromptFunc {
	
	private Scanner sc = new Scanner(System.in);
	
	public boolean createFolder(File curDir) {
		
		boolean ret = false;
		
		System.out.println("폴더 생성");
		System.out.print("폴더 이름을 입력하세요 : ");
		String str = sc.nextLine();
		File f = new File(curDir.getPath() + "/" + str);
		
		if(!f.exists()) {
			f.mkdir();
			System.out.println("폴더 생성 완료");
			ret = true;
		}
		else {
			System.out.println(str + "의 이름을 가진 폴더가 이미 존재합니다.");
		}
		
		return ret;
	}
	
	public boolean renameFile(File curDir) {
		
		boolean ret = false;
		
		System.out.println("파일 이름 변경");
		System.out.print("변경하길 원하는 폴더/파일의 이름을 입력하세요 : ");
		String str = sc.nextLine();
		File f = new File(curDir.getPath() + "/" + str);
		
		if(f.exists()) {
			System.out.print("변경할 이름을 입력하세요 : ");
			str = sc.nextLine();
			
			f.renameTo(new File(curDir.getPath() + "/" + str));
			
			System.out.println("폴더/파일 이름 변경 완료");
			ret = true;
		}
		else {
			System.out.println(str + "는 존재하지 않는 폴더/파일 입니다.");
		}
		
		return ret;
	}
	
	public boolean deleteFile(File curDir) {
		
		boolean ret = false;
		
		System.out.println("폴더/파일 삭제");
		System.out.print("변경하길 원하는 폴더/파일의 이름을 입력하세요 : ");
		String str = sc.nextLine();
		File f = new File(curDir.getPath() + "/" + str);
		
		if(f.exists()) {
			if(f.delete()) {
				System.out.println("폴더/파일 삭제 완료");
				ret = true;
			}
			System.out.println("폴더/파일 삭제 실패");
			
		}
		else {
			System.out.println(str + "는 존재하지 않는 폴더/파일 입니다.");
		}
		
		return ret;
	}
	
	public File moveParentFolder(File curDir) {
		
		File pFile = null;
		
		System.out.println("상위경로 이동");
		
		pFile = curDir.getParentFile();
		if(!(pFile == null)) {
			System.out.println("이동 성공");
		} 
		else {
			System.out.println("이동 실패 - 최상위 경로 입니다.");
		}
		
		return pFile;
	}
	
	public File moveSubFolder(File curDir) {
		
		File pFile = null;
		
		System.out.println("하위경로 이동");
		
		if(!(curDir.listFiles().length == 0)) {
			System.out.print("이동하길 원하는 폴더/파일의 이름을 입력하세요 : ");
			
			String str = sc.nextLine();

			pFile = new File(curDir.getPath() + "/" + str);
			
			if(pFile.exists()) {
				System.out.println("이동 성공");
			}
			else
			{
				System.out.println(str + "은 없는 폴더/파일 입니다.");
			}
			
		} 
		else {
			System.out.println("이동 실패 - 최하위 경로 입니다.");
		}
		
		return pFile;
		
	}
}
