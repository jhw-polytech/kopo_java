package jaeheehomework;

public class LottoNumberException extends Exception{ //사용자 정의 예외 클래스
	
	//기본 생성자
	LottoNumberException(){
		
	}
	
	//메세지 전달하는 생성자
	LottoNumberException(String msg){
		super(msg);
	}
}
