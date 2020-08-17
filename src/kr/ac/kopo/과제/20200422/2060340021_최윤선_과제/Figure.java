package homework09;

import java.util.*;

public class Figure {
	Scanner sc = new Scanner(System.in);
	Random r   = new Random();
	
	private int choose;
	private int width;  // 가로 , 폭
	private int height; // 세로, 높이
	private int rad;    // 반지름
	private int result; // 결과값. 도형의 넓이
	
	Figure(){}
	Figure(int choose, int width, int height, int rad, int result){
		this.choose=choose;
		this.width=width;
		this.height=height;
		this.rad=rad;
		this.result=result;
	}
	
	
	public void figure_main() {
		choose=choose();
		make(choose);
	}
	
	public int choose() {
		System.out.println("도형을 선택하세요. 1: 직사각형, 2: 정사각형, 3: 삼각형, 4:원");
		choose = sc.nextInt();
		sc.hasNextLine();
		return choose;
	}
	
	public void make(int choose){
		if(choose==1) {
			width=(r.nextInt(9)+2);
			height=(r.nextInt(9)+2);
			System.out.println("가로 "+width+", 세로 "+height+"의 직사각형 면적은 "+(width*height)+"입니다.");
		}
		else if (choose==2) {
			width=(r.nextInt(9)+2);
			System.out.println("한변의 길이가 "+width+" 인 정사각형의 면적은"+ (width*width)+"입니다.");
		}
		else if(choose ==3) {
			width=(r.nextInt(9)+2);
			height=(r.nextInt(9)+2);
			System.out.println("밑변 "+width+", 높이 "+height+"의 삼각형 면적은 "+((double)width*height/2)+"입니다.");
		}
		else {
			rad=(r.nextInt(9)+2);
			System.out.println("반지름의 길이가 "+rad+" 인 원의 면적은"+ (3.141592*rad*rad)+"입니다.");
		}
	}

}
