package Assignment08;

public class Triangle extends Figure {
    private int width;
    private int heigth;

    public Triangle(int width, int heigth){
    	this.width=width;
    	this.heigth=heigth;
    }

    public Triangle(){
    }

    public void print(){
    	System.out.println("가로 "+width+"세로 "+heigth +"삼각형의 넓이는 "+((width*heigth)/2));
    }

}
