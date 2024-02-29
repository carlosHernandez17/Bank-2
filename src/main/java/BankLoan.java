import java.util.ArrayList;

public class BankLoan {
    private final  ArrayList<Loan> loanList;

    public BankLoan() {
        this.loanList = new ArrayList<>();;
    }

    public void addLoan(Loan loan) {
        if (loan != null) {
            //System.out.println("Agregando cliente: " + customer.getName());
            loanList.add(loan);
        } else {
            System.out.println("No se puede agregar la solicitud del prestamo.");
        }
    }

    private ArrayList<Loan> getLoanList() {
        return loanList;
    }



}
