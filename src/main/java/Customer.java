import javax.xml.transform.Source;
import java.util.ArrayList;

public class Customer extends People implements  IOperationCustomer {
    private String customerType;
    private ArrayList<Account> accounts;

    public Customer() {
        super();
    }

    public Customer(String name, String lastName, String ID, String address, String contact, String customerType, ArrayList<Account> accounts) {
        super(name, lastName, ID, address, contact);
        this.customerType = customerType;
        this.accounts = accounts;

    }

    public void addAccount(Account account) { accounts.add(account);}

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public void checkBalance(String accountNumber) {
       /* Bank listClient =new Bank();

        System.out.println("Account number: " + accountNumber);


        System.out.println("check no null " + listClient.getCustomerList());
*/


    }


}
