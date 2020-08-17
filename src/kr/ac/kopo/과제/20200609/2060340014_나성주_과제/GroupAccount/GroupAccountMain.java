package homework.day17.GroupAccount;


public class GroupAccountMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(">모임통장 거래 시작...");


        GroupAccount ga = new GroupAccount("홍길동", 10000);
        System.out.println(">현재 잔액: " + ga.getMoney()+"원\n");
        AccountUser u1 = new AccountUser("홍길동", ga);
        AccountUser u2 = new AccountUser("어머니", ga);
        AccountUser u3 = new AccountUser("아버지", ga);

        WithdrawThread wt1 = new WithdrawThread(u1);
        WithdrawThread wt2 = new WithdrawThread(u2);
        WithdrawThread wt3 = new WithdrawThread(u3);
        DepositThread dt1 = new DepositThread(u1);
        DepositThread dt2 = new DepositThread(u2);
        DepositThread dt3 = new DepositThread(u3);


        wt1.start();
        wt2.start();
        wt3.start();
        dt1.start();
        dt2.start();
        dt3.start();

        wt1.join();
        wt2.join();
        wt3.join();
        dt1.join();
        dt2.join();
        dt3.join();

        System.out.println("\n>모임통장 거래 종료...");

        System.out.println(">최종 잔액: " +ga.getMoney() +"원");
    }
}








//
//class TransactionThread extends Thread {
//
//    private User user;
////    private Transaction transaction = null;
//
//    public TransactionThread(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public void run() {
//
//        for (int i = 0; i < IterationCnt.ITERATION_CNT; i++) {
//            Transaction tr = new Transaction();
//            tr.withdraw(user.getName(), user.getAccount());
//        }
//    }
//
//
//}
