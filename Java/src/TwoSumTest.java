import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        Assert.assertTrue(Arrays.equals(new TwoSum().twoSum(new int[]{2, 5, 5, 11}, 10), new int[]{1, 2}));
    }

}