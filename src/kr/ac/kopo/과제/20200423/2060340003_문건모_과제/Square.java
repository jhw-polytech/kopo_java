package test0423;

public class Square extends Rectangle {
	
	int width;
	
	Square(){
		
	}
	
	Square(int width){
		this.width = width;
	}
	
	@Override
	public double areaMethod() {
		
		NumChoice n = new NumChoice();
		width = n.getNumRandom();
		area = width*width;
		return area;
		
	}

}
