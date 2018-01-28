import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArrayTest {

    @Test
    public void testMaxSubArray() {
        MaximumSubArray ms = new MaximumSubArray();

        Assert.assertTrue(ms.maxSubArray(new int[]{1}) == 1);

        Assert.assertTrue(ms.maxSubArray(new int[]{-4, -2}) == -2);

        Assert.assertTrue(ms.maxSubArray(new int[]{1, 0, -1}) == 1);

        Assert.assertTrue(ms.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) == 6);
    }

}