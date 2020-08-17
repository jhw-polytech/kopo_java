package hw.hw14.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
	public static int currentindex;
	private int ipt;
	private Scanner sc;
	private ArrayList<BoardPost> bp;
	private int no;

	public BoardView() {
		sc = new Scanner(System.in);
		bp = new ArrayList<BoardPost>();
	}

	public int scanInt(String msg) {
		System.out.print(msg);
		ipt = sc.nextInt();
		sc.nextLine();
		return ipt;
	}

	public void execute() {
		loop: while (true) {
			no = scanInt("----------------------------\n " + "1.전체게시물 조회\n " + "2.글번호 조회\n" + " 3. 글등록\n 4. 글수정 \n "
					+ "5. 글삭제 \n " + "0. 종료 \n----------------------------\n" + "메뉴 중 처리할 항목을 선택하세요 : ");
			System.out.println("입력한 항목 : " + no);

			switch (no) {
			case 1:
				Seeall all = new Seeall();
				all.process(no, bp);
				break;
			case 2:
				Seeindex ind = new Seeindex();
				ind.process(no, bp);
				break;
			case 3 :
				Regist reg = new Regist();
				reg.process(no, bp);
				break;
			case 4:
				Update upd = new Update();
				upd.process(no, bp);
				break;
			case 5:
				Delete del = new Delete();
				del.process(no, bp);
				break;
			case 0:
				break loop;
			}
		}

	}
}
