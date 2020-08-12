package kr.ac.kopo.jdbc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;		
		

		try {
			/*
			 *
			   ConnectionFactory factory = new ConnectionFactory();
			   conn = factory.getConnection();
			   >>> 얘는 연결 객체를 담을 변수가 있으므로, 계속 쓸 수 있다.
			 */			

			conn = new ConnectionFactory().getConnection();
			// conn이 끝나는 순간 garbage collector가 수거해 간다.
			// 따라서 만약 활용해야 하는 멤버변수가 있는 상황이라면 이 방식을 쓰면 안됨
			
			String sql = "select * from t_test";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); 
			
			
			while(rs.next()) { // 다음 행이 없으면 false 반환
				String id = rs.getString("id");
				String name = rs.getString(2);
				
				System.out.println("id: " + id + ",\tname : "+name);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	
//	InputStream is = System.in;
//	InputStreamReader isr = new InputStreamReader(is);
//	BufferedReader br = new BufferedReader(isr);
// >>>> 위 세줄을 축약해서	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	처럼 나타낼 수도 있다.
// 그런데 이 경우에는 

}
