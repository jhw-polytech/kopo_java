package homework.day17.GroupAccount;

class Transaction {

    private int withdrawAmount; // 출금액
    private int depositAmount;  // 입금액
    private int balance;        // 잔액

    // 각 메소드마다 syncronized를 걸어줬는데 왜 메소드 내 코드들을 다 한꺼번에 다 수행하지 않고 조각조각 나눠져서 각각 다른 시간대에 수행하는지 모르겠습니다....
    // 1번 문장과 2번 문장이 한번에 실행됐으면 좋겠는데, 1번 나왔다가 다른 스레드에서 또 1번을 실행하고 그 다음 2번이 실행되고 이런 식입니다...
    // 제가 모르는 부분에 대한 설명이 많이 부족한 것 같은데 수업때 여쭤보고 싶습니다...!

    public synchronized void withdraw(String name, GroupAccount groupAccount) {

            TransactionAmount ta = new TransactionAmount();
            withdrawAmount = ta.getWithdrawAmount();
            System.out.println("[" + name + "]고객님이 " + withdrawAmount + "원을 출금하셨습니다."); //1번 문장

            if (withdrawAmount > groupAccount.getMoney()) {
                System.out.println("출금금액 :" + withdrawAmount + "원 => 잔액이 부족하여 출금을 할 수 없습니다. 현재 잔액 : " + groupAccount.getMoney()); //2번 문장
            } else {
                balance = groupAccount.getMoney() - withdrawAmount;
                groupAccount.setMoney(balance);
                System.out.println("현재 잔액은 " + balance + "원입니다."); //3번 문장이라 하면
            }
    }

    public synchronized void deposit(String name, GroupAccount groupAccount) {

        try {
            TransactionAmount ta = new TransactionAmount();
            depositAmount = ta.getDepositAmount();
            System.out.println("[" + name + "]고객님이 " + depositAmount + "원을 입금하셨습니다.");

            balance = groupAccount.getMoney()+depositAmount;

            groupAccount.setMoney(balance);
            System.out.println("현재 잔액은 " + balance +"원 입니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
