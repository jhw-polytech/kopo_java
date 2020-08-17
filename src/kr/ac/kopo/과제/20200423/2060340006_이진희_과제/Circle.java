ppackage test;

public class Circle extends Figure {
    private int radius;
    private static double PI=3.14;

    public Circle(int radius, double PI){
    	this.radius =radius;
    	this.PI= PI;
    }
    
    @Override
    public void printArea(){
    	System.out.println("반지름"+radius+"의 원의 면적은"+" "+PI*radius*radius+"입니다.");
    }

}

