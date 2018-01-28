import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    @Test
    public void testConvert() {
        ZigZagConversion z = new ZigZagConversion();

        Assert.assertNull(z.convert(null, 2));

        Assert.assertEquals(z.convert("0123456789", 1), "0123456789");

        Assert.assertEquals(z.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");

        Assert.assertEquals(z.convert("0123456789", 2), "0246813579");

        Assert.assertEquals(z.convert("0123456789", 3), "0481357926");
    }

}