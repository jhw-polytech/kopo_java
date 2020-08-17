package kr.ac.kopo.day08.project.figure;

// 정사각형
public class Square extends Calculator{
    @Override
    public void calculate(int a, int b) {
        System.out.printf("가로 %d 세로 %d의 정사각형의 면적은 %d입니다.\n", a, b, a*b);
    }
}
