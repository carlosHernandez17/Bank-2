import java.util.Scanner;

public class PayLoanOption implements MenuOption {
    private BankLoan bankLoan;

    public PayLoanOption(BankLoan bankLoan) {
        this.bankLoan = bankLoan;
    }

    @Override
    public String getDescription() {
        return "Realizar pago de prestamo";
    }

    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese No. del prestamos:\n");
        String numberLoad = entrada.nextLine();
        System.out.println("Ingrese el monto a pagar del prestamo :\n");
        double amount = entrada.nextDouble();
        bankLoan.payLoan(numberLoad, amount);
    }
}