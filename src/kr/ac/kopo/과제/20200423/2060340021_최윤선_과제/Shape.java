package homework10;

import java.util.Scanner;

abstract public class Shape {
//public class Shape {

	
	private int area;
	private int ipt;
	Shape(){}
	Shape(int area, int ipt){
		this.area=area;
		this.ipt=ipt;
	}
	
	
	abstract void calarea(int ipt);
	
	public void generate(){
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원)");
		ipt=sc.nextInt();
		sc.hasNextLine();
		if (  (ipt == 1) || (ipt==2)   ) {
			Rectangle r = new Rectangle();
			r.calarea(ipt);
		}
		if (ipt==3) {
			Triangle t = new Triangle();
			t.calarea(ipt);
		}
		if(ipt==4) {
			Circle c = new Circle();
			c.calarea(ipt);
		}
	}

}
