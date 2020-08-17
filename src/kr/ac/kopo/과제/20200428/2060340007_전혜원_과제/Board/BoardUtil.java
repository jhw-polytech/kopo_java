package kr.ac.kopo.boardVer1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
	음~~ 혜원씨~~~~~~
	title, writer, date을 가지는 클래스를 만들면 안될랑가요??? ^^
*/

public class BoardUtil {

	private int index;
	private int cnt;

	private String[] title;
	private String[] writer;
	private Date[] date;
	private Date now;
	private Scanner sc;

	private SimpleDateFormat dateform;

	public BoardUtil() {
		this.index = 0;
		this.cnt = 0;
		this.title = new String[100];
		this.writer = new String[100];
		this.date = new Date[100];
		this.now = new Date();

		sc = new Scanner(System.in);
	}

	// 전체 게시글 조회
	public void showAllPostings() {

		System.out.println("<  전체 게시글 조회  >");

		System.out.println("번호\t제목\t\t\t글쓴이\t등록일");

		
		
		dateform = new SimpleDateFormat ( "yyyy.MM.dd HH:mm");
		String writtenDate = dateform.format(now);

		
		for (int i = 0; i < index; i++) {
			
			// 제목에 null이 들어가 있는 것은 삭제된 게시물이므로 제외하고 출력
			if (title[i] != null) {
				System.out.printf("%d\t%s\t\t\t%s\t%s\n", i + 1, title[i], writer[i], writtenDate);
			}

		}
	}

	// 현재까지 저장된 게시글 마지막 인덱스 반환
	public void getIndexOfPosting() {
		System.out.println("지금까지 등록된 글의 개수는 " + cnt + "개입니다.");
	}

	// 게시물 등록
	public void uploadPosting() {
		System.out.println("등록할 제목을 입력 : ");
		title[index] = sc.nextLine();

		System.out.println("등록할 글쓴이를 입력 : ");
		writer[index] = sc.nextLine();

		date[index] = now;

		
		cnt++;
		index++;

		System.out.println("게시글이 등록되었습니다.");
		System.out.println("-----------------------------");

	}

	// 글번호 조회
	public void searchNumOfPosting() {

	}

	// 게시물 수정
	public void editPosting() {
		System.out.println("수정할 글 번호를 입력하세요.");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("수정할 제목을 입력하세요.");
		title[num+ 1] = sc.nextLine();
		
		//수정된 날짜 반영
		date[num] = now;

		System.out.println("글 수정이 완료되었습니다.");
	}

	// 게시물 삭제
	public void deletePosting() {
		System.out.println("삭제할 글 번호를 입력하세요.");
		int num = sc.nextInt();
		sc.nextLine();

		// 선택된 번호의 내용을 모두 null로 처리(후에 조건 걸어 출력제어)
		title[num+ 1] = null;
		writer[num+ 1] = null;
		date[num+ 1] = null;

		cnt--;

		System.out.println("글 삭제가 완료되었습니다.");

	}

	// 게시물 프로그램 종료
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
