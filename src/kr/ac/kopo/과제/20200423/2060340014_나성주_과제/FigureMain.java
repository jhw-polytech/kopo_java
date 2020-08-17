package homework.day09;

// 뭔가 꾸역꾸역 결과값이 잘 나오게끔 만들긴했는데,
// 아직 한참은 부족한 것 같습니다... 되게 엉성하게 코딩한데다가, 왜 필요한지도 모르고 만든 메소드와 생성자들이 좀 있습니다..
// 주말동안 상속, 생성자, abstract에 대한 개념정리를 제대로 한 뒤에 한번 더 정리해보려합니다...

import java.util.Random;
import java.util.Scanner;

public class FigureMain {
    public static void main(String[] args) {
        Random r = new Random();
        int rNum = r.nextInt(9) + 2;
        int rNum2 = r.nextInt(9) + 2;
        Scanner sc = new Scanner(System.in);


        System.out.print("도형을 선택하세요. (1.직사각형, 2.정사각형, 3.삼각형, 4.원) : ");
        int n = sc.nextInt();

        if (n == 1) {
            Rectangle re = new Rectangle(rNum, rNum2);
            re.info();
        } else if (n == 2) {
            Square sq = new Square(rNum);
            sq.info();
        } else if (n == 3) {
            Triangle tr = new Triangle(rNum, rNum2);
            tr.info();
        } else if (n == 4) {
            Circle ci = new Circle(rNum);
            ci.info();
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
