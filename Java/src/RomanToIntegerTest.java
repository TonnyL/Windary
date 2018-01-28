import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {
        RomanToInteger rtt = new RomanToInteger();
        // Expected: 621 = 500 + 100 + 10 + 10 +1
        Assert.assertTrue(rtt.romanToInt("DCXXI") == 621);
        // Expected: 1996 = 1000 - (100 - 1000) - (10 - 100) + 5 + 1
        Assert.assertTrue(rtt.romanToInt("MCMXCVI") == 1996);
        // Expected: 999 = - (100 - 1000) - (10 - 100) - (1 - 10)
        Assert.assertTrue(rtt.romanToInt("CMXCIX") == 999);
    }

}