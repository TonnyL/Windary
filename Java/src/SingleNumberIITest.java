import org.junit.Assert;
import org.junit.Test;

public class SingleNumberIITest {

    @Test
    public void testSingleNumber() {
        SingleNumberII s = new SingleNumberII();

        Assert.assertTrue(s.singleNumber(new int[]{1}) == 1);

        Assert.assertTrue(s.singleNumber(new int[]{1, 1, 1}) == 0);

        Assert.assertTrue(s.singleNumber(new int[]{1, 1, 1, 2}) == 2);

        Assert.assertTrue(s.singleNumber(new int[]{1, 1, 1, 2, 2, 2, 3}) == 3);
    }

}