import java.util.Scanner;

public class DepositOption implements MenuOption {
    private Bank bank;
    public DepositOption(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String getDescription() {
        return "Realizar deposito";
    }

    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta:\n");
        String noAccount = entrada.nextLine();
        System.out.println("Ingrese la cantidad a depositar:\n");
        double amount = entrada.nextDouble();
        if (amount > 0.0) {
            bank.depositToAccount(noAccount, amount);
        }
    }
}