package kr.ac.kopo.day17.homework;

public class CallCenter extends Thread {

    private static int donation; // 성금 총액
    private int centerNo; // 콜센터 넘버
    private String ccName; //콜센터 이름
    private CallUtil util;

    // 생성자
    public CallCenter(int centerNo) {
        this.centerNo = centerNo;
        ccName = centerNo + "번 콜센터";
        util = new CallUtil();
    }

    public static int getDonation() {
        return donation;
    }

    public static void setDonation(int donation) {
        CallCenter.donation = donation;
    }

    @Override
    public synchronized void run() {

        try {
            for (int i = 0; i < 10; i++) {
                util.callForDonation(ccName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}