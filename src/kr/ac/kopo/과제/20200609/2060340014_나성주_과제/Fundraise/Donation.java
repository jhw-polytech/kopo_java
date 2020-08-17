package homework.day17.Fundraise;

import java.util.Random;

public class Donation {

    private int donation; // 기부금 (랜덤 설정)
    Random r = new Random();

    public int getDonation() {
        donation = (r.nextInt(10)+1)*1000;
        return donation;
    }
}
