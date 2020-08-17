package kr.ac.kopo.day10.project.project09;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee01 = new Employee("이부장", "부장", 1500000);
		Employee employee02 = new Employee("김과장", "과장", 1300000);
		Employee employee03 = new Employee("최대리", "대리", 1200000);
		Employee employee04 = new Employee("박사원", "사원", 1000000);
		employee01.print();
		employee02.print();
		employee03.print();
		employee04.print();
	}

}
