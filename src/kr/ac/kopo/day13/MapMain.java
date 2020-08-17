package kr.ac.kopo.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("패스워드 변경서비스입니다");
		System.out.println("변경하라 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디 ["+ id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.println("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id,  newPassword);
		System.out.println("패스워드를 변경하였습니다.");
		
		System.out.println("< 전체 회원 목록 >");
		
		Set<Entry<String, String>> entry = map.entrySet();
		
		// while문에 조건을 hasNext 메서드로 검사한 뒤 next 메서드로 데이터를 반환하는 것이 안전		
		Iterator<Entry<String, String>> ite = entry.iterator();
		
		while(ite.hasNext()) {
			Entry<String, String> e = ite.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("id : " + key + ", password : " + value);
		}
		
		
		
	}

}
