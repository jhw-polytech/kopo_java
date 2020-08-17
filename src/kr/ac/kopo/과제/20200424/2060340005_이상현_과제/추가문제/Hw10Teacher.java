package shlee1993.day10.homework;

public class Hw10Teacher {
	private String name;
	private int age;
	private String subject;
	
	public Hw10Teacher() {
	}
	
	public Hw10Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s\t나이 : %d\t담당과목 : %s\n", name, age, subject);
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
