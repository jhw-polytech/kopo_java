package kr.ac.kopo.day09.figure;
/**
 * 
 * @author seung
 * 직사각형의 면적을 구하는 클래스
 */

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width) { // 하나만 들어오는 경우 둘 다 길이가 같다고 가정한다. 
		this.width = width;
		this.height = width;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
    @Override
     void getArea() { // 직사각형의 면적을 계산하여 출력
    	this.area = width*height;
    	System.out.printf("가로 %d 세로 %d의 직사각형의 면적은 %.0f입니다.\n", width, height, this.area);
    	
    }
}
