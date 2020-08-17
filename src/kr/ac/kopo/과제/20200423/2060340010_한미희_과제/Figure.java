package kr.ac.kopo.day9.assignment;

import java.util.Random;

public abstract class Figure {
	//추상클래스
	
	//멤버변수
	private double area;	//면적
	protected Random r;
	
	//기본생성자
	public Figure(){
		r = new Random();
	}
	
	//getter
	public double getArea() {
		return area;
	}
	
	//setter
	public void setArea(double area) {
		this.area = area;
	}
	
	//면적 계산을 위한 추상메소드
	public abstract void calculateArea();
	//도형을 구할 때 필요한 길이의 개수가 달라서 계속 고민하다가 클래스 다이어그램을 짰는데,
	//코드를 작성하다보니 매개변수가 없는 게 맞다고 생각해서 코드에서 수정했습니다.

}
