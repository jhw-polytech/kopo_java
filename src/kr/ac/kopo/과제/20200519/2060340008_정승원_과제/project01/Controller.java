package kr.ac.kopo.day14.lesson.project01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Controller {

	// 현재 Directory를 수정하면서 옮겨다니기
	public static File defaultDirectory;
	public static String currentDirectory;
	public static File[] list; 
	public Scanner sc;
	public int next;
	public String newDirectoryName;
	
	public Controller() {
		defaultDirectory = new File("iotest"); // 해당 경로 부터 시작
		currentDirectory = defaultDirectory.getAbsolutePath();
		sc = new Scanner(System.in);
	}
	
	public void excute() {
		
		while(true) {
			viewCurrentDirectory();

			print("\n*폴더*를 관리하는 명령어입니다.\r\n"
					+ "[C] 생성 [R] 이름수정 [D] 삭제 [.]상위폴더이동 [m]하위폴더이동 [Q]종료");
			print("\n현재 경로는 아래와 같습니다. \n" + currentDirectory);
			switch (getString()) {
			case "C":
			case "c":
				print("폴더를 생성합니다.");
				print("생성할 폴더 이름을 입력하세요.");
				String newDirectoryName = getString();
				File newDirObj = new File(currentDirectory+"\\"+newDirectoryName);
				boolean bool = newDirObj.mkdir();
				System.out.println(bool ? "성공" : "실패");
				break;
			case "R":
			case "r":
				print("폴더 이름을 수정합니다.");
				print("원하시는 폴더의 번호를 입력해주세요.");
				next = getNumber();
				list = defaultDirectory.listFiles();
				print("원하시는 폴더 이름을 입력하세요.");
				newDirectoryName = getString();
				File updateFileName = new File(currentDirectory+"\\"+list[next-1].getName());
				updateFileName.renameTo(new File(currentDirectory+"\\"+newDirectoryName));
				updateFileName.setLastModified(System.currentTimeMillis());
				break;
			case "D":
			case "d":
				print("폴더를 삭제합니다.");
				print("원하시는 폴더의 번호를 입력해주세요.");
				next = getNumber();
				list = defaultDirectory.listFiles();
				currentDirectory = list[next-1].getAbsolutePath();
				defaultDirectory = new File(currentDirectory);
				print(defaultDirectory.getName()+"을 삭제합니다.");
				defaultDirectory.delete();
				print("삭제 후 상위 폴더로 되돌아 갑니다.");
				defaultDirectory = defaultDirectory.getParentFile();
				currentDirectory = defaultDirectory.getAbsolutePath();
				break;
			case ".":
				print("상위폴더로 이동합니다.");
				currentDirectory = defaultDirectory.getParent();
				print("움직인 상위폴더입니다. \n"+ currentDirectory);
				break;
			case "M":
			case "m":
				print("하위폴더로 이동합니다.");
				print("원하시는 폴더의 번호를 입력해주세요.");
				next = getNumber();
				list = defaultDirectory.listFiles();
				currentDirectory = list[next-1].getAbsolutePath();
				print("움직인 하위폴더입니다. \n"+currentDirectory);
				break;
			case "Q":
			case "q":
				print("프로그램을 종료합니다.");
				System.exit(0);
			default:
				print("다시 입력해주세요.");
			}
		}
		
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void print(int msg) {
		System.out.println(msg);
	}
	
	public String getString() {
		print("\n*********입력시작*********");
		return sc.nextLine();
	}
	
	public int getNumber() {
		print("\n*********입력시작*********");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void viewCurrentDirectory() {
		defaultDirectory = new File(currentDirectory);

		File[] list = defaultDirectory.listFiles();
		
		print("----------------------------------------------------------------\r\n" + 
				"\t\t\t"+ defaultDirectory.getName() + " 폴더 정보\r\n" + 
				"----------------------------------------------------------------");
		print("번호\t이름\t\t종류\t\t크기\t\t마지막 수정날자");
		int num = 1;
		for ( File element : list ) {
			print("["+ num+"]\t" + element.getName() +"\t"+ getChildType(element)+ "\t"+getChildSize(element) +" byte(s) \t"+getChildUpdatedDate(element));
			num++;
		}
	
	}

	private String getChildType(File element) {
		return element.isDirectory() ? "DIR" : "FILE";
	}

	private String getChildUpdatedDate(File element) {
		long lastTime = element.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(new Date(lastTime));
	}

	private long getChildSize(File element) {
		return element.length();
	}
	
	
}
