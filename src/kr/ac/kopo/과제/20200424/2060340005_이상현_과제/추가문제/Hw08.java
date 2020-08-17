package shlee1993.day10.homework;

public class Hw08 {	//Person클래스입니다. 찾기 쉽게 문제 번호로 통일 했습니다.
	private static int numberOfPersons;
	private int age;
	String name;

	public Hw08() {
		this.age = 12;
		this.name = "Anonymous";
		numberOfPersons++;
	}

	public Hw08(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}

	public void selfIntroduce() {
		System.out.printf("내 이름은 %s이며, 나이는 %d살입니다.\n", name, age);
	}

	public static int getPopulation() {
		System.out.println("총 인구수는 " + numberOfPersons + "명 입니다.");
		return numberOfPersons;
	}

}