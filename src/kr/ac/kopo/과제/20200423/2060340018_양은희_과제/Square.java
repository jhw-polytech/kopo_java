package Homework0423;

	/* 교수님 질문이 있습니다!
	 이렇게 Rectangle을 상속받으면 Square의 메소드가 2번 호출이 됩니다.
	 왜그런걸까요? ㅠㅠ
	  ==> 
	  	Square 클래스가 Rectangle을 상속받으면
		  new Square() 할때 super()에 의해서 Rectangle() 생성자도 호출되져
		  근데 Squre, Rectangle에 다 print(); 호출부분이 있으니 2번 출력되는 겁니다.
	 */

import java.util.Random;

public class Square extends Rectangle{
	private int width;

	public Square() {
		print();
	}

	@Override
	public void print() {
		Random random = new Random();

		width = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 수 : " + width);
		System.out.print("가로 : " + width + "의 정사각형 면적은 " + width * width + "입니다");
		
	}

}
