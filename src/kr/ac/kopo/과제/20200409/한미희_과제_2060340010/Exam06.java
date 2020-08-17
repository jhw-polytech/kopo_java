package kr.ac.kopo.day2.assignment;

public class Exam06 {
	
	public static void main(String[] args) {
		// 6. 알파벳이 모두 몇 자인지 출력
		
		//순서상 알파벳 처음(A)과 마지막(Z)를 각각 아스키코드값으로 변환
		int firstAlphabet = (int)'A'; 
		int lastAlphabet = (int)'Z';
		
		//구한 아스키값을 이용하여 대문자/소문자 알파벳이 모두 몇개인지 출력(대문자 알파벳의 총 개수*2)
		System.out.println("개수 : " + (lastAlphabet-firstAlphabet+1)*2);
		
	}

}
