package shlee1993.day10.homework;

public class Hw10Main {
public static void main(String[] args) {
		
		Hw10Student s = new Hw10Student("홍길동", 20, 200201);
		Hw10Teacher t = new Hw10Teacher("이순신", 30, "JAVA");
		Hw10Employee e = new Hw10Employee("유관순", 40, "교무과");
		
		s.getInfo();
		t.getInfo();
		e.getInfo();	
	}

}
