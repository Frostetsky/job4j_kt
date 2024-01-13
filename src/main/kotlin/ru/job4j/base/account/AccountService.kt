package ru.job4j.base.account

class AccountService {

    fun getAccountsByPredicate(accounts: List<Account>,
                               vararg predicates: (Account) -> Boolean): List<Account> {
        return accounts.filter { account -> predicates.all { it(account) } }
    }
}