import org.junit.Assert;
import org.junit.Test;

public class MultiplyStringsTest {

    @Test
    public void testMultiply() {
        MultiplyStrings ms = new MultiplyStrings();

        Assert.assertTrue(ms.multiply("", "").equals("0"));

        Assert.assertTrue(ms.multiply("0", "0").equals("0"));

        Assert.assertTrue(ms.multiply("100", "1").equals("100"));

        Assert.assertTrue(ms.multiply("123", "45").equals("5535"));

        Assert.assertTrue(ms.multiply("99", "99").equals("9801"));

        Assert.assertTrue(ms.multiply("123", "123").equals("15129"));

        Assert.assertTrue(ms.multiply("123456789", "123456789").equals("15241578750190521"));
    }
    
}