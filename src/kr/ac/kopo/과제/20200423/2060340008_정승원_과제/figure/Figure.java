package kr.ac.kopo.day09.figure;


import java.util.Random;
import java.util.Scanner;

public class Figure {

    static Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();

    public static int randomNumber() {
        return random.nextInt(11) + 2;
    }

    public static void execute() {}

}