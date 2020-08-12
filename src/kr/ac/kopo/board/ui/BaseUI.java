package kr.ac.kopo.board.ui;

import java.util.Scanner;

/*
		다른 UI 클래스들의 메소드들에 대해서 중복되는 것들을 갖고있을 뿐,
		실제로 이 클래스에서 객체를 생성할 필요는 없다 ---> 추상클래스로 만들어주자
 */
public abstract class BaseUI implements IBoardUI {

	Scanner sc;

	public BaseUI() {

		sc = new Scanner(System.in);

	}

	public int scanInt(int i) {
		System.out.println(i);
		return sc.nextInt();
	}

	public String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

}
