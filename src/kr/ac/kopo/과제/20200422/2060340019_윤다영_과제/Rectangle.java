package kr.ac.kopo.assignment.day08;

public class Rectangle extends Figure {
	
	private int length2;
	
	Rectangle(){
		
	}
	
	Rectangle(int length, int length2){
		
		super(length);
		this.length2 = length2;	
		
	}
	
	public double getArea() {
		
		return (double)getLength() * length2;
		
	}
	
	
}
