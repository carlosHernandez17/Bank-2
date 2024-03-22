import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static java.lang.String.*;
import static org.junit.Assert.assertEquals;

public class TestBank {
    private Bank bank = new Bank();

    @Test
    @DisplayName("Prueba para verificar la suma de dos números positivos")
    public void TestShowBalance(){
        AccountGenerator generator = new AccountGenerator();

        Customer customer =new Customer("carlos","garcia","asd","asd","4561","2",new ArrayList<>());
        Account newAccount = new Account("1", "0001", 125);
        customer.addAccount(newAccount);
        bank.addCustomer(customer);
        assertEquals( "0001",bank.showBalance("0001"));
    }

    @Test
    public void TestShowBalanceTwo(){
        AccountGenerator generator = new AccountGenerator();

        Customer customer =new Customer("carlos","garcia","asd","asd","4561","2",new ArrayList<>());
        Account newAccount = new Account("1", "0006", 125);
        customer.addAccount(newAccount);
        bank.addCustomer(customer);
        assertEquals( "0006",bank.showBalance("0006"));
    }


    @Test
    public void TestDepositToAccount() {
        AccountGenerator generator = new AccountGenerator();

        Customer customer =new Customer("carlos","garcia","asd","asd","4561","2",new ArrayList<>());
        Account newAccount = new Account("1", "0001", 125);
        customer.addAccount(newAccount);
        bank.addCustomer(customer);
        assertEquals( 150.0, bank.depositToAccount("0001",25),0.001);
    }
    @Test
    public void TestWithdrawFromAccount() {
        Customer customer =new Customer("carlos","garcia","asd","asd","4561","2",new ArrayList<>());
        Account newAccount = new Account("2", "0002", 125);
        customer.addAccount(newAccount);
        bank.addCustomer(customer);
        assertEquals(25.0,bank.withdrawFromAccount("0002", 100),0.001);
    }

}
