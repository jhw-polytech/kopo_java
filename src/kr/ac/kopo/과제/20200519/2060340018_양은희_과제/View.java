package dirFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class View {
	
	public void print(String path) {
		File f = new File(path);
		String[] List = f.list();
		int fileInfo;
		SimpleDateFormat sdf = new SimpleDateFormat("");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t\t\t iotest 폴더 정보");
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t 이름 \t\t 종류 \t\t 크기 \t\t 마지막 수정 날짜");
		System.out.println("-------------------------------------------------------------");
		for(int i =0; i<f.length(); i++) {
			System.out.println(f.listFiles()[i].getName());
			System.out.println(f.listFiles()[i].isDirectory() ? "dir" : "file");
			System.out.println(f.listFiles()[i].length()+"byte(s)");
			System.out.println(sdf.format(f.listFiles()[i].lastModified()));
		}
		System.out.println("[C]폴더 생성\t[R]이름 수정\t[D]삭제\t[.]상위로 이동\t[M] 하위폴더 이동\t[Q] 종료");
		System.out.println("선택 : ");
		String choice = sc.nextLine();
		
		switch(choice) {
		
		case "C" : 
			NewFolder nf = new NewFolder();
			nf.newFolder(f);
		break;
		
		case "R" : 
			System.out.println("이름을 수정할 폴더");
			fileInfo = Integer.parseInt(sc.nextLine()) -1;
			ReName.reName(f.listFiles()[fileInfo]);
			break;
			
		case "D" : 
			System.out.println("무엇을 삭제하시겠습니까? : ");
			fileInfo = Integer.parseInt(sc.nextLine()) -1;
			Delete.delete(f.listFiles()[fileInfo]);
			break;
			
		case "." :
			System.out.println("상위로 이동");
			GoUp.goup(f);
			break;
			
		case "M" :
			System.out.println("하위로 이동");
			fileInfo = Integer.parseInt(sc.nextLine()) -1;
			GoDown.godown(f.listFiles()[fileInfo]);
			break;
			
		case "Q" :
			System.out.println("종료");
			System.exit(0);
		}
		
	}
	
	
}
