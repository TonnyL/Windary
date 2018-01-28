import org.junit.Assert;
import org.junit.Test;

public class DivideTwoIntegersTest {

    @Test
    public void testDivide() {
        DivideTwoIntegers d = new DivideTwoIntegers();

        Assert.assertTrue(d.divide(1, 1) == 1);

        Assert.assertTrue(d.divide(0, 1) == 0);

        Assert.assertTrue(d.divide(-1, -1) == 1);

        Assert.assertTrue(d.divide(Integer.MAX_VALUE, 1) == 2147483647);

        Assert.assertTrue(d.divide(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);

        Assert.assertTrue(d.divide(Integer.MIN_VALUE, -1) == 2147483647);

        Assert.assertTrue(d.divide(100, 6) == 16);
    }

}