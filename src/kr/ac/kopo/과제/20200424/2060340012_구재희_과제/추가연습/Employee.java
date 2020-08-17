package jaeheehomework;

public class Employee {

	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee(String name, String title, int baseSalary){
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
	}
	
	public void getTotalSalary() {
		if(title.equals("부장")) {
			totalSalary = (int) (baseSalary * 1.25);
		} else if(title.equals("과장")) {
			totalSalary = (int) (baseSalary * 1.15);
		} else {
			totalSalary = (int) (baseSalary * 1.05);
		}
	}
	
	public void print() {
		getTotalSalary();
		System.out.printf("직위 : %s, 이름 : %s, 본봉 : %d, 총급여 %d", title, name, baseSalary, totalSalary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("이부장", "부장", 1500000);
		e.print();
	}
}
