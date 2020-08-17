package kr.ac.kopo.assignment.day08;

public class Circle extends Figure {
	
	Circle(){
		
	}
	
	Circle(int length){
		super(length);
	}
	
	public double getArea() {
		
		//원주율은 3.14로 지정한다
		double PI = 3.14;
		return getLength() * getLength() * PI;
		
	}
	
	
}
