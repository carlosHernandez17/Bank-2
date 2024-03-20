import java.util.Arrays;

public class AccountGenerator {
    private int nextAccountNumber = 1;
    public String numAccount(){
        String accountNumber = String.format("%010d", nextAccountNumber);
        nextAccountNumber++; // Incrementa el número de cuenta para la próxima generación
        return accountNumber;
    }

}
