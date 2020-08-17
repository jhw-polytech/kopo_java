package homework.day17.GroupAccount;

class GroupAccount {
    private String name;
    private int money;

    public GroupAccount(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public  String getName() {
        return name;
    }

    public  int getMoney() {
        return money;
    }

    public  void setMoney(int money) {
        this.money = money;
    }
}
