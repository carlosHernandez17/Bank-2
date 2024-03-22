import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApplyforLoan {
    private BankLoan request = new BankLoan();
    private  ApplyforLoan applyforLoan = new ApplyforLoan(request);
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Test
    public void TestRegisterLoad(){

        assertEquals(1, applyforLoan.registerLoad(150));

    }



}
