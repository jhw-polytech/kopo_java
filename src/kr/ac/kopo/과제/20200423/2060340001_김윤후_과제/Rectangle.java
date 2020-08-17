package Assignment08;

public class Rectangle extends Figure {
    public int width;
    private int heigth;


    public Rectangle() {
    	
    }
    
    public Rectangle(int width, int heigth){
    
    	this.width=width;
    	this.heigth=heigth;
    
    }

    @Override
    public void print(){
    	System.out.println("가로 "+width+"세로 "+ heigth +"직사각형의 넓이는 "+(width*heigth));
    }

}
