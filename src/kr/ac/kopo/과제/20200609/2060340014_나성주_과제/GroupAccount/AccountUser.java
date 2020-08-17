package homework.day17.GroupAccount;

class AccountUser {
    private String name;
    private GroupAccount groupAccount;

    public AccountUser(String name, GroupAccount groupAccount) {
        this.name = name;
        this.groupAccount = groupAccount;
    }

    public  String getName() {
        return name;
    }

    public GroupAccount getGroupAccount() {
        return groupAccount;
    }
}
