package homework.day08;

public class FigureArea extends RandomNum {

    // 도형의 면적을 계산하는 클래스

    private int    rectangleArea;  // 직사각형 면적
    private int    squareArea;     // 정사각형 면적
    private double triangleArea;   // 삼각형 면적
    private double circleArea;     // 원 면적
    private int    a, b;           // 랜덤 정수 2개

    // 난수 1 생성
    public int getA() {
        this.a = getRandInt();
        return a;
    }

    // 난수 2 생성
    public int getB() {
        this.b = getRandInt();
        return b;
    }

    // 직사각형 넓이 계산
    public int getRectangleArea() {
        rectangleArea = a*b;
        return rectangleArea;
    }

    // 정사각형 넓이 계산
    public int getSquareArea() {
        squareArea = (int) Math.pow(a, 2);
        return squareArea;
    }

    // 삼각형 넓이 계산
    public double getTriangleArea() {
        triangleArea = a*b/2;
        return triangleArea;
    }

    // 원 넓이 계산
    public double getCircleArea() {
        circleArea = (Math.PI * Math.pow(a,2));
        return circleArea;
    }
}