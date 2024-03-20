import java.util.ArrayList;

public class BankLoan {
    private final  ArrayList<Loan> loanList;
    private  ArrayList<CreditCard> creditCardList;
    public BankLoan() {
        this.loanList = new ArrayList<>();
        this.creditCardList = new ArrayList<>();
    }

    public void addLoan(Loan loan) {
        if (loan != null) {

           loanList.add(loan);
        } else {
            System.out.println("No se puede agregar la solicitud del prestamo.");
        }
    }

    public ArrayList<Loan> getLoanList() {
        return loanList;
    }


    public void payLoan(String account, double amount) {
        if (getLoanList().isEmpty()){
            System.out.println("Esta vacio");
        }
        for (Loan loan : loanList) {
            //System.out.println("numero de prestamos "+ loan.getNoPrestamo());
            if (loan.getNoPrestamo().equals(account)) {
                if (loan.getAmount() >= amount) {
                    loan.setAmount(loan.getAmount() - amount);
                    System.out.println("Se ha pagado $" + amount + " de la cuenta " + account + ".");
                    System.out.println("Su Saldo Actual: "+ loan.getAmount());
                } else {
                    System.out.println("La cuenta " + account + " no tiene saldo suficiente para pagar $" + amount + ".");
                }
                return;
            }
        }
        System.out.println("La cuenta " + account + " no tiene préstamos pendientes.");
    }

    public void requestCreditCard(String accountNumber, double creditLimit, Bank bk) {

        ArrayList<Customer> List = bk.getCustomerList();
        boolean accountExists = false;
        for (Customer customer : List) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    accountExists = true;
                    System.out.println(" El cliente: " + customer.getName() + " " + customer.getLastName());
                    break;
                }
            }
            if (accountExists) {
                CreditCard creditCard = new CreditCard(accountNumber, creditLimit);
                creditCardList.add(creditCard);
                System.out.println(" ha solicitado una tarjeta de crédito para la cuenta " + accountNumber +
                        " con un límite de crédito de $" + creditLimit + ".");
            } else {
                System.out.println("La cuenta " + accountNumber + " no existe.");
            }
        }
    }



}
