package board;

import java.util.Scanner;

public class BoardGo {

	private int num;
	private int choice;
	private String title;
	private String writer;
	private String date;
	private Board arr[] = new Board[100];

	Scanner sc = new Scanner(System.in);

	public void print() {
		while (true) {
			System.out.println("-----------------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글 등록");
			System.out.println("4. 글 수정");
			System.out.println("5. 글 삭제");
			System.out.println("0. 종료");
			System.out.println("-----------------------");
			int num = sc.nextInt();

			switch (choice) {
			case 1:
				postAll();
				break;

			case 2:
				postNum();
				break;

			case 3:
				write();
				break;

			case 4:
				again();
				break;

			case 5:
				delete();
				break;

			}
		}

	}

public void postAll() {
		   System.out.println("< 전체 게시글 조회 >");
		   
		   System.out.println("번호\t제목\t글쓴이\t등록일");
		   
		   for(int i = 0; i< num; i++) {
			   System.out.print(arr[i].getNum()+"\t"+ arr[i].getTitle()+"\t"+arr[i].getWriter()+"\t"+ arr[i].getDate());
		   }
	   }

	public void postNum() {
		System.out.println("< 글 번호 조회 >");
		System.out.printf("번호\t제목\t글쓴이\t등록일");
		System.out.printf(arr[num].getNum() + "\t" + arr[num].getTitle() + "\t" + arr[num].getWriter() + "\t"
				+ arr[num].getDate());
		System.out.println();
	}

	public void write() {
		System.out.println("등록할 제목을 입력 : ");
		title = sc.nextLine();
		System.out.println("등록할 글쓴이를 입력 : ");
		writer = sc.nextLine();
		arr[num] = new Board(num, title, writer);
		num++;
		System.out.println("게시글이 등록되었습니다. ");
	}

	public void again() {
		System.out.println("수정할 제목을 입력 : ");
		title = sc.nextLine();
		arr[num].setTitle(title);
		System.out.println("수정할 글쓴이를 입력 : ");
		writer = sc.nextLine();
		arr[num].setWriter(writer);
		System.out.println("수정완료");
	}

	public void delete() {
		for (int i = num; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println("삭제 완료");
	}

}
