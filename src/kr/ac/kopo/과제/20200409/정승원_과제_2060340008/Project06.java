package kr.ac.kopo.day02.project;

/**
 * 
 * @author tess
 * 알파벳이 모두 몇 자인지 화면에 출력하는 클래스 
 */

public class Project06 {
	
	public static void main(String[] args) {
		int acount = 'z' - 'a' +1; // 소문자는 60~90, 자기자신을 포함 +1 
		int Acount = 'Z' - 'A' +1; // 대문자는 97~122, 자기자신을 포함 +1 
		
		System.out.printf("개수 : %d",acount+Acount); // 소문자의 전체 개수 26 + 대문자의 전체 개수 26 = 52 
		
	}

}
