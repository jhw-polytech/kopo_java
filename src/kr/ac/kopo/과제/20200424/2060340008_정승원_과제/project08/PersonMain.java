package kr.ac.kopo.day10.project.project08;

public class PersonMain {
	public static void main(String[] args) {
		Person.getPopulation();
		Person person01 = new Person(3);
		Person person02 = new Person("승원");
		Person person03 = new Person(24, "미애");
		Person person04 = new Person(3, "철수");
		
		person01.selfIntroduce();
		person02.selfIntroduce();
		person03.selfIntroduce();
		person04.selfIntroduce();
		Person.getPopulation();
		/**
		         총 인구수는 0명 입니다.
			내 이름은 Anonymous이며, 나이는 3살입니다.
			내 이름은 승원이며, 나이는 12살입니다.
			내 이름은 미애이며, 나이는 24살입니다.
			내 이름은 철수이며, 나이는 3살입니다.
			총 인구수는 4명 입니다.
		 */
	}
}
