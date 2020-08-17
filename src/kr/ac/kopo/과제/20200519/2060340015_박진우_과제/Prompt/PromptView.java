package kr.ac.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PromptView {

	private SimpleDateFormat sdf = null; 
	private Scanner sc = new Scanner(System.in);
	
	private File mainDir = null;
	private List<File> files = new ArrayList<>();
	
	private PromptFunc func = new PromptFunc();
	
	public PromptView() {
		
		mainDir = new File("D://ioHomework");
		
		if(!mainDir.exists()) {
			mainDir.mkdir();
		}
		
		updateFiles();
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	private void updateFiles() {
		
		if(!files.isEmpty())
			files.clear();
		
		File[] fArr = mainDir.listFiles();
		
		for(File f : fArr) {
			files.add(f);
		}
	}
		
	
	private void printList() {
		
		System.out.println("====================================================");
		System.out.println("          " + mainDir.getName());
		System.out.println("====================================================");
		System.out.println("이름\t\t종류\t\t크기\t\t마지막 수정 날짜");
		System.out.println("====================================================");
		
		for(File f : files) {
			
			if(f.isFile()) {
				System.out.println(f.getName() + "\t\t" + "FILE" + "\t\t" + f.length() + "\t\t" + sdf.format(new Date(f.lastModified())));
			}
			else
				System.out.println(f.getName() + "\t\t" + "DIR");
		}
		
		System.out.println("[C] 폴더 생성 [R] 이름 수정 [D] 삭제 [P] 상위폴더 이동"
				+ "[S] 하위폴더 이동 [Q] 종료");
		System.out.print("선택 : ");
		
	}
	
	private String inputCmd() {
		
		String cmd = null;
		while(cmd == null) {
			
			cmd = sc.nextLine();
			if(cmd.equals("C") || cmd.equals("c")) {}
			else if(cmd.equals("R") || cmd.equals("r")) {}
			else if(cmd.equals("D") || cmd.equals("d")) {}
			else if(cmd.equals("P") || cmd.equals("p")) {}
			else if(cmd.equals("S") || cmd.equals("s")) {}
			else if(cmd.equals("Q") || cmd.equals("q")) {}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				cmd = null;
			}
		}
		return cmd;
	}
	
	public void start() {
		
		String cmd;
		while(true) {
			printList();
			cmd = inputCmd();
			
			if(cmd.equals("C") || cmd.equals("c")) {
				
				boolean bool = func.createFolder(mainDir); 
				if(bool)
					updateFiles();
			}
			else if(cmd.equals("R") || cmd.equals("r")) {
			
				boolean bool = func.renameFile(mainDir);
				if(bool)
					updateFiles();
			}
			else if(cmd.equals("D") || cmd.equals("d")) {
				boolean bool = func.deleteFile(mainDir);
				if(bool)
					updateFiles();
			}
			else if(cmd.equals("P") || cmd.equals("p")) {
				File f = func.moveParentFolder(mainDir);
				if(f != null) {
					mainDir = f;
					updateFiles();
				}
			}
			else if(cmd.equals("S") || cmd.equals("s")) {
				File f = func.moveSubFolder(mainDir);
				if(f != null) {
					mainDir = f;
					updateFiles();
				}
			}
			else if(cmd.equals("Q") || cmd.equals("q")) {
				System.out.println("조심히 들어가세요.");
				System.exit(0);
			}
		}		
	}
}
