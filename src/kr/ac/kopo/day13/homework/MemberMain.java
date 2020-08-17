package kr.ac.kopo.day13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	List를 써서 나타내기
*/
public class MemberMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();

		Member m = new Member("aaa", "1111");
		Member m2 = new Member("bbb", "2222");
		Member m3 = new Member("ccc", "3333");

		list.add(m);
		list.add(m2);
		list.add(m3);

		System.out.println("비밀번호 변경 서비스입니다.");
		System.out.println("비밀번호를 변경할 아이디를 입력하세요: ");

		String id = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {

			// 입력한 아이디가 리스트에 존재할 때
			if (list.get(i).getId().equals(id)==true) {
				
				
				System.out.println("현재 사용중인 비밀번호를 입력하세요.");
				String pw = sc.nextLine();
				
				// 입력한 비밀번호가 key의 value와 일치할 때
				if (list.get(i).getPw().equals(pw)) {
					System.out.println("변경할 비밀번호를 입력하세요.");
					String newPw = sc.nextLine();
					list.get(i).setPw(newPw);

					System.out.println("비밀번호 변경이 완료되었습니다.");
					break;
					
				
				
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("비밀번호 변경 시스템이 종료됩니다.");

					// 시스템 종료 전 시간차를 두어 긴장감 조성
					for (int j = 0; j < 3; j++) {
						Thread.sleep(700);
						System.out.print(". ");
					}

					System.exit(0);
				}
			} 
			if (list.get(i).getId().equals(id) == false || i == list.size()) {
				System.out.println("입력하신 아이디를 찾을 수 없습니다.");
				System.out.println("비밀번호 변경 시스템이 종료됩니다.");
		}


			// 긴장감
			for (int j = 0; j < 3; j++) {
				Thread.sleep(700);
				System.out.print(". ");
			}
			System.exit(0);
		}

		for (Member a : list) {
			System.out.println(a.getId() + "    " + a.getPw());
		}

	}

}
