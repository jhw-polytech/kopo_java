package kr.ac.kopo.day08.project.figure;

// 삼각형
public class Triangle extends Calculator{
    @Override
    public void calculate(int a, int b) {
        System.out.printf("밑변 %d 높이 %d의 삼각형의 면적은 %.0f입니다.\n", a, b, (double) (a*b)/2);
    }
}
