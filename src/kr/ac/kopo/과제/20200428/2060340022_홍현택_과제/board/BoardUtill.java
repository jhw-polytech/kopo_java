package kr.co.hana.homework12.Board;

import java.util.Scanner;

public class BoardUtill {
	Scanner sc = new Scanner(System.in);
	static String[][] boardArr = new String[10][];

	static int boardArrCnt = 0;
	static int seq = 1;

	// 1. 전체 게시물 조회
	public void list() {
		if (boardArrCnt == 0) {
			System.out.println("등록된 게시판 없습니다");
		} else {
			System.out.println("<전체 게시글 조회>");
			System.out.println("번호\t" + "제목\t" + "글쓴이\t" + "등록일\t");
			for (int i = 0; i < boardArrCnt; i++) {
				System.out.println(boardArr[i][0] + "\t" + boardArr[i][1] + "\t" + boardArr[i][2]);
			}
		}
	}

	// 2.글번호 조회
	public void num() {
		System.out.println("조회할 글번호 입력 : ");
		int num = sc.nextInt();
		System.out.println("번호\t" + "제목\t" + "글쓴이\t" + "등록일\t");
		System.out.println(boardArr[num][0] + "\t" + boardArr[num][1] + "\t" + boardArr[num][2]);
	}

	// 3.글등록
	public void add() {
		String[] boardArrVar = new String[3];
		boardArrVar[0] = String.valueOf(seq);
		System.out.println("등록할 제목을 입력");
		boardArrVar[1] = sc.nextLine();
		System.out.println("등록한 글쓴이를 입력");
		boardArrVar[2] = sc.nextLine();
		boardArr[boardArrCnt] = boardArrVar;
		System.out.println("게시글이 등록되었습니다.");

		seq++;
		boardArrCnt++;
	}

	// 4.글수정
	public void modify() {
		if (boardArrCnt == 0) {
			System.out.println("수정할 게시판 없습니다");
		} else {
			System.out.println("수정할 번호를 입력하세요.");
			String[] boardArrVar = new String[3];
			int boardArrCnt = sc.nextInt() - 1;
			sc.nextLine();
			boardArrVar[0] = boardArr[boardArrCnt][0];
			System.out.println("수정할 제목을 입력");
			boardArrVar[1] = sc.nextLine();
			System.out.println("등록한 글쓴이를 입력");
			boardArrVar[2] = sc.nextLine();

			boardArr[boardArrCnt] = boardArrVar;
			System.out.println("게시글이 등록되었습니다.");

		}
	}

	// 5.글삭제   => 경우에 따라서 에러남..
	public void delete() {
		if (boardArrCnt == 0) {
			System.out.println("등록된 게시판이 없습니다");
		} else {
			System.out.println("삭제할 번호를 입력하세요.");
			int cnt1 = sc.nextInt();
			sc.nextLine();
			System.out.println(cnt1);
			boardArr[cnt1] = null;
			boardArrCnt--;
		}
	}
}
