package homework10;

import java.util.Random;

public class Rectangle extends Shape {
	private int width;
	private int height;
	private int ipt;
	
	Rectangle(){}
	Rectangle(int width, int height,int ipt){
		this.width=width;
		this.height=height;
		this.ipt=ipt;
	}
	
	@Override
	public void calarea(int ipt) {
		if(ipt==1) {
			Random ran = new Random();
			width = (ran.nextInt(9)+2);
			height = (ran.nextInt(9)+2);
			System.out.println("가로 "+width+", 세로 "+height+"의 직사각형 면적은 "+(width*height)+"입니다.");
		}
		else {
			Square sq = new Square();
			sq.calarea(ipt);
		}
	}
}
