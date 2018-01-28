import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerAtoiTest {

    @Test
    public void testMyAtoi() {
        StringToIntegerAtoi atoi = new StringToIntegerAtoi();

        Assert.assertTrue(atoi.myAtoi("+-1") == 0);

        Assert.assertTrue(atoi.myAtoi("-00123a66") == -123);

        Assert.assertTrue(atoi.myAtoi("-1") == -1);

        Assert.assertTrue(atoi.myAtoi("    10522545459") == 2147483647);

        Assert.assertTrue(atoi.myAtoi("-2147483647") == -2147483647);

        Assert.assertTrue(atoi.myAtoi("2147483648") == 2147483647);

        Assert.assertTrue(atoi.myAtoi("-2147483649") == -2147483648);

        Assert.assertTrue(atoi.myAtoi("2147483647") == 2147483647);
    }
    
}