package ru.job4j.base.bank

class BankService {

    private val users = HashMap<User, List<AccountBank>>()

    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }

    fun findByRequisite(passport: String, requisite: String): AccountBank? {
        val user = findByPassport(passport)
        return users[user]?.stream()
            ?.filter{ account -> account.requisite == requisite}
            ?.findFirst()
            ?.orElse(null)
    }

    fun addAccount(passport: String, accountBank: AccountBank) {
        val user = findByPassport(passport)
        users[user]?.plus(accountBank)
    }


    fun findByPassport(passport: String): User? {
        for (user in users.keys) {
            if (user.passport == passport) {
                return user;
            }
        }
        return null;
    }

    fun transferMoney(srcPassport: String, srcRequisite: String,
                      destPassport: String, descRequisite: String,
                      amount: Double): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
        val rsl = source != null && dest != null
        if (rsl) {
            source?.downBalance(amount)
            dest?.upBalance(amount)
        }
        return rsl;
    }
}

fun main() {
    val bank = BankService();
    bank.addUser(User("321", "Petr Arsentev"));
    var user = bank.findByPassport("3211")
    println(user?.name)
    user = bank.findByPassport("321");
    println(user?.name);
}