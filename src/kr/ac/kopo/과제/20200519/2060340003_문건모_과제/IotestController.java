package kopo.ac.kr.day02;

import java.util.Scanner;

public class IotestController {
	
	private FolderCreate fc;
	private Delete dl;
	private UpFile uf;
	
	public IotestController() {
		
	}
	
	public void start() {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			IotestList il = new IotestList();
			System.out.println("============================");
			System.out.println("\tiotest");
			System.out.println("============================");
			System.out.println("이름\t종류\t크기\t마지막수정날짜");
			System.out.println("============================");
			il.getList();
			
			System.out.println("[C] 폴더 생성 [R] 이름수정 [D] 삭제 [.] 상위폴더이동 [m] 하위폴더 이동 [Q] 종료");
			String choice = sc.nextLine();
			
			switch(choice) {
			
			case "C" :
				fc = new FolderCreate();
				fc.create();
				break;
			case "R" :
				break;
			case "D" :
				dl.delete();
				break;
			case "." :
				break;
			case "m" :
				uf.up();
				break;
			case "Q" :
				System.out.println("시스템을 종료합니다");
				System.exit(0);
			}
			
			
		}
		
	}

}
