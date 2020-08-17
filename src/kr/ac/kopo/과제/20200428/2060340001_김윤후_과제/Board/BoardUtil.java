package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardUtil {

	Scanner sc=new Scanner(System.in);
	
	private static int num;
	private ArrayList<UserInfo> arr = new ArrayList<>();
	private int num2;
	//게시판 글 등록
	
	
	public void regist () {

		UserInfo user =new UserInfo();
		
		System.out.println("제목 입력 : ");
		String title =sc.nextLine();
		user.setTitle();
		
		System.out.println("글쓴이 입력 : ");
		String Writer=sc.nextLine();
		user.setTitle();
		
		num +=1;
		user.setNum(num);
		
		arr.add(user);
	}
	
	
	//글 수정
	public void update() {
		
		System.out.println("수정할 글 번호는?");
		num2=sc.nextInt();
		sc.nextLine();
		
		for (UserInfo up : arr) {
				if(up.getNum()==num2) {
				System.out.println("제목 재입력");
				
				up.setTitle();
				sc.nextLine();
				
				System.out.println("글쓴이 재입력");
				up.setWriter();
				sc.nextLine();
			}
		}
	}
	//글 삭제
	
	public void del() {
		int size= arr.size();
		
		System.out.println("삭제할 글 번호는?");
		num2=sc.nextInt();
		sc.nextLine();
		
		for(int i =0; i< size; i ++) {
			int num = arr.get(i).getNum();
			if(num == num2) {
				arr.remove(arr.get(i));
				size--;
				i--;
			}
		}
		System.out.println("삭제 완료");
	}
	//글 번호로 조회
public void search() {
		
		System.out.println("조회할 글 번호 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		
		for(UserInfo notice : arr) {
			if(notice.getNum() == num2) {
				System.out.printf("%s\t%s\t\t%s\t%s\n", "번호", "제목", "글쓴이", "등록일");
				System.out.printf("%d\t%s\t\t%s\t%s\n",
								  notice.getNum(), notice.getTitle(), notice.getWriter(), notice.getDate());
				
			} 
		}
	}
	//전체 게시물
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
