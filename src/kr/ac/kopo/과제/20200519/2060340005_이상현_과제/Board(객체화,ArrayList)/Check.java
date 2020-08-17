package shlee1993.day14.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Check {
	private Scanner sc;
	ArrayList<Post> boardList;

	public Check() {}
	public Check(ArrayList<Post> boardList) {
		this.boardList = boardList;
	}
	
	public void checkAllPost() {
		System.out.println("\t\t<전체 게시글 조회>");
		System.out.printf("%s\t%s\t%s\t\t%s\n", "번호", "제목", "글쓴이", "등록일");
		
		Iterator<Post> ite = boardList.iterator();
		while (ite.hasNext()) {	//arraylist 개수만큼 돌기
			Post p = ite.next();
			if(!(p == null)) {	//0번지를 제거하기 위해
				System.out.printf("%-8d", p.getNum());
				System.out.printf("%-16s", p.getTitle());
				System.out.printf("%-16s", p.getWriter());
				System.out.printf("%-16s", p.getDate());
				System.out.println();
			}
		}
		System.out.println();
	}

	public void checkPost() {
		System.out.println("조회를 원하는 번호 입력 : ");
		sc = new Scanner(System.in);
		int checkNum = Integer.parseInt(sc.nextLine());

		if (boardList.get(checkNum).getNum() != 0) {
			System.out.printf("\t\t<%d번 게시글 조회>", checkNum);
			System.out.printf("%s\t%s\t%s\t%s\n", "번호", "제목", "글쓴이", "등록일");

			System.out.printf("%-8d", boardList.get(checkNum).getNum());
			System.out.printf("%-16s", boardList.get(checkNum).getTitle());
			System.out.printf("%-16s", boardList.get(checkNum).getWriter());
			System.out.printf("%-16s", boardList.get(checkNum).getDate());
			System.out.println();
		} else
			System.out.println("조회결과 없음");
	}
}
