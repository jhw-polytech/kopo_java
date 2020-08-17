package homework.day17.GroupAccount;

import java.util.Random;

class TransactionAmount {
//    private int withdrawAmount;
//    private int depositAmount;
    Random r = new Random();

    private int randAmount = (r.nextInt(10) + 1) * 1000;

    public  int getWithdrawAmount() {
        return randAmount;
    }

    public  int getDepositAmount() {
        return randAmount;
    }
}
