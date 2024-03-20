import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static java.lang.String.*;
import static org.junit.Assert.assertEquals;

public class TestBank {
    private Bank bank = new Bank();;
    @Test
    public void TestShowBalance(){
       assertEquals(bank.showBalance(valueOf(1)), 1);
    }
    @Test
    public void TestDepositToAccount() {
        assertEquals(bank.depositToAccount(valueOf(1)),1);
    }
    @Test
    public void TestWithdrawFromAccount() {
        assertEquals(bank.withdrawFromAccount(valueOf(1)),1);
    }

}
