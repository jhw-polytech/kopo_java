package kr.ac.kopo.day14.homework;

import java.util.Scanner;

/*
	일단 여기에서 입력스트림 받아보자
*/
public class HWDosView {
	
	private HWDosUtil dosUtil;
	private String foldername;
	String current = "iotest"; // Main() 다음으로 오래가는 애기 때문에 여기다가 써줌 ㅋㄷㅋㄷ(지금 상황에서)
	
	public HWDosView() {
		dosUtil = new HWDosUtil();
	}
	
	// 콘솔에 폴더정보를 출력하는 메소드
	public void folderInfo() {
		File root = new File(current);

		System.out.println("---------------------------------------------------------------");
		System.out.println("\t\t" + getName() + "\t폴더정보");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t파일명\t종류\t크기\t마지막수정날짜");
		System.out.println("---------------------------------------------------------------");
		
		
		/*
		while(.hasnext()) {
			System.out.println("\t"+파일명+종류+크기+마지막 수정날짜);
		}
		*/
		
		System.out.println("---------------------------------------------------------------");
		utilMenu();
	}
		
	
	// 폴더정보를 확인 후 어떤 동작을 실행할지 고르는 메뉴 메소드
	public void utilMenu() {	
		
		
		System.out.println("[C]폴더생성 [R]이름수정 [D]삭제 [.]상위폴더이동 [m]하위폴더이동 [Q]종료");
				
		Scanner sc = new Scanner(System.in);
		
		
		String command = sc.nextLine();
		
		
		
		switch(command.charAt(0)) {
		
		case 'C' :
		case 'c' :
			dosUtil.createFolder(folderName);
			break;
		case 'R' :
		case 'r' :
			dosUtil.reName(folderName);
			break;			
		case 'D' :
		case 'd' :
			dosUtil.deleteFolder(folderName);
			break;
		case '.' :
			dosUtil.goToParentDirectory();
			break;
		case 'M' : 
		case 'm' :
			dosUtil.goDownDirectory();
			break;
		case 'Q' : 
		case 'q' :
			sc.close();
			dosUtil.exitSystem();
			break;
		}		
	}
	

}
