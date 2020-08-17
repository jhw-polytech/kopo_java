package kr.ac.kopo.day13;

import java.util.HashMap;
import java.util.Map;

class Member {
	private String name;
	private String phone;

	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// hashCode, equals 두가지를 만족해야 '같다'라고 할 수 있다.
	// --> Object 클래스에 있던 메소드 오버라이드
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Member other = (Member) obj;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.contentEquals(other.phone))
			return false;

		return true;
	}
	
	//이건 그냥 편하라고 오버라이드 하는건가?
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
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

public class MapMain02 {
	public static void main(String[] args) {

Map<Member, Car> list = new HashMap<>();
		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "34거1456"));
		list.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "63나8843"));
		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("K7", "53소3423"));
		
		System.out.println("등록된 차량대수 : " + list.size() + "대");
		Member m = new Member("홍길동", "010-1111-2222");
		System.out.println(m);

	}
}
