package kr.ac.kopo.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertMain {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {

			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1단계 드라이버 로딩...");

			// 2단계 : DriverManager를 이용한 DB 접속 후 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink:1521/dink";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.88.120:1521:dink", "DA07", "5555"); // checked exception!
			System.out.println("2단계 conn : " + conn);

			/*
			   new 연산자로 객체를 생성하지 않는다!
			   Driver 객체에서 Connection 객체를 얻어오고, C 객체가 Statement객체를 가져옴
			 */

			// 3단계 : Query 실행 (Statement 객체 얻어오기)
			stmt = conn.createStatement(); // stmt는 쿼리문을 실행하는 객체가 된닷

			String sql = "insert into t_test(id, name) values('wanee','와니')";

			// 4단계 : SQL문 실행 및 결과 도출(select 제외하고 insert, delete, update는 실행한 행 갯수 반환)
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총" + cnt + "개 삽입");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 : 접속 종료
			if (stmt != null) {

				try {
					stmt.close(); // 만약 Connection, Statement 변수 선언을 try문 밖에 하지 않았으면 여기서 오류가 뜸
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
