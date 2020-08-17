package exam0424.etc;

public class _09Employee {
	
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	//문제가 보이드타입 메소드만 있는데.. 보이드 타입들로 계산이 가능한가 잘 생각이 안나서 리턴타입을 바꿨습니다.

	public _09Employee(String name, String title, int baseSalary) {

		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
		totalSalary = getTotalSalary(title);
	}
	
	public int getTotalSalary(String title) {
		
		if (title == "부장") {
			totalSalary = (int) (baseSalary + baseSalary * 0.25);
		} else if (title == "과장") {
			totalSalary = (int) (baseSalary + baseSalary * 0.15);
		} else {
			totalSalary = (int) (baseSalary + baseSalary * 0.05);
		}
		return totalSalary;
	}
	
	public void print() {
		System.out.println(title + " 직급의 " + name+"씨 본봉은 " + baseSalary+"원이고 "
				+ "총급여는 " + totalSalary + "원입니다.");
	}
}
