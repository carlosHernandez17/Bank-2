import java.util.Scanner;

public class CheckBalanceOption implements  MenuOption{
    Scanner entrada = new Scanner(System.in);
    private Bank bank;
    public CheckBalanceOption(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String getDescription() {
        return "Consultar saldo";
    }

    @Override
    public void execute() {
        System.out.println("Ingrese el numero de cuenta:\n");
        String number = entrada.nextLine();
        bank.showBalance(number);
    }
}
