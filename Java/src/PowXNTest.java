import org.junit.Assert;
import org.junit.Test;

public class PowXNTest {

    @Test
    public void testMyPow() {
        PowXN pxn = new PowXN();

        Assert.assertTrue(pxn.myPow(2, 2) == 4.0);

        Assert.assertEquals(String.format("%.5f", pxn.myPow(8.88023, 3)), "700.28148");

        Assert.assertTrue(pxn.myPow(2, -2) == 0.25);

        Assert.assertTrue(pxn.myPow(0.00001, 2147483647) == 0.0);

        Assert.assertEquals(String.format("%.5f", pxn.myPow(34.00515, -3)), "0.00003");
    }

}