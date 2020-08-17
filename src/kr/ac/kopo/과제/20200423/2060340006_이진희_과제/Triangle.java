package test;

public class Triangle extends Figure {
 
	private int width;
    private int height;

    public Triangle(int width, int height){
    	this.width=width;
    	this.height=height;
    }

    @Override
    public void printArea(){
    	System.out.printf("밑변 %d, 높이 %d인 삼각형의 면적은  %d", width, height, width * height);
    }

}

