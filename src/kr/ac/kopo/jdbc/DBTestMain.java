package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {


		try {
			// 1단계 : JDBC 드라이버 로딩 --- Class.forName() 드라이버 로딩하는 문법임
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 얘도 checked exception
			System.out.println("드라이버 로딩 성공...");

			//ojdbc.jar 파일 라이브러리에 꼭 추가해야 함!!!
			//external 말고 그냥 add해야 상대주소로 인식돼서 다른 곳에서 파일 봐도 적용됨
			
			

			// 2단계 : SQL데이터베이스와 연결
			Connection conn = DriverManager.getConnection( // 리턴타입 커넥션! 얘도 예외처리 필수
//					"jdbc:oracle:thin:@localhost:", "hr", "hr"); // 자신이 사용중인 컴퓨터에 오라클 설치된 경우
					"jdbc:oracle:thin:@172.16.88.120:1521:dink", "DA07","5555");
			
			// oracle.jdbc.drier > OracleDriver.class 를 읽어와야 함.
			// 소문자 대문자 바뀌면 안됨!!!!!!

			
			
			System.out.println("db 접속 성공 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}


		// 일반적으로 C드라이브에 [oraclexe]라는 폴더가 있음

		//

	}

}
