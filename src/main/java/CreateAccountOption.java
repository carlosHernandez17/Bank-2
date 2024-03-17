import java.util.Scanner;

public class CreateAccountOption implements MenuOption {
    private Administrator administrator;
    public CreateAccountOption(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public String getDescription() {
        return "Crear nueva cuenta";
    }

    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione el tipo de cuenta:\n");
        System.out.println("1.- Cuenta de Ahorro");
        System.out.println("2.- Cuenta Corriente");
        int optionMenu = entrada.nextInt();
        if (optionMenu == 1) {
            administrator.registerCustomer("Ahorro");
        } else if (optionMenu == 2) {
            administrator.registerCustomer("Corriente");
        }
    }
}
