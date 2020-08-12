package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

/*
	t_test에서 오름차순 기준 첫 번째 id의 사용자 조회
*/

public class SelectMain02 {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn =  new ConnectionFactory().getConnection();
			

//		**	String은 불변길이이기 때문에, 내용을 추가하려면 기존 값과의 연결을 끊고 새로운 값이 든 주소지를 참조,---> 반복
//			==> 이 방법은 리소스를 많이 잡아먹으므로, StringBuffer를 써주도록 한다.
			
//			String sql = "select id, name ";
//					sql +=	" from ( ";
//					sql +=	" 		select * ";
//					sql +=	"		from t_test ";
//					sql +=	"		order by id asc ";
//					sql +=	"		)";
//					sql +=	" where rownum = 1";
			
			StringBuffer sb = new StringBuffer();
			sb.append("select id, name ");
			sb.append(" from ( ");
			sb.append(" 		select * ");
			sb.append("		from t_test ");
			sb.append("		order by id asc ");
			sb.append("		)");
			sb.append(" where rownum = 1");

			
			String sql = sb.toString();					
								
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();		
			
			if(rs.next()) { // rs.next()가 boolean을 반환하는 것을 이용
				 String id = rs.getString("id");
				 String name = rs.getString("name");
				 
				 System.out.println("id: "+ id + ", name : "+name);
				
			} else {
				System.out.println("등록된 id가 없습니다.");
			}
					
			/*
				select *
				from (select *
				from t_test
				order by id asc)
				where rownum=1;
				
				===> from절 다음에 where절이 실행되므로,
					from 안에 서브쿼리로 (오름차순 정렬된 테이블)을 먼저 넣어줌				
			*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

}
