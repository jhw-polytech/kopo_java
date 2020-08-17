package homework.day17.GroupAccount;

class DepositThread extends Thread {

    private AccountUser accountUser;

    public DepositThread(AccountUser accountUser) {
        this.accountUser = accountUser;
    }

    Transaction tr = new Transaction();

    @Override
    public void run() {

        for (int i = 0; i < ThreadIteration.ITERATION_CNT; i++) {

            tr.deposit(accountUser.getName(), accountUser.getGroupAccount());
        }
    }


}
