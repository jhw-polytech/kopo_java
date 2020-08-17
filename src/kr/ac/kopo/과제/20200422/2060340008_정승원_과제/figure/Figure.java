package kr.ac.kopo.day08.project.figure;


import java.util.Random;
import java.util.Scanner;

// 도형들 상속해서 하기
// 최상위 클래스
public class Figure {

    static Scanner sc;
    private static final Random random = new Random();

    public static int randomNumber() {
        return random.nextInt(11) + 2;
    }

    public static void excute() {}

}