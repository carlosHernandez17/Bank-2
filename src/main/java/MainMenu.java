import java.util.Scanner;

public class MainMenu {
    private final MenuOption[] options;
    private final Administrator administrator;
    private final Bank bank;
    private final BankLoan bankLoan;
    private final ApplyforLoan applyforLoan; // Asegúrate de que esta línea esté presente y correctamente escrita

    public MainMenu() {
        this.administrator = new Administrator(new Bank());
        this.bank = new Bank();
        this.bankLoan = new BankLoan();
        this.applyforLoan = new ApplyforLoan(bankLoan);
        this.options = new MenuOption[]{
                new CreateAccountOption(),
                new CheckBalanceOption(),
                new DepositOption(),
                new WithdrawOption(),
                new ApplyForLoanOption(applyforLoan),
                new PayLoanOption(),
                new RequestCreditCardOption()
        };
    }

    public void showMenu() {
        Scanner entrada = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n************* Bienvenido a nuestra banca en línea *****************\n");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ".- " + options[i].getDescription());
            }
            System.out.println("0.- Salir\n");
            System.out.println("Ingrese el numero de la opcion que desea obtener:");
            option = entrada.nextInt();

            if (option == 0) {
                System.out.println("\nGracias, hasta luego !!!!!");
            } else if (option > 0 && option <= options.length) {
                options[option - 1].execute();
            } else {
                System.out.println("\t\t ERROR!!!!!!");
                System.out.println("Ingrese un numero entre 1 al " + options.length);
            }

        } while (option != 0);
    }

    // Clase interna para la opción de crear una nueva cuenta
    private class CreateAccountOption implements MenuOption {
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

    // Clase interna para la opción de consultar saldo
    private class CheckBalanceOption implements MenuOption {
        @Override
        public String getDescription() {
            return "Consultar saldo";
        }

        @Override
        public void execute() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el numero de cuenta:\n");
            String number = entrada.nextLine();
            bank.showBalance(number);
        }
    }

    // Clase interna para la opción de realizar un depósito
    private class DepositOption implements MenuOption {
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

    // Clase interna para la opción de realizar un retiro
    private class WithdrawOption implements MenuOption {
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

    // Clase interna para la opción de solicitar un préstamo
    private class ApplyForLoanOption implements MenuOption {
        private final ApplyforLoan applyforLoan;

        public ApplyForLoanOption(ApplyforLoan applyforLoan) {
            this.applyforLoan = applyforLoan;
        }

        @Override
        public String getDescription() {
            return "Solicitar prestamo";
        }

        @Override
        public void execute() {
            applyforLoan.registerLoad();
        }
    }

    // Clase interna para la opción de realizar un pago de préstamo
    private class PayLoanOption implements MenuOption {
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

    // Clase interna para la opción de solicitar una tarjeta de crédito
    private class RequestCreditCardOption implements MenuOption {
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
}