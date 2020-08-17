package jaeheehomework;

public class Person {
	
	private int numberOfPerson;
	private int age;
	private String name;
	
	Person(){
		numberOfPerson++;
		age = 12;
		name = "Anonymous";
	}
	
	Person(int age, String name){
		numberOfPerson++;
		this.age = age;
		this.name = name;
	}
	
	public void selfIntroduce() {
		System.out.printf("내 이름은 %s이며, 나이는 %d살 입니다.", this.name, this.age);
	}
	
	public int getPopulation() {
		return this.numberOfPerson;
	}
	
}
