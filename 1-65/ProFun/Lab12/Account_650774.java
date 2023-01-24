class Account_650774 {
    int id;
    String name;
    int balance = 0;

    Account_650774(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    int credit(int amount) {
        if (amount < 0) return balance;
        this.balance += amount;
        return balance;
    }

    int debit(int amount) {
        if (amount < 0) return balance;
        if (this.balance >= amount) this.balance -= amount;
        return balance;
    }

    int transferTo(Account_650774 acct, int amount) {
        if (balance >= amount) {
            acct.balance += amount;
            this.balance -= amount;
        }
        return balance;
    }

    public String toString() {
        return String.format("Account %s(%d) balance is %d", name, id, balance);
    }
}