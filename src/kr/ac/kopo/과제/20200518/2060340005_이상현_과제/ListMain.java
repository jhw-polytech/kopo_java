package day0518.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = -1;	//인덱스값으로 올 수 없는 -1로 초기화하는 습관

		List<Member> list = new ArrayList<>();
		list.add(new Member("aaa", "1111"));
		list.add(new Member("bbb", "2222"));
		list.add(new Member("ccc", "3333"));
		list.add(new Member("ddd", "4444"));

		System.out.println("패스워드 변경");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				idx = i;
				break;
			}
			if (i == list.size() - 1) {	//id를 찾기
				System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
				System.out.println("종료합니다");
				System.exit(0);
			}
		}

		System.out.print("현재 패스워드 입력 : ");
		String password = sc.nextLine();

//		for (int i = 0; i < list.size(); i++) {	//이렇게 하면 다른 사람의 패스워드로도 접근이 가능합니다
//			if (password.equals(list.get(i).getPw())) {
//				break;
//			}
//			if (i == list.size() - 1) {
//				System.out.println("패스워드가 일치하지 않습니다");
//				System.out.println("종료합니다");
//				System.exit(0);
//			}
//		}
		
		if (!password.equals(list.get(idx).getPw())) {
			System.out.println("패스워드가 일치하지 않습니다");
			System.out.println("종료합니다");
			System.exit(0);
		}

		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		sc.close();
		list.get(idx).setPw(newPassword);
		System.out.println("변경완료");

		System.out.println("<전체 회원 목록>");
		Iterator<Member> ite = list.iterator();
		while (ite.hasNext()) {	//arraylist 개수만큼 돌기
			Member e = ite.next();
			String key = e.getId();
			String value = e.getPw();
			System.out.println("id : " + key + ", password : " + value);
		}
	}
}
