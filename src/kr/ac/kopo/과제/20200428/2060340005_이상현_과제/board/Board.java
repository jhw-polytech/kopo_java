package shlee1993.day12.homework;

import java.util.Scanner;

public class Board {
	private Post[] boardList;
	Scanner sc;
	public static int num = 1;	//글번호를 위한 static 변수

	public Board() {
		boardList = new Post[100];
		boardList[0] = new Post();
	}

	public void checkAllPost() {
		System.out.println("\t\t<전체 게시글 조회>");
		System.out.printf("%s\t%s\t%s\t\t%s\n", "번호", "제목", "글쓴이", "등록일");

		for (int i = 0; i < Board.num; i++) {
			if (boardList[i].getNum() != 0) {
				System.out.printf("%-8d", boardList[i].getNum());
				System.out.printf("%-16s", boardList[i].getTitle());
				System.out.printf("%-16s", boardList[i].getWriter());
				System.out.printf("%-16s", boardList[i].getDate());
				System.out.println();
			}
		}
		System.out.println();
	}

	public void checkPost() {
		System.out.println("조회를 원하는 번호 입력 : ");
		sc = new Scanner(System.in);
		int checkNum = Integer.parseInt(sc.nextLine());

		if (boardList[checkNum].getNum() != 0) {
			System.out.printf("\t\t<%d번 게시글 조회>", checkNum);
			System.out.printf("%s\t%s\t%s\t%s\n", "번호", "제목", "글쓴이", "등록일");

			System.out.printf("%-8d", boardList[checkNum].getNum());
			System.out.printf("%-16s", boardList[checkNum].getTitle());
			System.out.printf("%-16s", boardList[checkNum].getWriter());
			System.out.printf("%-16s", boardList[checkNum].getDate());
			System.out.println();
		} else
			System.out.println("조회결과 없음");
	}

	public void createPost() {
		System.out.println("제목을 입력 : ");
		sc = new Scanner(System.in);
		String title = sc.nextLine();

		System.out.println("작성자를 입력 : ");
		sc = new Scanner(System.in);
		String writer = sc.nextLine();

		boardList[num] = new Post(title, writer);
	}

	public void modPost() {
		System.out.println("수정을 원하는 번호 입력 : ");
		sc = new Scanner(System.in);
		int checkNum = Integer.parseInt(sc.nextLine());

		System.out.println("수정할 제목을 입력 : ");
		sc = new Scanner(System.in);
		String change = sc.nextLine();
		boardList[checkNum].setTitle(change);
	}

	public void deletePost() {	//NULL로 보내 삭제해도 되지만, 혹시 불러오기 위해 NUM값만 바꿔 전체 조회했을 때만 조회가 안되게 했습니다.
		System.out.println("삭제를 원하는 번호 입력 : ");
		sc = new Scanner(System.in);
		int checkNum = Integer.parseInt(sc.nextLine());

		boardList[checkNum].setNum(0);
	}

}
