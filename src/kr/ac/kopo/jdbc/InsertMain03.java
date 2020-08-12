package kr.ac.kopo.jdbc;

/*
	PreparedStatement 객체를 사용해보는 클래스
	
	- PreparedStatement 객체는 Statement 객체를 상속받았다.
	S는 conn.createStatement() 를 사용했다면,
	P는 conn.prepareStatement(String sql) 메소드로 sql문을 바로 넘겨준다.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. 드라이버 로딩~
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 커넥션~~~
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA07";
			String password = "5555";

			conn = DriverManager.getConnection(url, user, password);

			// 3. 쿼리 : SQL 작성(PreparedStatement)
			String sql = "insert into t_test(id, name)";
			sql += " values(?, ?)";

			System.out.println("등록할 아이디를 입력하세요: ");
			String id = sc.nextLine();

			System.out.println("등록할 이름을 입력하세요: ");
			String name = sc.nextLine();

			pstmt = conn.prepareStatement(sql); // 객체를 맹근 후에
			pstmt.setString(1, id); // 물음표를 메꾼다.
			pstmt.setString(2, name); // single quotation은 자동으로 들어감!
			// SQL은 0번 idx가 없으므로 1부터 시작~
			// 자바는 배열이 자신으 ㅣ주소로부터 얼마나 떨어져 있는지 나타내는 상대주소여서 0부터였음

			// 4. 결과 : sql문 실행 및 결과
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 삽입");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 5. 종료~~~
			if (pstmt != null) {

				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}

}
