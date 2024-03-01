public class CreditCard {
    private String accountNumber;
    private double creditLimit;
    private double balance;

    public CreditCard(String accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.balance = 0; // Saldo inicial en la tarjeta de crédito
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
