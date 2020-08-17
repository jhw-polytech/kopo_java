package kr.ac.kopo.day08.project.figure;

public class Circle extends Calculator{
    final static double PI = Math.PI;

    @Override
    public void calculate(int a) {
        System.out.printf("반지름 %d의 원의 면적은 %.2f입니다.\n", a, Math.pow(a, 2) * PI);
    }
}
