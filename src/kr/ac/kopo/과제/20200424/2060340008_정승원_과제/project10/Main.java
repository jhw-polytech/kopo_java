package kr.ac.kopo.day10.project.project10;

public class Main {

	public static void main(String[] args) {
		
		Student student01 = new Student("홍길동", 20, 200201);
		Teacher teacher01 = new Teacher("이순신", 30, "JAVA");
		Employee employee01 = new Employee("유관순", 40, "교무과");
		
		student01.print();
		teacher01.print();
		employee01.print();
		
	}
}
