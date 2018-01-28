import org.junit.Assert;
import org.junit.Test;

public class MinimumPathSumTest {

    @Test
    public void testMinPathSum() {
        MinimumPathSum mps = new MinimumPathSum();

        Assert.assertTrue(mps.minPathSum(new int[][]{}) == 0);

        Assert.assertTrue(mps.minPathSum(new int[][]{{}}) == 0);

        Assert.assertTrue(mps.minPathSum(new int[][]{{1}}) == 1);
        // Expected: 7
        // The matrix:
        // 1 4 5
        // 2 7 6
        // 6 8 7
        Assert.assertTrue(mps.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}) == 7);
        // Expected: 5
        // The matrix:
        // 1 2 3
        // 2 4 4
        // 3 6 5
        Assert.assertTrue(mps.minPathSum(new int[][]{{1, 1, 1}, {1, 2, 1}, {1, 3, 1}}) == 5);
    }

}