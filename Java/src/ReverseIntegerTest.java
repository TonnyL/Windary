import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {
        ReverseInteger ri = new ReverseInteger();

        Assert.assertTrue(ri.reverse(123) == 321);

        Assert.assertTrue(ri.reverse(-123) == -321);

        Assert.assertTrue(ri.reverse(1000000003) == 0);

        Assert.assertTrue(ri.reverse(1534236469) == 0);
    }

}