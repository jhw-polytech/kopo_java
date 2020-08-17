package homework0518;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member("aaa", "1111");
		Member m2 = new Member("bbb", "2222");
		Member m3 = new Member("ccc", "3333");
		Member m4 = new Member("ddd", "4444");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		System.out.println("패스워드 변경 서비스입니다.");
		System.out.print("변경할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		/*
			흠...... 흠......
			뭔가뭔가.. 꺼림직한디.....
			말하기 애매한.... 글로 쓰기 애매한......
		*/
		
		for(int i = 0; i<list.size(); i++) {
			
		if(list.get(i).getId().equals(id)) {
			System.out.print("패스워드를 입력하세요 : ");
			String password = sc.nextLine();
		
			if(list.get(i).getPassword().equals(password)) {
			System.out.print("변경할 패스워드를 입력하세요 : ");
			String newPassword = sc.nextLine();
			list.get(i).setPassword(newPassword);
			System.out.print("패스워드를 변경하였습니다.");
			System.out.println();
			
			for(int j = 0; j < list.size(); j++) {
				System.out.println("id: " + list.get(j).getId() + ", password: " + list.get(j).getPassword());
			}
			System.exit(0);
				}
			}
		}
		 int temp = 0;

		   if(temp == 0) {
		         System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
		         System.out.println("서비스를 종료합니다.");
		 }
	}
}
