package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);

		try {
			// 1. 드라이버 로딩~
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA07";
			String password = "5555";

			conn = DriverManager.getConnection(url, user, password);

			// 3.
			stmt = conn.createStatement();
			// ????를 stmt객체는 conn의 createStatement() 메소드를 이용해서 얻어올 것이다.

			System.out.println("등록할 아이디를 입력하세요: ");
			String id = sc.nextLine();

			System.out.println("등록할 이름을 입력하세요: ");
			String name = sc.nextLine();

			String sql = "INSERT INTO T_TEST(id, name)";
			// sql += "values('paul', '김태영')"; // 이렇게 넘겨주는 쿼리문 뒤에는 세미콜론이 붙지 않는다.
			// 운이 좋게도 이 문장은 반영되었지만, 원래는 띄 어 쓰 기 가 되어있지 않으면 오류날 가능성이 매우높음!!!!
			// 습관적으로 sql문 뒤에 띄어쓰기 한 번 넣어주는 습관을 갖자!!!
			// sql += " values(" + id + ", "+ name + ")"; //문자형에 ' 를 붙이지 않아 오류 --> 정수를 입력 시
			// 오류가 나지 않음
			sql += " values(\'" + id + "\', \'" + name + "\')"; // 역슬래시는 필수는 아님을 참고

			// 4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총" + cnt + "개 행이 삽입...");

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
