package test0423;

public class Circle extends Figure {
	
	 int radius;
	 static double Pi = 3.14;
	 
	 Circle(){
		 
	 }
	 
	 Circle(int radius){
		this.radius = radius; 
	 }
		 
	
	public double areaMethod() {
		
		NumChoice n = new NumChoice();
		radius = n.getNumRandom();
		area = radius*radius*Pi;
		return area;
	}

}
