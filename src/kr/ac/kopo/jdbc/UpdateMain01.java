package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * UPDATE문을 이용한 DB 변경
 * 
 * 
	ID를 입력하세요 : lee
	변경할 이름을 입력하세요 : 이길동
	1개의 형이 변경되었습니다
*/
public class UpdateMain01 {

	
	public static void main(String[] args) {
	
		Connection conn=null;
		PreparedStatement pstmt = null;
		
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			

			// 2. DB 접속 --> 연결객체 얻어오기
			String rul 		= "jdbc:oracle:thin:@172.16.88.120:1521/dink";
			String user 	= "DA07";
			String password = "DA07";		
		
			conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.88.120:1521/dink", "DA07", "5555"); // 연결객체
		

			// * 3. 쿼리문 작성
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ID를 입력하세요: ");
			String id = sc.nextLine();
			
			System.out.println("변경할 이름을 입력하세요: ");
			String name = sc.nextLine();
			
			String sql = "UPDATE T_TEST ";
					sql += " SET NAME = ? ";
					sql += " WHERE ID = ?";					
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name); // name은 VARCHAR2형이므로 setString() 사용
			pstmt.setString(2, id);
		
			
			// * 4. 쿼리문 실행 & 결과 받아오기
			int cnt = pstmt.executeUpdate(); //executeUpdate : 실행하고 실제 DB를 수정하는 게 목적이므로!
			System.out.println("총 " + cnt + "개 행이 수정되었습니다.");
			
			sc.close();			
		} catch (Exception e) {
			e.printStackTrace();
		
				
			// 5. 접속 해제
		} finally {			
			if( pstmt !=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}
		
		
	}
	
	
}
