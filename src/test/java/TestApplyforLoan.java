import org.junit.Test;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

public class TestApplyforLoan {
    private ApplyforLoan applyforLoan = new ApplyforLoan();
    @Test
    public void TestRegisterLoad(){
        assertEquals(applyforLoan.registerLoad(valueOf(1)), 1);
    }

}
