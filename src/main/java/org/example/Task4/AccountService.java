package org.example.Task4;

interface AccountService {
    Account findAccountByOwnerId(long l);

    long countAccountsWithBalanceGreaterThan(long l);
}
