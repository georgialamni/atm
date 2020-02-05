package gr.codehub.atm.repository;

public class AccountBalance {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void addToBalance(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void subtractFromBalance(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }
}
