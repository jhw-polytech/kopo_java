package kr.ac.kopo.day10.project.project08;

public class Person {

	private static int numberOfPersons;
	private int age;
	String name;
	
	public Person() {
		this(12, "Anonymous");
	}
	
	public Person(int age) {
		this(age, "Anonymous");
	}
	
	public Person(String name) {
		this(12, name);
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	public void selfIntroduce() {
		System.out.printf("내 이름은 %s이며, 나이는 %d살입니다.\n", name, age);
	}
	
	public static int getPopulation() {
		System.out.println("총 인구수는 "+numberOfPersons+"명 입니다.");
		return numberOfPersons;
	}
}
