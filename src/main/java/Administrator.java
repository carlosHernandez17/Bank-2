import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Administrator  implements IOperationAdministrator  {

    private Bank storeBank;
    AccountGenerator generator = new AccountGenerator();

    public Administrator(Bank bank) {

        this.storeBank = bank;
    }

    @Override
    public  void registerCustomer(String accountType) {

        Scanner entrada = new Scanner(System.in);
        double amount;

        System.out.println("Ingrese los datos del cliente:");
        System.out.println("Nombre: ");
        String name = entrada.next();
        System.out.println("Apellido: ");
        String lastName = entrada.next();
        System.out.println("ID: ");
        String ID = entrada.next();
        System.out.println("Dirección: ");
        String address = entrada.next();
        System.out.println("Contacto: ");
        String contact = entrada.next();
        String accountNumber = generator.numAccount();
        System.out.println("Su  numero de cuenta es : "+ accountNumber);

        System.out.println("Ingrese el monto: ");
        amount = entrada.nextDouble();
        // Crear un nuevo objeto Customer
        Customer newCustomer = new Customer(
                name,
                lastName,
                ID,
                address,
                contact,
                accountType,
                new ArrayList<>());

        // Crear una cuenta para el cliente
        Account newAccount = new Account(accountType, accountNumber, amount);

        // Agregar la cuenta al cliente
        newCustomer.addAccount(newAccount);

        // Agregar el cliente al banco
        storeBank.addCustomer(newCustomer);

        System.out.println("Customer registered successfully.");

       // Customer customer = new Customer();

    }


    @Override
    public void removeCustomer( String accountNumber ) {
        for (Customer customer : storeBank.getCustomerList()) {
            if (customer.getAccounts().equals(accountNumber)) {
                Iterator<Account> it = customer.getAccounts().iterator();
                while (it.hasNext()) {
                    Account account = it.next();
                    if (account.getAccountNumber().equals(accountNumber)) {
                        it.remove();
                        break;
                    }
                }
                break;
            }
        }
    }


}
