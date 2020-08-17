package homework.day17.GroupAccount;

class WithdrawThread extends Thread {

    private AccountUser accountUser;
    public WithdrawThread(AccountUser accountUser) {
        this.accountUser = accountUser;
    }

    Transaction tr = new Transaction();

    @Override
    public void run() {

        for (int i = 0; i < ThreadIteration.ITERATION_CNT; i++) {

                tr.withdraw(accountUser.getName(), accountUser.getGroupAccount());

        }
    }

}
