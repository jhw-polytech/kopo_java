package shlee1993.day10.homework;

public class Hw09 {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;

	public Hw09() {
	}

	public Hw09(String name, String title, int baseSalary) {
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
		getTotalSalary();
	}
	
	public void getTotalSalary() {
		switch (title) {
		case "부장":
			totalSalary += (baseSalary + baseSalary * 0.25);
			break;
		case "과장":
			totalSalary += (baseSalary + baseSalary * 0.15);
			break;
		default:
			totalSalary += (baseSalary + baseSalary * 0.05);
		}
	}

	public void print() {
		System.out.printf("%s 직급의 %s씨의 본봉은 %d 원이고 총급여는 %d 원입니다. \n", title, name, baseSalary, totalSalary);
	}

}
