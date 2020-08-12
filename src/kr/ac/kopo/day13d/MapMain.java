package kr.ac.kopo.day13d;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	MAP : key, value 쌍으로 이루어진 집합(순서 X, key 중복 X)
 	 - HashMap
 	 - TreeMap
 */

public class MapMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// key : id, value : password
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("패스워드 변경서비스입니다");
		System.out.print("변경할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id) ) { // map 객체에 입력받은 id가 존재하지 않으면(!) --> 반환값 boolean 
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0); // 안에 코드가 0으로 들어가면 아래 코드와 상관 없이 프로그램 아예 종료
		} 
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드를 변경하였습니다");
		
		System.out.println("< 전체 회원 목록 >");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("id : " + key + ", password : " + map.get(key));
		}
	}
}












