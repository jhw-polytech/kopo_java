package kr.ac.yeongnam.day14.homework;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cmd {
	
	private String nowDir = "iotest";
	private Scanner sc;
	private String option;
	
	public void execute() {
		showUpper();
		showList();
	
		while(true) {			
			option = showOption();
			
			if(option.equals("c") || option.equals("C")) {			
				createDir();
				
			} else if(option.equals("r") || option.equals("R")){
				rename();
				
			} else if(option.equals("d") || option.equals("D")){
				delete();
				
			} else if(option.equals(".")) {
				moveUp();
				
			} else if(option.equals("m") || option.equals("M")) {
				moveDown();
				
			} else if(option.equals("q") || option.equals("Q")){
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");			
			}
		}
		
		
	}
	
	
	public void showUpper() {
		
		File dirObj = new File(getNowDir());

		System.out.println("=======================================");
		System.out.println("\t\t" + dirObj.getPath() +"\t");
		System.out.println("=======================================");
		System.out.println("이름\t종류\t크기\t마지막수정날짜");
		System.out.println("=======================================");		

	}
	
	public void showList() {
		
		File dirObj = new File(getNowDir()); 	
		String[] list = dirObj.list(); 
	
		List<Files> fileList = new ArrayList<>();
		
		
		for(String element : list) { 
			
			File fileObj = new File(getNowDir() + "/" + element);					
			boolean file = fileObj.isFile();
			String type = (file ? "파일" : "DIR");
			
			long length = fileObj.length();			
			long modifiedInfo = fileObj.lastModified();				
			fileList.add(new Files(element, type, length, modifiedInfo));						
		}
				
		Iterator<Files> ite = fileList.iterator();
		while(ite.hasNext()) {
			Files tmp = ite.next();
			String nameTmp = tmp.getName();
			String typeTmp = tmp.getType();
			long sizeTmp = tmp.getSize();
			String modifiedInfoTmp = tmp.getModifiedInfo();				
			System.out.printf("%s\t%s\t%d byte(s)\t%s\t\n", nameTmp, typeTmp, sizeTmp, modifiedInfoTmp);
		}					
		
	}
	
	public String showOption() {
		sc = new Scanner(System.in);
		System.out.println();
		System.out.println("[C]폴더 생성  [R]이름수정  [D]삭제  [.]상위폴더이동  [m]하위폴더 이동  [Q]종료");
		System.out.print("선택 : ");
		String option = sc.nextLine();
		
		return option;
	}
	
	
	public void createDir() {
		System.out.print("생성할 폴더의 이름을 정해주세요 : ");
		String newDir = sc.nextLine();
		
		File newDirObj = new File(getNowDir() + "/" + newDir);
		System.out.println(newDirObj.mkdir() ? newDir + " 생성 성공" : newDir + " 생성 실패");
		
		showUpper();
		showList();
	}
	
	public void rename() {
		System.out.print("변경 대상 파일명을 입력하세요 : ");
		String nowName = sc.nextLine();
		
		System.out.print("변경할 이름을 입력하세요 : ");
		String newName = sc.nextLine();
				
		File nowDirObj = new File(getNowDir()+ "/" + nowName);
		
		if(nowDirObj.exists()) {
			File newDirObj = new File(getNowDir()+ "/" + newName);
			nowDirObj.renameTo(newDirObj);
			
		} else {
			System.out.println("해당하는 파일이 없습니다.");
		}
		
		showUpper();
		showList();			
	}
	
	public void delete() {
		System.out.print("삭제할 파일명을 입력하세요 : ");
		String deleteName = sc.nextLine();
		
		File deleteObj = new File(getNowDir()+ "/" + deleteName);
		if(deleteObj.delete()) {
			System.out.println(deleteName + "을(를) 삭제했습니다.");
		} else {			
			System.out.println(deleteName + "을(를) 삭제하는데 실패했습니다.");
		}
		
		showUpper();
		showList();			
	}
	
	public void moveUp() {
		File file = new File(getNowDir());
		if(file.getParent() == null) {
			System.out.println("최상위 폴더입니다.");
		} else {			
			setDirUp(file.getParent());
			showUpper();
			showList();	
		}

	}
	
	public void moveDown() {
		System.out.print("이동할 폴더명을 입력하세요 : ");
		String subDir = sc.nextLine();
		
		setDir(subDir);
		
		showUpper();
		showList();					
	}
	
	
	public void setDir(String newDir) {
		this.nowDir = this.nowDir + "/" + newDir;
	
	}	
	
	public void setDirUp(String newDir) {
		this.nowDir = newDir;
	}
	
	
	public String getNowDir() {
		return nowDir;
	}

	
}
