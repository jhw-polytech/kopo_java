package shlee1993.day10.homework;

public class Hw10Student {
	private String name;
	private int age;
	private int id;
	
	public Hw10Student() {
	}
	
	public Hw10Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s\t나이 : %d\t학번 : %d\n", name, age, id);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	
	
}
