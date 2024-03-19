import java.util.Arrays;

public class AccountGenerator {

    public String numAccount(int counter){
//        Account account = new Account();
//        counter = account.getCreatedAccountCounter();

        String strCounter = Integer.toString(counter);

        String newAccount = "0000000000";

        return newAccount = (counter > 0) ? newAccount.substring(strCounter.length()) + counter : newAccount;

    }
//    TEST
//    public static void main(String[] args) {
//        AccountGenerator accountGenerator = new AccountGenerator();
//        System.out.println(accountGenerator.numAccount(0));
//        System.out.println(accountGenerator.numAccount(1));
//        System.out.println(accountGenerator.numAccount(12));
//        System.out.println(accountGenerator.numAccount(123));
//        System.out.println(accountGenerator.numAccount(1234));
//        System.out.println(accountGenerator.numAccount(12345));
//        System.out.println(accountGenerator.numAccount(1234567));
//        System.out.println(accountGenerator.numAccount(12345678));
//        System.out.println(accountGenerator.numAccount(123456789));
//    }
}
