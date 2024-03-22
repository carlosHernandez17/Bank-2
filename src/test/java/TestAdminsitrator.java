import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestAdminsitrator {
    private Bank storeBank = new Bank();

    @Test
    public  void TestRegisterCustomer() {
        Customer customer =new Customer("carlos","garcia","asd","asd","4561","2",new ArrayList<>());
        Account newAccount = new Account("1", "0001", 125);
        customer.addAccount(newAccount);
        storeBank.addCustomer(customer);
        assertNotNull(storeBank.getCustomerList());

    }
}
