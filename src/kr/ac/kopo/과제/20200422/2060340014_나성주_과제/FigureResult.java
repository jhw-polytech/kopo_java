package homework.day08;

// 상속 관계: FigureResult -> FigureArea -> RandomNum
// 뭔가 의미론적으로는 필요없는 상속관계로 보이지만 상속을 한번 사용해보며 활용법을 익힌다는 것에 의의를 두었다.

import java.util.Scanner;

public class FigureResult extends FigureArea{

    // 입출력을 담당하는 클래스
    private int n;  // 사용자가 선택한 숫자(=도형)
    Scanner sc = new Scanner(System.in);

    public int selectFigure() {

        System.out.print("도형을 선택하세요. (1.직사각형, 2.정사각형, 3.삼각형, 4.원) : ");
        n = sc.nextInt();
        if (n<1 || n>4) {
            System.out.println("잘못된 숫자입니다.");
            selectFigure();
        } else {
            this.n = n;
        }
        return n;
    }

//    public void figureResult() {
//        areaOutput(selectFigure());
//    }


    public void areaOutput(int n) {

        if (n == 1) {
            System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %d입니다\n",getA(),getB(),getRectangleArea());
        } else if (n == 2) {
            System.out.printf("가로 %d의 정사각형 면적은 %d입니다.\n", getA(), getSquareArea());
        } else if (n == 3) {
            System.out.printf("밑변 %d, 높이 %d의 삼각형 면적은 %.2f입니다.\n",getA(),getB(),getTriangleArea());
        } else if (n == 4) {
            System.out.printf("반지름 %d의 원 면적은 %.2f입니다.\n",getA(),getCircleArea());
        }
    }




}
