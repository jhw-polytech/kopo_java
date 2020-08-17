package homework0423;

import java.util.Random;

/*
	형재씨... Figure를 상속받은 클래스를 이용하여 객체 만들때
	Circle c = new Circle() 이렇게 코드를 작성하면
	Circle클래스에 생성자가 없으니깐 default 생성자가 만들어지겠죠???

	Circle() {

	}
	이렇게요... 그러면 Circle() 생성자는 보이지 않으면 super()가 생략되어있을거에요

	Circle() {
		super();
	}

	그러면 super()는 Figuer();를 호출하겠죠.
	형재씨는 width, legth, height, diameter를 설정하는 변수가 Figuare()에 있지 않고 Figure(int)형에 있어요
	그래서 width, legth, height, diameter는 Random값을 못받아요. 따라서 기본초기값 0을 가지고 있어서 결과가 0으로 나오는겁니다
	이해가세요??? ^^
*/

public class Figuare {
	protected 	int 	width;
	protected	int		length;
	protected	int		height;
	protected	int 	diameter;
	protected	double 	pi = 3.14159;
	
	Random r = new Random();
	Figuare(){
		
	}
	Figuare(int answer){
		if(answer>= 1 && answer <=4) {
			width = r.nextInt(8)+2;
			length = r.nextInt(8)+2;
			height = r.nextInt(8)+2;
			diameter = r.nextInt(8)+2;
		}else {
			System.out.println("잘못된 입력");	
		}
	}
	public void choose(int answer) {
		if(answer==1) {
			System.out.println("직사각형을 선택하셨군요!!");
			System.out.printf("임의의 가로 : %d, 임의의 세로 : %d\n" , width, length);
		}else if(answer==2) {
			System.out.println("정사각형을 선택하셨군요!!");
			System.out.printf("임의의 가로 : %d, 임의의 세로 : %d\n" , width, width);
		}else if(answer==3) {
			System.out.println("삼각형을 선택하셨군요!!");
			System.out.printf("임의의 밑변 : %d, 임의의 높이 : %d\n" , width, height);
		}else if(answer==4){
			System.out.println("원을 선택하셨군요!!");
			System.out.printf("임의의 반지름 : %d\n" , diameter);
		}else {
			System.out.println("1번~4번에 해당하는 도형을 입력하세요.");
		}
	}
}