package homework.day08;

import java.util.Random;

public class RandomNum {

    // 2~10 까지의 난수를 생성하는 클래스

    private int RandInt;

    public int getRandInt () {
        Random r = new Random();
        RandInt = r.nextInt(9)+2;

        return RandInt;
    }
}
