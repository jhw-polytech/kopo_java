package kr.ac.kopo.day08.project.figure;

import java.util.Scanner;

/**
 * 입력을 판단해서 거기에 맞는 클래스를 사용해주는 중개자 클래스
 */

public class Mediator extends Figure{

    public static void excute() {
        sc = new Scanner(System.in);
        System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");
        int type = Integer.parseInt(sc.nextLine()); // 사용자로부터 입력을 받는다.

        switch (type) {
            case 1:
                Rectangle rectangle = new Rectangle();
                System.out.println("Random하게 2~10사이의 정수 2개를 추출");
                rectangle.calculate(randomNumber(), randomNumber());
                break;
            case 2:
                Square square = new Square();
                System.out.println("Random하게 2~10사이의 정수 2개를 추출");
                square.calculate(randomNumber(), randomNumber());
                break;
            case 3:
                Triangle triangle = new Triangle();
                System.out.println("Random하게 2~10사이의 정수 2개를 추출");
                triangle.calculate(randomNumber(), randomNumber());
                break;
            case 4:
                Circle circle = new Circle();
                System.out.println("Random하게 2~10사이의 정수 1개를 추출");
                circle.calculate(randomNumber());
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
