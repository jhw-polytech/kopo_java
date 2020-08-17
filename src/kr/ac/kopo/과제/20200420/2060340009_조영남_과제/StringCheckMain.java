package kr.ac.yeongnam.day07.homework;

public class StringCheckMain {

	public static void main(String[] args) {
		
		StringCheck sc = new StringCheck(); // StringCheck 객체 생성
		
		String strData = sc.getStr(); // 문자열을 입력받기 위한 메소드
		
		int checkNumCnt = StringCheck.checkChar(strData, 'o');
		sc.print('o', checkNumCnt);
		
		checkNumCnt = StringCheck.checkChar(strData, 'W');
		sc.print('W', checkNumCnt);

	}

}
