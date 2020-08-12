package kr.ac.kopo.jdbc;






import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class PrnEmpSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 접속 --> 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 3. 쿼리문 작성

			System.out.println("급여를 선택하세요.");
			int sal = sc.nextInt();
			sc.nextLine();

			StringBuffer sb = new StringBuffer(); // StringBuilder로 써도 똑같음(지금 single로 돌리기 때문)

			sb.append("select job_title, avg(salary) ");
			sb.append("from( ");
			sb.append("    select job_title, salary ");
			sb.append("    from EMPLOYEES e, jobs j ");
			sb.append("    where e.job_id = j.job_id and salary >= ?) ");
			sb.append("group by job_title ");
			sb.append("order by 2 desc ");

			// String sql = sb.toString();

			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, sal);

			// 4. 쿼리문 실행 & 결과 얻어오기

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String jobTitle = rs.getString(1);
				int avgSalary = rs.getInt(2);

				System.out.printf("[%s] %d\n", jobTitle, avgSalary);
			}


			String jobTitle = rs.getString(1);
			int avgSal = rs.getInt(2);

			System.out.println("jobTitle : " + jobTitle + "\t\t avgSal : " + avgSal);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			sc.close();

			// 5. 접속 해제!! >> JDBCClose 클래스를 따로 만들어 사용해보자!
			JDBCClose.close(conn, pstmt);
			// 나중에 kr.ac.kopo.util에 있는 애들만 jar로 묶어서 프로젝트 할 때마다 Build Path에 추가하면 됨

		}

	}

}
