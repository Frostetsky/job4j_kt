package ru.job4j.base.account

class AccountService {

    fun getAccountsByPredicate(accounts: List<Account>,
                               predicate: (Account) -> Boolean): List<Account> = accounts.filter(predicate)

}