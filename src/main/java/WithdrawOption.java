import java.util.Scanner;

public class WithdrawOption implements MenuOption {
    private Bank bank;

    public WithdrawOption(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String getDescription() {
        return "Realizar retiro";
    }

    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta:\n");
        String noAcc = entrada.nextLine();
        System.out.println("Ingrese la cantidad a retirar:\n");
        double remove = entrada.nextDouble();
        if (remove > 0.0) {
            bank.withdrawFromAccount(noAcc, remove);
        }
    }
}