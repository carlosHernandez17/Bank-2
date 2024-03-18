import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBank {
    private Bank bank = new Bank();;
    @Test
    public void TestShowBalance(){
       assertEquals(bank.showBalance(String.valueOf(1)), 1);
    }
/*
    public void depositToAccount(String accountNumber, double depositAmount) {
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
                    break; // Se sale del bucle
                }
            }
            if (accountFound) {
                break; // Se encontró la cuenta, se sale del bucle externo
            }
        }
        if (!accountFound) {
            System.out.println("La cuenta con el número " + accountNumber + " no fue encontrada.");
        }
    }

    public void withdrawFromAccount(String accountNumber, double withdrawAmount) {
        boolean accountFound = false; // Variable para indicar si se encontró la cuenta
        for (Customer customer : getCustomerList() ) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    accountFound = true;
                    double currentAmount = account.getAmount();

                    // Verificar saldo
                    if (currentAmount >= withdrawAmount) {
                        double newAmount = currentAmount - withdrawAmount;
                        // Actualizar el saldo
                        account.setAmount(newAmount);
                        System.out.println("Se ha retirado " + withdrawAmount + " de la cuenta " + accountNumber + ".");
                        System.out.println("Nuevo saldo disponible: " + newAmount);
                    } else {
                        System.out.println("Saldo insuficiente para realizar el retiro.");
                    }
                    break;
                }
            }
            if (accountFound) {
                break;
            }
        }
        if (!accountFound) {
            System.out.println("La cuenta con el número " + accountNumber + " no fue encontrada.");
        }
    }
*/
}
