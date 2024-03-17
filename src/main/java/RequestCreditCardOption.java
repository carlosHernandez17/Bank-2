import java.util.Scanner;

public class RequestCreditCardOption implements MenuOption {

    private BankLoan bankLoan;
    private Bank bank;

    public RequestCreditCardOption(BankLoan bankLoan, Bank bank) {
        this.bankLoan = bankLoan;
        this.bank = bank;
    }

    @Override
    public String getDescription() {
        return "Solicitar tarjeta de credito";
    }

    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta:\n");
        String noAcca = entrada.nextLine();
        System.out.println("Cual sera el limite de la tarjeta de credito? :\n");
        double limit = entrada.nextDouble();
        bankLoan.requestCreditCard(noAcca, limit, bank);
    }
}
