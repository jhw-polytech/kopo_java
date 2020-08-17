package test0423;

public class Rectangle extends Figure {
	
	int width;
    int height;
	
	
	Rectangle(){
		
	}
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double areaMethod() {
		
		NumChoice n = new NumChoice();
		width = n.getNumRandom();
		height = n.getNumRandom();
		
		area = width*height;
		return area;
	}
	
	
	
}
	

