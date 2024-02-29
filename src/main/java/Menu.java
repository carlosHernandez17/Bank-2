import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Menu {

    Bank bank = new Bank();
    Administrator administrator = new Administrator(bank);
    BankLoan bankLoan = new BankLoan();
    ApplyforLoan applyforLoan = new ApplyforLoan(bankLoan);


    public  void action(int option) {

        Scanner entrada = new Scanner(System.in);
        int optionMenu;
        double amount, remove;

        switch (option){
            case 1:
                System.out.println("Seleccione el tipo de cuenta:\n");
                System.out.println("1.- Cuenta de Ahorro");
                System.out.println("2.- Cuenta Corriente");
                optionMenu = entrada.nextInt();
                if (optionMenu==1){
                    administrator.registerCustomer("Ahorro");
                }else if (optionMenu==2){

                    administrator.registerCustomer("Corriente");
                }

                break;
            case 2:

                System.out.println("Ingrese el numero de cuenta:\n");
                String  number = entrada.nextLine();
                bank.showBalance(number);

                break;
            case 3:
                System.out.println("Ingrese el numero de cuenta:\n");
                String noAccount = entrada.nextLine();
                System.out.println("Ingrese la cantidad a depositar:\n");
                amount = entrada.nextDouble();
                System.out.println(amount);
                if (amount > 0.0){
                    bank.depositToAccount(noAccount,amount);
                }
                break;
            case 4:
                System.out.println("Ingrese el numero de cuenta:\n");
                String noAcc = entrada.nextLine();
                System.out.println("Ingrese la cantidad a retirar:\n");
                remove = entrada.nextDouble();
                if (remove > 0.0 ){
                    bank.withdrawFromAccount(noAcc, remove);
                }
                break;
            case 5:
                System.out.println("Solicitar Prestamo:\n");
                applyforLoan.registerLoad();
                break;
            case 6:
                System.out.println("Ingrese id del prestamos:\n");
                optionMenu = entrada.nextInt();
                System.out.println("Ingrese la cantidad a depositar:\n");
                amount = entrada.nextDouble();
                break;
            case 7:
                System.out.println("Solicitar tarjeta de credito:\n");
                break;
            default:
                System.out.println("Opcion no valida!!! ");
                break;
        }

    }
}
