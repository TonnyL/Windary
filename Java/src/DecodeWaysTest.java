import org.junit.Assert;
import org.junit.Test;

public class DecodeWaysTest {

    @Test
    public void testNumDecodings() {
        DecodeWays dw = new DecodeWays();

        // Expected: 1, ['A']
        Assert.assertTrue(dw.numDecodings("1") == 1);

        // Expected: 0
        Assert.assertTrue(dw.numDecodings("0") == 0);

        // Expected: 1, ['JA']
        Assert.assertTrue(dw.numDecodings("101") == 1);

        // Expected: 1, ['AK']
        Assert.assertTrue(dw.numDecodings("110") == 1);

        // Expected: 1, ['JJ']
        Assert.assertTrue(dw.numDecodings("1010") == 1);

        // Expected: 0
        Assert.assertTrue(dw.numDecodings("012") == 0);

        // Expected: 2, ['JAA', 'JK']
        Assert.assertTrue(dw.numDecodings("1011") == 2);

        // Expected: 2, ['AB', 'L']
        Assert.assertTrue(dw.numDecodings("12") == 2);

        // Expected: 3, ['ABC', 'LC', 'AW']
        Assert.assertTrue(dw.numDecodings("123") == 3);

        // Expected: 3, ['ABAT', 'LAT', 'AUT']
        Assert.assertTrue(dw.numDecodings("12120") == 3);
    }

}