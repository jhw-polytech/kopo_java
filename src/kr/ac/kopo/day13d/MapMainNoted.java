package kr.ac.kopo.day13d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	Map: key, value 쌍으로 이루어진 집합(순서 x, key 중복 x)
	- HashMap: 
	- TreeMap: 


	비밀번호 변경 서비스를 만들어보려고 함.
*/
public class MapMainNoted {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<> ();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("패스워드 변경서비스입니다.");
		System.out.println("변경할 아이디를 입력하세요.");
		
		String id = sc.nextLine();
		
		if(!map.containsKey(id) ) {
			System.out.println("입력하신 아이디 [ " + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		} //if문 안에 exit()가 있으므로, else로 굳이 내포된 형태를 만들어 줄 필요 없이 바로 다음 문장을 작성해도 된다.
		
		System.out.println("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		
		
		// 객체.equals(상수) <--- 덜 권장(객체가 null값일 수도 있어서)
		// 상수.equals(객체) <---- 권장
		
		if(!map.containsKey(get(id).equals(password)) ) {
			System.out.println("패스워드가 올바르지 않습니다");
		}
		
		System.out.println("< 전체 회원 목록 >");
		

		Set<Entry<String, String>> entry = map.entrySet();
		
		Iterator<Entry<String, String>> ite = entry.iterator();
		
		
		
		while(ite.hasNext()) {
			
		}
		
		ite.next();
				String key = e.getKEy();
		String value = e.getValue();
		System.out.println("id: "+ key + ", password: " + value);
		
	}
	
}
