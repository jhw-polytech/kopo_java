package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
	private String id;
	private String password;

	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String setId(String id) {
		this.id = id;
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String setPassword(String password) {
		this.password = password;
		return password;
	}

}

public class ArrListMain {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		list.add(new Member("aaa", "111"));
		list.add(new Member("bbb", "222"));
		list.add(new Member("ccc", "333"));
		list.add(new Member("ddd", "444"));

		System.out.println("패스워드 변경서비스입니다.");
		System.out.println("변경할 아이디를 입력하세요 : ");
		String id = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				System.out.println("현재 패스워드를 입력하세요 : ");
				String password = sc.nextLine();

				if (list.get(i).getPassword().equals(password)) {
					System.out.println("변경할 패스워드를 입력하세요 : ");
					String newPassword = sc.nextLine();
					list.get(i).setPassword(newPassword);

					System.out.println("패스워드를 변경하였습니다.");
					System.out.println(newPassword);

					System.out.println("< 전체 회원 목록 >");

					for (int j = 0; j < list.size(); j++) {
						System.out.print(list.get(j).getId() + " ");
						System.out.print(list.get(j).getPassword());
						System.out.println();
					}
					System.exit(0);
				} else {
					System.out.println("패스워드가 올바르지 않습니다");
					System.out.println("서비스를 종료합니다");
					System.exit(0);

				}
			}
		}

		System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
		System.out.println("서비스를 종료합니다.");
		System.exit(0);
	}
}
