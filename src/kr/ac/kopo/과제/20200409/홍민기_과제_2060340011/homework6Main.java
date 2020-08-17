package kr.ac.kopo.day02.homework;

/*
 * 2060340011 홍민기
 * 
 * 6. 알파벳이 모두 몇 자 인지 화면에 출력하시오
 * 개수 ? 52
 * 
 */
public class homework6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		for(int i=0;i<Math.pow(2, 7);i++) { // 아스키코드 ( 0 ~ 127 ) 내에서 알파벳만 확인하는 반복문
			if(Character.isAlphabetic(i)) { // i가 65~90, 97~122일때만 count값 증가
				count++;
			}
		}
		System.out.println("알파벳의 개수 : " + count);
	}

}
