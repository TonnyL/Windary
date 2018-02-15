import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void testSingleNumber() {
        SingleNumber sn = new SingleNumber();

        Assert.assertTrue(sn.singleNumber(null) == 0);

        Assert.assertTrue(sn.singleNumber(new int[]{1}) == 1);

        Assert.assertTrue(sn.singleNumber(new int[]{1, 1, 2}) == 2);

        Assert.assertTrue(sn.singleNumber(new int[]{1, 1, 2, 2, 3}) == 3);
    }

}