package Homework0519;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CmdInfo {

	private String fname;
	private long size;
	private String type;
	private long date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	private CmdCreate cmdC = new CmdCreate();
	
	Scanner sc=new Scanner(System.in);
	
	
	
	CmdInfo(){
	
	
		
	}
	
	public void excute(){
			File dirObj = new File("iotest");
		
		ArrayList<File> list = new ArrayList<>(); // File 형의 리스트 깡통 만들기
		
		String [] name= dirObj.list();
		
		String [] name2=new String[name.length];
		
		for( int i=0 ; i<name.length; i++) {
			
			name2[i]= dirObj+"\\" +name[i];
			list.add(new File(name2[i]));
		}
		System.out.println("\t" + dirObj.getName() + "디렉토리 정보");
		System.out.println("--------------------------------------------" );
		System.out.println("이름 \t 크기 \t 종류 \t 마지막 수정날짜" );
		for(int i=0; i<name.length; i++) {
			if(list.get(i).isFile()==true) {
				type="File";
			}
			else {
				type="Dir";
			}
			date=list.get(i).lastModified();
			
			System.out.println(list.get(i).getName()+"\t"+ list.get(i).length() + "\t"+ type+ "\t"+     sdf.format(date));
		}
		

		while(true) {
			System.out.println("선택하세요 빨리요");
			System.out.println("[C] 폴더생성 [R]이름수정 [D]삭제  [Q]종료");
			String move=sc.nextLine();
		
			switch(move) {
				
			case "C":
				
				CmdCreate create = new CmdCreate();
				create.createFolder(dirObj);
				break;
			case "R":
				CmdRename rename = new CmdRename();
				rename.re(dirObj);
				break;
			case "D":
				CmdDelete delete =new CmdDelete();
				delete.delete(dirObj);				
				break;
			case "Q":
				System.out.println("시스템 종료합니다.");
				System.exit(0);
					
				
				
			}
			
		}
	}

	
	
	
}
