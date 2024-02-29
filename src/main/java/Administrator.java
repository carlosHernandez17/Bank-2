import java.util.ArrayList;
import java.util.Scanner;

public class Administrator  implements IOperationAdministrator  {

    private Bank storeBank;

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
        System.out.println("Ingrese el numero de cuenta: ");
        String accountNumber = entrada.next();
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
    }






  /*  @Override
    public void removeCustomers( String accountNumber ) {

            // Iterar sobre la lista de clientes
            for (Customer customer : customerList) {
                // Obtener la lista de cuentas del cliente
                ArrayList<Account> accounts = customer.getAccounts();

                for (int i = 0; i < accounts.size(); i++) {

                    Account account = accounts.get(i);
                    // Comprobar si el número de cuenta coincide
                    if (account.getAccountNumber().equals(accountNumber)) {

                        accounts.remove(i);
                        System.out.println("Account removed successfully.");
                        return;
                    }
                }
            }

            System.out.println("Account not found.");
        }

*/

}
