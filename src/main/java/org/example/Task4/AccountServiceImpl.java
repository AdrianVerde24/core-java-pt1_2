package org.example.Task4;


class AccountServiceImpl implements AccountService {
    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    public long countAccountsWithBalanceGreaterThan(long value) {
        int count = 0;

        for(int i = 0; i < this.accounts.length; ++i) {
            if (this.accounts[i].getBalance() > value) {
                ++count;
            }
        }

        return (long)count;
    }

    public Account findAccountByOwnerId(long id) {
        for(int i = 0; i < this.accounts.length - 1; ++i) {
            if (this.accounts[i].getOwner().getId() == id) {
                return this.accounts[i];
            }
        }

        return null;
    }
}
