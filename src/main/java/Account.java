public class Account {
    private  String accountType;
    private String accountNumber;
    private double amount;

    public Account(String accountType, String accountNumber, double amount) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public  Account(){}

    // Método para obtener el número de cuenta
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
