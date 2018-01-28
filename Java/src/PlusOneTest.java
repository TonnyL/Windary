import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PlusOneTest {

    @Test
    public void testPlusOne() {
        PlusOne po = new PlusOne();

        Assert.assertTrue(Arrays.equals(po.plusOne(new int[]{1}), new int[]{2}));

        Assert.assertTrue(Arrays.equals(po.plusOne(new int[]{9}), new int[]{1, 0}));

        Assert.assertTrue(Arrays.equals(po.plusOne(new int[]{9, 9}), new int[]{1, 0, 0}));

        Assert.assertTrue(Arrays.equals(po.plusOne(new int[]{2, 8, 9, 9, 9}), new int[]{2, 9, 0, 0, 0}));

        Assert.assertTrue(Arrays.equals(po.plusOne(new int[]{2, 8, 8, 9}), new int[]{2, 8, 9, 0}));
    }

}