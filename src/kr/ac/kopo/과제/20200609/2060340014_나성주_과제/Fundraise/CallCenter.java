package homework.day17.Fundraise;

public class CallCenter {

    private int subtotal;

    /**
     * 전화를 받으면 성금이 모금되는 메소드
     *
     * @param centerNo : 콜센터명 (1번 콜센터 ~ 4번 콜센터)
     * @param waitFlag : 스레드가 마지막에 실행될때는 대기상태로 돌아가지 않게끔 하는 장치
     */

    public synchronized void gotCall(int centerNo, boolean waitFlag) {
        try {
            notify();
            Donation d = new Donation();
            System.out.println(centerNo + "번 콜센터 : " + d.getDonation() + "원을 받았습니다.");
            subtotal += d.getDonation();

            if (waitFlag) {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getSubtotal() {
        return subtotal;
    }

}