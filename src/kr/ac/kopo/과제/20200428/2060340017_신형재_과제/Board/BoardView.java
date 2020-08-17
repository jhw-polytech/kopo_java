package homework0428_Board;

import java.util.*;

public class BoardView {
	
	Scanner sc = new Scanner(System.in);
	List<Content> list = new ArrayList<>();
	Content content = null;
	
	public void execute() {
		startMenu();
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void startMenu() {
		
		print("--------------------------------------------------");
		print("1. 전체게시물 조회 ");
		print("2. 글번호 조회 ");
		print("3. 글등록");
		print("4. 글수정");
		print("5. 글삭제 ");
		print("0. 종료");
		print("--------------------------------------------------");
		print("메뉴를 선택하세요 : ");
		int num =sc.nextInt();
		sc.nextLine();
		
		if(num==0) {
			print("프로그램을 종료합니다.");
			System.exit(0);
		}else if(num==1) {
			showAll();
			startMenu();
		}else if(num==2) {
			showNum();
			startMenu();
		}else if(num==3) {
			getContent();
			startMenu();
		}else if(num==4) {
			editContent();
			startMenu();
		}else if(num==5) {
			deleteContent();
			startMenu();
		}else {
			print("잘못된 입력입니다. 0~5에 해당하는 번호를 입력하세요");
			startMenu();
		}		
	}
	public void showAll() {
		print("전체게시물 조회를 선택하셨습니다.");
		print("번호\t제목\t글쓴이\t등록일");
		for(int i=0; i<list.size(); i++) {
			content = list.get(i);
			content.showContent();
		}
	}
	public void showNum() {
		print("조회할 번호를 입력하세요");
		int i = sc.nextInt();
		sc.nextLine();
		if(list.size()>0 && i>=1&&i<=list.size()) {
			content=list.get(i-1);
			content.showContent();
		}else {
			print("유효한 번호가 아닙니다. 입력한 데이터의 번호만 사용 가능합니다.");
		}
	}
	public void getContent() {
		int num = Content.checkpoint;
		Content.checkpoint++;
		print("제목 입력 : ");
		String subject = sc.nextLine();
		print("저자 : ");
		String writer = sc.nextLine();
		print("입력 일을 설정하세요 : \t YYYY-MM-DD");
		String date = sc.nextLine();
		
		Content content2 = new Content(num, subject, writer, date);
		list.add(content2);
	}
	public void editContent() {
		print("수정할 번호를 입력하세요(필요 시 조회 : 0번 입력)");
		int i = sc.nextInt();
		sc.nextLine();
		if(i==0) {
			showAll();
		}else {
			print("수정할 제목을 입력하세요.");
			String subject = sc.nextLine();
			print("수정할 저자를 입력하세요");
			String writer = sc.nextLine();
			print("수정할 날짜를 입력하세요.\\t YYYY-MM-DD");
			String date = sc.nextLine();
			
			Content content = list.get(i-1);
			content.setContent(i-1, subject, writer, date);
		}
	}
	public void deleteContent() {
		print("삭제할 번호를 입력하세요");
		int i = sc.nextInt();
		sc.nextLine();
		list.remove(i-1);
	}
}
