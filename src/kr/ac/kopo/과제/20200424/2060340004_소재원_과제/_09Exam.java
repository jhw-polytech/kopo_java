package exam0424.etc;

public class _09Exam {

	public static void main(String[] args) {

		_09Employee emp = new _09Employee("이부장", "부장", 1_500_000);
		_09Employee emp2 = new _09Employee("김과장", "과장", 1_300_000);
		_09Employee emp3 = new _09Employee("최대리", "대리", 1_200_000);
		_09Employee emp4 = new _09Employee("박사원", "사원", 1_000_000);
	
		emp.print();
		emp2.print();
		emp3.print();
		emp4.print();
	}
}
