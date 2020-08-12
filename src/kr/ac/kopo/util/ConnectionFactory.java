package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
pstmt = conn.prepareStatement(sql);
요기서 커넥션 객체만 갖고 와서 쓸 수 있게 해주는 커넥션 공장 ㅋㄷㅋㄷ
*/

public class ConnectionFactory {

	
	/*
	static 이 아니므로 new ConnectionFactory()로 움직여야 한다.??
	
	>> main 메소드는 static이 붙어있는데
	static은 non-static에 접근할 수 없으므로!
	
	*/

	/*
	public Connection getConnection() { // 인자로 url, user, password 받아올 수도 있다.

		Connection conn = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url		= "jdbc:oracle:thin:@172.16.88.120:1521/dink";
			String user		= "DA07";
			String password = "5555";
			
			conn = getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
	*/
	public Connection getConnection() { // 인자로 url, user, password 받아올 수도 있다.

			String url		= "jdbc:oracle:thin:@172.16.88.120:1521/dink";
			String user		= "DA07";
			String password = "5555";

		return getConnection(url, user, password);
	}
	
	
	/*
	 	 여러개의 DB를 쓰는 상황에서, 메소드 내에 url, user, pw가 셋팅되어 있으면
	 	 곤란하기 때문에 이 방식이 낫다!
	 */ 
	 	public Connection getConnection(String url, String user, String password) {
		Connection conn = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
//	 */
	

}
