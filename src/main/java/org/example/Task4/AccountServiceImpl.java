package org.example.Task4;


class AccountServiceImpl implements AccountService {
    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    public long countAccountsWithBalanceGreaterThan(long value) {
        int count = 0;

        for(int i = 0; i < accounts.length; ++i) {
            if (accounts[i].getBalance() > value) {
                ++count;
            }
        }
        return (long)count;
    }

    public Account findAccountByOwnerId(long id) {
        for(int i = 0; i < accounts.length; ++i) {
            if (accounts[i].getId() == id) {
                System.out.println("Tested");
                return accounts[i];
            }
        }
        return null;
    }
}
