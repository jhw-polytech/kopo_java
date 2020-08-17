package board;

import java.util.Scanner;

public class BoardUtil {

	private Scanner sc;

	public BoardUtil(){
		sc = new Scanner(System.in);
	}

	public void update(int num) {
		if(num>Board.rows) {
			System.out.println(num+"번 게시물은 존재하지 않습니다.");
			return;
		}
		System.out.print("수정후 제목을 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정후 글쓴이를 입력 : ");
		String users = sc.nextLine();

		Board.users.set(num-1,new Post(title,users));
		System.out.println("게시글이 수정되었습니다");
	}
	public void insert() {
		if(Board.rows>=Board.MAX_SIZE) {
			System.out.println("최대 허용된 게시글 개수를 초과했습니다. 게시글을 삭제해주시길 바랍니다.");
			return;
		}
		System.out.print("등록할 제목을 입력 : ");
		String title = sc.nextLine();
		System.out.print("등록할 글쓴이를 입력 : ");
		String users = sc.nextLine();

		Board.users.add(new Post(title,users));
		System.out.println("게시글이 등록되었습니다");
		Board.rows++;

	}
	public void delete(int num) {
		if(num>Board.rows) {
			System.out.println(num+"번 게시물은 존재하지 않습니다.");
			return;
		}
		Board.users.remove(num-1);
		Board.rows--;
		System.out.println(num+"번 게시물을 삭제하였습니다.");
	}
	public void select(int num) {
		if(num>Board.rows) {
			System.out.println(num+"번 게시물은 존재하지 않습니다.");
			return;
		}
		System.out.println("< "+num+"번 게시글 조회 >");
		System.out.println("번호\t제목\t글쓴이\t등록일");

		System.out.println((num)+"\t"+Board.users.get(num-1).getTitle()+"\t"
				+Board.users.get(num-1).getWriter()+"\t"+Board.users.get(num-1).getDate());

	}

	public void select() {
		if(Board.rows==0) {
			System.out.println("등록된 게시물이 없습니다.");
			return;
		}

		System.out.println("< 전체 게시글 조회 >");
		System.out.println("번호\t제목\t글쓴이\t등록일");

		for(int i=0;i<Board.rows;i++) {
			System.out.println((i+1)+"\t"+Board.users.get(i).getTitle()+"\t"
					+Board.users.get(i).getWriter()+"\t"+Board.users.get(i).getDate());
		}
	}
}
