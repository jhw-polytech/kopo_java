package kr.ac.kopo.day14.note;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*

 요것을 객체지향으로 분리해서 혼자 만들어보면 아주 도움이 될 것입니다 ㅋㅎㅋ..ㅋ..ㅎ.ㅋ.ㅎ...

*/

public class MemberMain02Noted {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<MemberNoted> memberList = new ArrayList<>();

		memberList.add(new MemberNoted("aaa", "1111"));
		memberList.add(new MemberNoted("bbb", "2222"));
		memberList.add(new MemberNoted("ccc", "3333"));
		memberList.add(new MemberNoted("ddd", "4444"));

		System.out.println("패스워드 변경서비스입니다 ...");
		System.out.println("아이디를 입력하세요 : ");



		boolean bool = memberList.contains(user);
		
		if(!bool) {
			System.out.println("아이디 존재 ㄴㄴ");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}

		int index = memberList.indexOf(user);
		System.out.println("아이디 존재 ㅇㅇ 패스워드 입력 ㄱㄱ");
		String password = sc.nextLine();

		if(memberList.get(index).getPassword().equals(password)) {
//			System.out.println("패스워드가 올바르지 않습니다.");
//			System.out.println("서비스를 종료합니다.");
//			System.exit(0);

		throw new CheckIDPWExceiptionNoted(2);
//		throw new CheckIDPWExceiption("패스워드가 올바르지 않습니다.");   <--- 이렇게 날라가도 String 받는 생성자가 있으니 ㅇㅋㄷㅋ
		}
		

		System.out.println("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		memberList.remove(index); 
		memberList.add(index, new MemberNoted(id, newPassword)); 
		
		
		System.out.println("< 전체 회원 목록 >");
		Iterator<MemberNoted> ite = memberList.iterator();
		while(ite.hasNext()) { 
			MemberNoted m = ite.next(); 
			System.out.println(m); 

			
		}
	}
}
