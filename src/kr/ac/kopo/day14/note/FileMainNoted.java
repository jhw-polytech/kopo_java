package kr.ac.kopo.day14.note;

// 하드디스크에 있는 어떤 경로의 객체에 접근하기 위해 쓰는 클래스

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMainNoted {

	public static void main(String[] args) {

		// 경로를 설정할 때 만일 절대경로를 설정하지 않고 "aaa.txt"처럼 입력하면
		// 클래스가 속한 최상위 프로젝트 내에 있는 파일을 말함
		File fileObj = new File("iotest\\aaa.txt"); // 예외문자 때문에 역슬래시 2개 써야함

		// File fileObj = new File("D:\\workspace\\kopoLecture\\iotest\\aaa.txt"); 라고 써도
		// 같은 결과

		System.out.println("name : " + fileObj.getName()); // 출력결과 >> name : aaa.txt
		System.out.println("parent : " + fileObj.getParent()); // 출력결과 >> parent : iotest
		System.out.println("path : " + fileObj.getPath()); // 출력결과 >> iotest\aaa.txt
		System.out.println("Ab Path : " + fileObj.getAbsolutePath()); // 출력결과 >> D:\workspace\kopoLecture\iotest\aaa.txt
																		// (절대경로)

		// ????에는 파일 or 디렉토리만 존재 ---> ????
		// 위의 aaa.txt가 파일인지 디렉토리인지 확인해보도록 하겠다.
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "파일입니다" : "디렉토리입니다."); // 출력결과 >> 디렉토리입니다.		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리입니다" : "파일입니다."); // 출력결과 >> 파일입니다.
		// ---------------- 이렇게 나오는 이유: 현재 파일이 존재하지 않아서.
		
		// 그래서 사실 존재 여부를 먼저 물어보는 것이 맞다.
		bool = fileObj.exists();
		System.out.println(bool ? " : 존재합니다." : " : 존재하지 않습니다.");
		
		
		// 프로젝트 클릭 
		
		long length = fileObj.length();
		System.out.println("파일 크기: "+ length + "byte(s)");
		
		long lastTime = fileObj.lastModified(); // 밀리세컨드까지 나오기 때문에 long형 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정시간: " + sdf.format(new Date(lastTime))); // 뭔가 ___형이랑 long형이 있다...? 잘 못들음		

		
		
		// File 클래스에 들어있는 메소드들은 무척 다양하다. 시간날때 살펴보셈
		// 파일에 읽기전용 or 숨김 설정이 되어있을 때 can~ 시리즈는 boolean 값을 반환한다.
		bool = fileObj.canWrite(); //return 타입이 boolean
		System.out.println(bool ? "쓰기 가능" : "쓰기 불가능"); // 파일 속성이 '읽기 전용'으로 되어있으면 false 반환
		
		
		
		
		
	}

}
