package kr.ac.kopo.day10.project.project09;

public class Employee {

	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee() {
		
	}
	
	
	public Employee(String name, String title, int baseSalary) {
		/**
		 *  title 이 “부장” 이면 totalSalary 는 baseSalary + baseSalary 의 25%로 계산   
		 *  title 이 “과장” 이면 totalSalary 는 baseSalary + baseSalary 의 15%로 계산  
		 *  나머지 totalSalary 는 baseSalary + baseSalary 의 5%로 계산 
		 */
		switch(title) {
		case "부장":
			this.totalSalary += (baseSalary + baseSalary * 0.25);
			break;
		case "과장":
			this.totalSalary += (baseSalary + baseSalary * 0.15);
			break;
		default:
			this.totalSalary += (baseSalary + baseSalary * 0.05);
		}
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
	}
	
	public void print() {
		System.out.printf("%s직급의 %s씨의 본봉은 %d원이고 총급여는 %d원입니다. \n", title, name, baseSalary, totalSalary);
	}
}
