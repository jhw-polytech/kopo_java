package kr.ac.kopo.assignment.day08;

public class Triangle extends Figure {
	
	private int hight;
	
	Triangle(){
		
	}
	
	Triangle(int length, int hight){
		super(length);
		this.hight = hight;
	}
	
	public double getArea() {
				
		return getLength() * hight * 0.5;		
	}
	
	

}
