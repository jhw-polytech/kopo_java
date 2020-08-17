package homework10;

import java.util.Random;

public class Square  extends Rectangle {
	private int height;
	private int ipt;
	
	Square(){}
	Square(int height, int ipt){
		this.height=height;
		this.ipt=ipt;
	}
	
	
	@Override
	public void calarea(int ipt) {
		Random ran = new Random();
		height = (ran.nextInt(9)+2);
		
		System.out.println("한 변의 길이가 "+height+"인 정사각형 면적은 "+(height*height)+"입니다.");
	}
}
