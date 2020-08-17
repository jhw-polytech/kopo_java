package jaeheehomework;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeBoard {

	private static int num;                              // 등록될 글 번호. 계속 누적되어야 하므로 static
	private ArrayList<UserInfo> arr = new ArrayList<>(); // user 정보를 담을 arraylist
	private int noticeNum;                               // 사용자가 조회, 수정, 삭제 하고 싶은 글의 번호
	
	Scanner sc = new Scanner(System.in);

	// 글 등록
	public void register() {
		
		UserInfo user = new UserInfo();          // 글 등록시 새로운 user 인스턴스 생성
		
		System.out.println("등록할 제목을 입력 : ");
		String title = sc.nextLine();
		user.setTitle(title);
		
		System.out.println("등록할 글쓴이를 입력 : ");
		String writer = sc.nextLine();
		user.setWriter(writer);
		
		System.out.println("등록할 공지사항 입력 : ");
		String notice = sc.nextLine();
		user.setNotice(notice);
		
		num += 1;
		user.setNum(num);                       // 글 등록하면 번호는 알아서 1씩 증가
		
		arr.add(user);                          // user 정보를 arrylist에 저장
	}
	
	// 글 수정
	public void update() {
		
		System.out.println("수정할 글 번호 입력 : ");
		noticeNum = Integer.parseInt(sc.nextLine());
		
		for(UserInfo notice : arr) {
			if(notice.getNum() == noticeNum ) {         //글 번호로 조회
				
				System.out.println("수정할 제목을 입력하세요");
				notice.setTitle(sc.nextLine());
				
				System.out.println("수정할 글을 입력하세요");
				notice.setNotice(sc.nextLine());
			}
		}	
	}
	
	//글 삭제
	public void delete() {
		//제거 시에 내부적으로 루프를 도는데,
		//arraylist의 크기와 처리해야할 항목을 가리키는 인덱스의 불일치가 일어나기 때문에 에러 발생
		//따라서 size 변수를 만들어 remove시에 size를 줄여줘야함
		int size = arr.size();
		
		System.out.println("삭제할 글 번호 입력 : ");
		noticeNum = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < size; i++) {
			int num = arr.get(i).getNum();
			if(num == noticeNum) {
				arr.remove(arr.get(i));
				size--;
				i--;
			}
		}
		System.out.println("삭제되었습니다");
		//for(UserInfo notice : arr) {
		//	if(notice.getNum() == noticeNum) {
		//		arr.remove(notice);
		//	}
		//}
	}
	
	//글번호로 조회
	public void search() {
		
		System.out.println("조회할 글 번호 입력 : ");
		noticeNum = Integer.parseInt(sc.nextLine());
		
		
		for(UserInfo notice : arr) {
			if(notice.getNum() == noticeNum) {
				System.out.printf("%s\t%s\t\t%s\t%s\n", "번호", "제목", "글쓴이", "등록일");
				System.out.printf("%d\t%s\t\t%s\t%s\n",
								  notice.getNum(), notice.getTitle(), notice.getWriter(), notice.getDate());
				System.out.println("<공지 내용>");
				System.out.println(notice.getNotice());
			} 
		}
	}
	
	//전체 게시물 조회
	public void searchAll() {
		System.out.println("<전체 게시글 조회>");
		
		if(arr.size() == 0) {
			System.out.println("등록된 글이 존재하지 않습니다!");
		}
		
		System.out.printf("%s\t%s\t\t%s\t%s\n", "번호", "제목", "글쓴이", "등록일");
		
		for(UserInfo notice : arr) {	
			System.out.printf("%d\t%s\t\t%s\t%s\n",
					  notice.getNum(), notice.getTitle(), notice.getWriter(), notice.getDate());
		}
		
	}
}
