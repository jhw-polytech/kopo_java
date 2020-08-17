package test0423;

public class Triangle extends Figure {
	
	 int width;
	 int height;
	
	Triangle(){
		
	}
	
	Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double areaMethod() {
		
		NumChoice n = new NumChoice();
		width = n.getNumRandom();
		height = n.getNumRandom();
		area = (width*height)/2;
		return area;
	}

}
