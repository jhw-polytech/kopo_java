package kr.ac.yeongnam.day07.homework;

public class StringRemoveMain {

	public static void main(String[] args) {

		StringRemove sr = new StringRemove(); // StringRemove 객체 생성		
		
		String strData = sr.getStr(); // String 입력받기 위한 메소드		
		sr.removeChar(strData, 'l'); // 해당 character 삭제 후 결과를 리턴하는 메소드
		sr.removeChar(strData, 'o'); // 해당 character 삭제 후 결과를 리턴하는 메소드

	}

}
