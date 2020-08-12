package kr.ac.kopo.day14.note;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMainNoted {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<MemberNoted> memberList = new ArrayList<>();

		memberList.add(new MemberNoted("aaa", "1111"));
		memberList.add(new MemberNoted("bbb", "2222"));
		memberList.add(new MemberNoted("ccc", "3333"));
		memberList.add(new MemberNoted("ddd", "4444"));

		System.out.println("패스워드 변경서비스입니다 ...");
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		MemberNoted user = new MemberNoted(id);

		// 학생들이 많이 썼던 방법 ㅋㅋㅋ
		// for(int i = 0; i < memberList.size(); i++) {
		/*
		 * if(memberList.get(i).getId().equals(id)) {
		 * 
		 * } }
		 * 
		 * // 아니면 이런형식 ㅋㅋㅋ // ---> 그런데 교수님은 id, pw를 비교하지 않고 id 하나만 비교하는 equals() 메소드를
		 * Member클래스에 만들어줄 것임 for ( Member m : memberList) {
		 * 
		 * // String vs String으로 비교하면 안됨. 왜냐면....? // 대신 멤버객체 vs 멤버객체로 비교할 거심
		 * if(m.equals(new Member(id)))
		 * 
		 * }
		 */

		// 방법 1

		/*
		 * boolean bool = false;
		 * 
		 * for(Member m : memberList) { if(m.equals(user)) { bool = true; break; } }
		 * 
		 * if(bool) { System.out.println("아이디 존재"); } else {
		 * System.out.println("아이디 존재하지 않음"); }
		 */

		// 방법 2 ---> contains를 쓰면 더 간결해진다.
		// 안에서 contains라는 애들도 equals를 한다는 것이다. equals를 얼마나 잘 쓰는지가 중요한 것임

		boolean bool = memberList.contains(user);
		
		if(!bool) {
			System.out.println("아이디 존재 ㄴㄴ");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		// List의 document를 가보면, indexOf() 메소드가 있는데,
		// 해당하는 object가 있을 때 걔가 있는 index를 반환하는 indexOt(Object o) 메소드가 있다.
		int index = memberList.indexOf(user);
		System.out.println("아이디 존재 ㅇㅇ 패스워드 입력 ㄱㄱ");
		String password = sc.nextLine();
		//이것들은 모두 equals를 썼기 때문에 가능함
		if(memberList.get(index).getPassword().equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		

		System.out.println("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		memberList.remove(index); //1. 인덱스에 있는애를 먼저 지워
		memberList.add(index, new MemberNoted(id, newPassword)); // 2. 그 자리에 새로운 객체로 채워줫!
		// memberList.set(index, new Member(id, newPassword));라고 쓰면 바로 변경된다...???
		
		
		System.out.println("< 전체 회원 목록 >");
		Iterator<MemberNoted> ite = memberList.iterator();
		while(ite.hasNext()) { //데이터가 있다면
			MemberNoted m = ite.next(); //갖고와
			System.out.println(m); // toString() 만들어놨으니까 찍어
			
			// -> 위 두줄 합쳐서 System.out.println(ite.next()); 라고 축약해도 ㅇㅋㄷㅋ
			// ite.next()는 멤버객체가 리턴되는데, 멤버는 객체이름만 호출하면 컴퓨터는 toString()으로 호출한다.
			// 그래서 ite.next().toString()으로 호출된 것과 같은 결과를 냄 -----> 뭔소리징 :D...
			
		}
	}
}
