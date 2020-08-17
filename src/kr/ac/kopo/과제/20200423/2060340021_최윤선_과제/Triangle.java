package homework10;

import java.util.Random;

public class Triangle extends Shape {
	private int width;
	private int height;
	private int ipt;
	
	Triangle(){}
	Triangle(int width, int height, int ipt){
		this.width=width;
		this.height=height;
		this.ipt=ipt;
	}
	
	@Override
	public void calarea(int ipt) {
		Random ran = new Random();
		width = (ran.nextInt(9)+2);
		height = (ran.nextInt(9)+2);
		
		System.out.println("가로 "+width+", 세로 "+height+"의 삼각형 면적은 "+((double)width*height/2)+"입니다.");
	}

}
