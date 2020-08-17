package board;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class BoardMenu {
	void setMenu() {
		Scanner scan = new Scanner(System.in);
		List<Content> boardList = new ArrayList<>();		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.전체 게시물 조회");
			System.out.println("2.글번호 조회");
			System.out.println("3.글등록");
			System.out.println("4.글수정");
			System.out.println("5.글삭제");
			System.out.println("0.종료");
			System.out.println("---------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			int sel =scan.nextInt();
			if(sel == 1) {
				System.out.println("<전체 게시글 조회>");
				System.out.println("번호\t제목\t글쓴이\t등록일");
				for(int i = 0; i < boardList.size(); i++) {				
					Content content = boardList.get(i);
					content.print();
				}
			}else if(sel ==2) {
				System.out.println("조회할 번호를 입력하세요 : ");
				int num = scan.nextInt();
				if(boardList.size() > 0 && num >= 1 && num <= boardList.size()) {
					Content content = boardList.get(num - 1);
					content.print();
				}	
				
			}else if(sel == 3) {
				int num = Content.lastNum;
				Content.lastNum += 1;
				System.out.println("제목을 입력하세요 : ");
				String subject = scan.next();
				System.out.println("글쓴이를 입력허세요 : ");
				String writer = scan.next();
			
				 Calendar cal = Calendar.getInstance();
			       
			     int year = cal.get(Calendar.YEAR);
			     int mon = cal.get(Calendar.MONTH)+1;
			     int day = cal.get(Calendar.DAY_OF_MONTH);
			    
		
				String date = "";
				date += year + "-";			
				date += mon + "-";
				date += day;
				Content content = new Content(num , subject , writer , date);
				boardList.add(content);				
				
			}else if(sel == 4) {
				System.out.println("수정할 번호를 입력하세요 : ");
				int num = scan.nextInt();				
				System.out.println("수정할 제목을 입력하세요 : ");
				String subject = scan.next();
				System.out.println("수정할 글쓴이를 입력하세요 : ");
				String writer = scan.next();
				Calendar cal = Calendar.getInstance();
				
			     int year = cal.get(Calendar.YEAR);
			     int mon = cal.get(Calendar.MONTH)+1;
			     int day = cal.get(Calendar.DAY_OF_MONTH);
			    
			     
		
				String date = "";
				date += year + "-";			
				date += mon + "-";
				date += day;
				Content content = boardList.get(num - 1);
				content.setData(num-1, subject, writer, date);		
			}
			else if(sel == 5) {
				System.out.println("삭제할 번호를 입력하세요 : ");
				int num = scan.nextInt();
				boardList.remove(num - 1);
			}else if(sel == 6) {
				System.out.println("게시판 프로그램을 종료합니다.");
				break;
			}
		}
	}
}
