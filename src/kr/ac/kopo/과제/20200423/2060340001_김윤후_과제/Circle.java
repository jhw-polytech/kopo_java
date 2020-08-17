package Assignment08;

public class Circle extends Figure {
    private int radius;
    private double pi=3.14;
    
    public Circle(int radius){
    	this.radius=radius;
    }

    public Circle(){
    }

    public void print(){
    	System.out.println("반지름 "+radius +" 원의 넓이는 "+((radius*radius)*pi));
    }

}
