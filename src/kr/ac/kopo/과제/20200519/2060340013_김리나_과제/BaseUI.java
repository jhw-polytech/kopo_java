package kr.ac.kopo.day14.homework2;
// 저번에 했던 과제는 move 클래스가 돌아가질 않았고, 제가 IO API를 제대로 이해하지 못한 것 같아 다시하였습니다. 
import java.util.Scanner;

import java.io.File;
public abstract class BaseUI implements IFileUI {

		private Scanner sc;
		protected String firstPath = "iotest/";// 초기 디렉토리 
		protected static String currentPath = "iotest";// 폴더 이동시 현재 위치한 디렉토리를 static 변수로 각 클래스에서 공유한다. 
		
		public BaseUI() {
			sc = new Scanner(System.in);
			
		}
		
		public static void mainUI() {
			File file = new File(currentPath);// 모든 클래스에서 현재 위치를 알려주기때문에 현재 디렉토리로 파일객체를 생성 
			System.out.println("==========================================================================");
			System.out.println("\t\t\t " + currentPath + "폴더 정보 ");// 위치가 변할때마다 보여주는 값도 바뀐다.
			System.out.println("==========================================================================");
			System.out.println("\t 이름 \t 종류 \t 크기 \t 마지막수정날짜 ");
			System.out.println("==========================================================================");
			File fileList[] = file.listFiles();
			for(File file2 : fileList) {
				String type = (file2.isDirectory() ? "디렉토리" : "파일");// 디렉토리일경우 종류에 디렉토리, 디렉토리가 아닐경우 종류에 파일을 출력 
				System.out.println("\t" + file2.getName() + "\t" + type + "\t" + file2.length() + "\t" + file2.lastModified());				
			}
		}
		// 자식클래스들이 쉽게 입력값을 받을 수 있게한다. 
		protected int scanInt(String msg) {
			System.out.println(msg);
			return Integer.parseInt(sc.nextLine());
		}
		
		protected String scanStr(String msg) {
			System.out.println(msg);
			return sc.nextLine();
		}
	
}
