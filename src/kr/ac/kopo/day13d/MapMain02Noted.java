package kr.ac.kopo.day13d;

import java.util.HashMap;
import java.util.Map;

class Member {
	private String name;
	private String phone;

	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
}

class Car {
	private String name;
	private String id;

	public Car(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

public class MapMain02Noted {

	public static void main(String[] args) {

		Map<Member, Car> list = new HashMap<>();

		list.compute(new Member("홍길동", "010-1111-2222"), new Car(" 소나타", "34거1456"));
		list.compute(new Member("윤길동", "010-3333-4444"), new Car("모닝", "63나8843"));

		System.out.println("등록된 차량대수 : " + list.size() + "개");

	}

}
