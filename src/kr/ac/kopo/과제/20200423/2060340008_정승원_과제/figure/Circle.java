package kr.ac.kopo.day09.figure;
/**
 * 
 * @author seung
 * 원의 면적을 구하는 클래스 
 */
public class Circle extends Shape{
    final static double PI = Math.PI; // 상수
    private int radius;
    
    public Circle() {
    	
    }
    
    public Circle(int radius) {
    	this.radius = radius;
    }
    
    @Override
    void getArea() { // 원형의 면적을 계산하여 출력
        System.out.printf("반지름 %d의 원의 면적은 %.2f입니다.\n", radius, Math.pow(radius, 2) * PI);
    }
}
