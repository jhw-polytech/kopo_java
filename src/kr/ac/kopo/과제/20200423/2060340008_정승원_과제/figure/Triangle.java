package kr.ac.kopo.day09.figure;

/**
 * 
 * @author seung
 * 삼각형의 면적을 구하는 클래스
 */

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
    @Override
     void getArea() { // 삼각형의 면적을 계산하여 출력 
    	this.area = (width*height)/2;
    	System.out.printf("밑변 %d 높이 %d의 삼각형의 면적은 %.0f입니다.\n", width, height, this.area);
    }


}
