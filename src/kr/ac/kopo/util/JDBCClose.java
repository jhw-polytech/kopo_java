package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCClose {

	
	public static void close(Connection conn, Statement stmt) { // PreparedStatement를 주로 쓰지만, Statement로 받아오면 묵시적 형변환>모든 Statement형을 받아올 수 있음
		
		
		if(stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(conn!=null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
		
		
		
	}

}
