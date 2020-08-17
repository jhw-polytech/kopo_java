package kr.ac.kopo.day01;

public class ConstantMain {

	
	public static void main(String[] args) {
		int radius = 10;
		
		double area = radius * radius * 3.14;
		System.out.println("반지름: 10 ==> 원 넓이: "+area);
		
		area = radius * radius * 3.141592;
		System.out.println("반지름: 10 ==> 원 넓이: "+area);
		
		
		
		//파이값을 일정하게 고정시키기 위해 상수로 고정!
		final double PI = 3.14;
		area = radius * radius * PI;
		System.out.println("반지름: 10 ==> 원 넓이: "+area);
		System.out.println("반지름: 10 ==> 원 넓이: "+area);
		
		
		
	}
}
