package org.example.Task4;

public class Main {

    public static void main(String[] args) {
        User usr1 = new User(106, "Kangaroo", "Jack");
        User usr2 = new User(107, "Test", "Rob");
        Account Acc1 = new Account(17L,780000,usr1);
        Account Acc2 = new Account(18L,800000,usr2);
        Account[] accounts = {Acc1,Acc2};
        AccountService service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(18L);
    }
}
