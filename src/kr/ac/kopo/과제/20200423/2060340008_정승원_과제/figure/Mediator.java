package kr.ac.kopo.day09.figure;

/**
 * 
 * @author seung
 * 랜덤으로 정수를 추출하여 면적을 구하는 클래스들을 사용자 입력을 받아 실행시키는 중재자 클래스
 */

public class Mediator extends Figure{

    public static void execute() {
    	System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");
        int type = Integer.parseInt(sc.nextLine()); 

        Shape shape = null; // 부모 선언
        switch (type) {
            case 1:
            	System.out.println("Random하게 2~10사이의 정수 2개를 추출");
            	shape = new Rectangle(randomNumber(), randomNumber());
                break;
            case 2:
            	System.out.println("Random하게 2~10사이의 정수 2개를 추출");
            	shape = new Square(randomNumber());
            	break;
            case 3:
            	System.out.println("Random하게 2~10사이의 정수 2개를 추출");
            	shape = new Triangle(randomNumber(), randomNumber());
            	break;
            case 4:
            	System.out.println("Random하게 2~10사이의 정수 1개를 추출");
            	shape = new Circle(randomNumber());
            	break;
            default:
            	System.out.println("잘못된 입력입니다.");
        }
        shape.getArea(); // 면적결과를 출력한다.
    }
}
