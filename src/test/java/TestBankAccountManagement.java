import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestBankAccountManagement  {


    @Test
    public void mainMenu() {
        Bank bank = new Bank();
        MenuOption[] options = {
                new CheckBalanceOption(bank),
                new DepositOption(bank),
                new WithdrawOption(bank)
        };

        MainMenu mainMenu = new MainMenu(options);

        // Verificar si MainMenu se creó correctamente
        assertNotNull(mainMenu);
    }
}
