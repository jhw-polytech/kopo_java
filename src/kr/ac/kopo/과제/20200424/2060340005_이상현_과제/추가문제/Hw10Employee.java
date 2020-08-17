package shlee1993.day10.homework;

public class Hw10Employee {
	private String name;
	private int age;
	private String dept;
	
	public Hw10Employee() {
	}
	
	public Hw10Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s\t나이 : %d\t부서 : %s\n", name, age, dept);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
