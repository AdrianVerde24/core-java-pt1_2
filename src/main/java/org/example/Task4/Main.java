package org.example.Task4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[0];
        AccountService service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(10L);
    }
}
