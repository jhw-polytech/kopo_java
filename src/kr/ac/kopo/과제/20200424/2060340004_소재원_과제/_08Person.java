package exam0424.etc;

public class _08Person {

	static int numberOfPersons;
	int age;
	String name;
	
	_08Person() {
		age = 12;
		name = "Anonymous";
		numberOfPersons++;
	}
	
	_08Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	public void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
	}
	
	public int getPopulation() {
		return numberOfPersons;
		
	}
}
