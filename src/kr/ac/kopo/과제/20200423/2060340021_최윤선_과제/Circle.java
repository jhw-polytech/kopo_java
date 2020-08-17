package homework10;

import java.util.Random;

public class Circle extends Shape {
	private int rad; // 반지름
	private int ipt;
	
	Circle(){}
	Circle(int rad, int ipt){
		this.rad=rad;
		this.ipt=ipt;
	}
	
	@Override
	public void calarea(int ipt) {
		Random ran = new Random();
		rad = (ran.nextInt(9)+2);
		
		System.out.println("반지름이 "+rad+"인 원 면적은 "+(rad*rad*3.141592)+"입니다.");
	}
}
