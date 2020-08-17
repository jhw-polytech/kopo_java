package test.copy;

//교수님... 좀 더 공부하겠습니다..

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class BoardMenu{ 
	
	void setMenu() {
		
		Scanner sc = new Scanner(System.in);
		List<File> files = new ArrayList<>();
		
		//File fileObj = new File("iotest");
		File dirObj = new File("iotest");
		
		if(!dirObj.exists())
			dirObj.mkdir();
		
		File[] f = dirObj.listFiles();
		
		for(int i = 0; i < f.length; i++) {
		files.add(f[i]);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("           " + dirObj.getName());
		System.out.println("---------------------------------------------");
		System.out.println("이름\t종류\t크기\t마지막 수정날짜");
		System.out.println("---------------------------------------------");
				
		
		for(File fp : files) {
			if(fp.isFile())
			{
				long lastTime = fp.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				
				System.out.println(fp.getName() + "\t" + "FILE" + "\t" + fp.length()  + "\t" + sdf.format(new Date(lastTime)));
			}
			else {	// isDirectory
				System.out.println(fp.getName() + "\t" + "DIR");
			}		
		}
		
		while(true) {

            System.out.println();
			System.out.println("[1]폴더생성 [2]이름수정 [3]삭제 [4]상위폴더이동 [5]하위폴더이동 [0]종료 ");
			System.out.println("---------------------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			int sel = sc.nextInt();

			
     		Controller c = new Controller();
     		
			if(sel == 1) {	
				c.make(dirObj);
				
			}else if(sel ==2) {
				System.out.println("이름 수정을 선택하셨습니다. ");
				System.out.println("수정할 파일의 순서를 입력하세요: ");
				c.rename(dirObj);
				
				
			}else if(sel == 3) {
				System.out.println("삭제할 파일 번호를 입력하세요: ");
				c.delete(dirObj);
				
			}else if(sel == 4 ) {
				System.out.println("이동할 상위 폴더를 입력하세요 : ");
				c.up(dirObj);
			}	
			else if(sel == 5) {
				System.out.println("이동할 하위 폴더를 입력하세요: ");
  			    c.down(dirObj);			    
  			   
			}else if(sel == 0) {
				System.out.println("게시판 프로그램을 종료합니다.");
				break;
			}

		}
	}
}