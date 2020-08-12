package kr.ac.kopo.day14.note;

public class CheckIDPWExceiptionNoted extends Exception {
	
	// 에러코드를 만든것임
	// static을 넣은 이유? 생성시점을 위해서... 순서 때문에! CheckIDPWException() 메소드에 
	//컴퓨터 입장에서는 모두 완료된 상태에서 접근할 수 있다고 보는데, static 키워드가 붙지 않으면 
	// 배열 안의 값을 보려면 
	// 이 객체를 만든 생성자 시점에선 그게 아님.. ---> ???
	public static final int errorCode = 1; 

	// 생성자 안에 있지 않기 때문에 아직 만들어 하나만 있으면 되니까  ---> ???
	private String [] errMsg = {"", "아이디가 올바르지 않습니다", "패스워드가 잘못되었습니다"};
	
	// 기본생성자
	public CheckIDPWExceiptionNoted() {
		super(); // 이 클래스의 부모클래스인 Exception 클래스에서, 오류메시지를 출력해주는 기능이 있음 <---= 이것도 사실은 Throwable를 상속받아 stackTrace 어쩌구() 를 이용한 것임!
		
		/*
		 * public Throwable(Throwable cause) { fillInStackTrace(); detailMessage =
		 * (cause==null ? null : cause.toString()); this.cause = cause; }
		 */
		
	}

	
	// 문자열을 넘겨받는 생성자(에러메시지 직접 받아올 수 있음)
	public CheckIDPWExceiptionNoted(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	// 에러 발생시 에러코드 입력받음
	public CheckIDPWExceiptionNoted(int errorCode) {
		// this(errMsg[errCode]); ---> 아직 errorCode 변수가 생성되지 않은 시점이다...?? ?__?
	}
	
	

}
