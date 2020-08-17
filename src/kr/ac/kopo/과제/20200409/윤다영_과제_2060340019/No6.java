package kr.ac.kopo.assignment.first;

public class No6 {
	/* 
	 알파벳이 모두 몇 자인지 화면에 출력하시오
	 */
	
	public static void main(String[] args) {
		
		//ASCII 코드로 개수 구하기
		int cnt = ((int)'Z' - (int)'A' + 1) * 2;
		System.out.println("알파벳의 총 개수는?" + cnt);
		
	}

}
