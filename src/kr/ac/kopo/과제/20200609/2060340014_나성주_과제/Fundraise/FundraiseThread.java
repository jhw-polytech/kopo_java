package homework.day17.Fundraise;

class FundraiseThread extends Thread {

    private CallCenter callCenter;
    private int centerNo = 0;
    private int total;

    public FundraiseThread(int centerNo, CallCenter callCenter) {
        this.callCenter = callCenter;
        this.centerNo = centerNo;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                callCenter.gotCall(centerNo, i < 9);
            }
        }
        System.out.println(centerNo + "번 콜센터 총 모금액: " + callCenter.getSubtotal() + "원");
        total += callCenter.getSubtotal();
    }


    public int getTotal() {
        return total;
    }
}

