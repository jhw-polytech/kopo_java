package homework.day08;

/*
 * 정해진 것 없이 자유롭게 만들기!
 도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 1
 직사각형 선택시
 Random하게 2 ~ 10사이의 정수 2개를 추출
 가로 3, 세로 2의 직사각형 면적은 6입니다

 도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 2
 정사각형 선택시
 Random하게 2 ~ 10사이의 정수 1개를 추출
 가로 5의 정사각형 변적은 25입니다
 */

public class FigureMain {

    // 메인 클래스

    public static void main(String[] args) {
        FigureResult f = new FigureResult();

        int n = f.selectFigure(); // n = 1.직사각형, 2. 정사각형, 3.삼각형, 4.원
        f.areaOutput(n);
    }
}
