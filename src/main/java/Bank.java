import java.util.ArrayList;

public class Bank {
    private final ArrayList<Customer> customerList;

    // Constructor
    public Bank() {
        this.customerList = new ArrayList<>();
    }

    // Método para agregar un cliente a la lista
    public void addCustomer(Customer customer) {
        if (customer != null) {
            //System.out.println("Agregando cliente: " + customer.getName());
            customerList.add(customer);
        } else {
            System.out.println("No se puede agregar un cliente nulo.");
        }
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public Object showBalance(String AccountNo){
        ArrayList<Customer> List = getCustomerList();
        boolean accountFound = false; // Variable para indicar si se encontró la cuenta
        for (Customer customer : List) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(AccountNo)) {
                    accountFound = true;
                    String num = account.getAccountNumber();
                    System.out.println("Nombre: " + customer.getName() + " " + customer.getLastName());
                    System.out.println("Número de cuenta: " + account.getAccountNumber());
                    System.out.println("Saldo disponible: " + account.getAmount());
                    return num;
                    //break;
                }
            }
            if (accountFound) {
                break;
            }
        }
        if (!accountFound) {
            System.out.println("La cuenta con el número " + AccountNo + " no fue encontrada.");
        }
        return "Cuenta no encontrada";
    }

    public double depositToAccount(String accountNumber, double depositAmount) {
        ArrayList<Customer> List = getCustomerList();
        boolean accountFound = false; // Variable para indicar si se encontró la cuenta
        for (Customer customer : List) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    accountFound = true;
                    double currentAmount = account.getAmount();
                    double newAmount = currentAmount + depositAmount;
                    account.setAmount(newAmount);
                    System.out.println("Se ha depositado " + depositAmount + " a la cuenta " + accountNumber + ".");
                    System.out.println("Nuevo saldo disponible: " + newAmount);
                    return newAmount;
                   // break; // Se sale del bucle
                }
            }
            if (accountFound) {
                break; // Se encontró la cuenta, se sale del bucle externo
            }
        }
        if (!accountFound) {
            System.out.println("La cuenta con el número " + accountNumber + " no fue encontrada.");
        }
        return depositAmount;
    }

    public double withdrawFromAccount(String accountNumber, double withdraw ) {
        boolean accountFound = false; // Variable para indicar si se encontró la cuenta
        for (Customer customer : getCustomerList() ) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    accountFound = true;
                    double currentAmount = account.getAmount();

                    // Verificar saldo
                    double withdrawAmount = 0;
                    if (currentAmount >= withdrawAmount) {
                        double newAmount = currentAmount - withdraw;
                        // Actualizar el saldo
                        account.setAmount(newAmount);
                        System.out.println("Se ha retirado " + withdraw + " de la cuenta " + accountNumber + ".");
                        System.out.println("Nuevo saldo disponible: " + newAmount);
                        return newAmount;
                    } else {
                        System.out.println("Saldo insuficiente para realizar el retiro.");
                        return currentAmount;
                    }

                }
            }
            if (accountFound) {
                break;
            }
        }
        if (!accountFound) {
            System.out.println("La cuenta con el número " + accountNumber + " no fue encontrada.");
        }
        return 0;
    }

    public Object depositToAccount(String s) {
        return 1;
    }

}

