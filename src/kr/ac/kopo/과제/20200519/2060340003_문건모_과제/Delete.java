package kopo.ac.kr.day02;

import java.io.File;
import java.util.Scanner;

//안녕하세요 교수님, 어제 이것저것 시도를 해보다가 그만 잠들었습니다...다시 시작해보겠습니다
public class Delete {
	
	private File[] newFolder;
	private File delFile;
	private IotestList il;
	
	
	public Delete() {
		
	}
	
	public void delete(//파일 형태로 집어 넣을 것) {
		
		
		File[] newFolder = il.list;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제 시작");
		System.out.println("삭제할 폴더 또는 파일명을 입력하세요");		
		String str = sc.nextLine();
		
		
		for(File d : newFolder) {
		boolean dl = d.getName().contains(str);
		if(!dl) {
			System.out.println("삭제할 폴더 또는 파일명을 다시 입력하세요");
		}else {
			
			String newPath = d.getName().replace(str, ""); 
			delFile = new File(newPath);
			
			boolean bl = d.delete();
			System.out.println(bl ? "삭제 성공" : "삭제 실패");
			
		 }
		}	
		
	}
	
}
		
		


			