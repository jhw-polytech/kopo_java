package kr.ac.kopo.day09.figure;

/**
 * 
 * @author seung
 * 정사각형의 면적을 구하는 클래스 
 */

public class Square extends Rectangle{ // Rectangle을 상속한다. 
	private int width;
	private int height;
	
	public Square() {
		
	}
	
	public Square(int width) { 
		this.width = width;
		this.height = width;
	}
	
	@Override
    void getArea() { // 정사각형의 면적을 계산하여 출력
		this.area = width*height;
        System.out.printf("가로 %d 세로 %d의 정사각형의 면적은 %.0f입니다.\n", width, height, this.area);
    }
}
