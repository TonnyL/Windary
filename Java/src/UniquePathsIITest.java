import org.junit.Assert;
import org.junit.Test;

public class UniquePathsIITest {

    @Test
    public void testUniquePathsWithObstacles() {
        UniquePathsII up = new UniquePathsII();

        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0, 0, 0}}) == 1);

        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0, 1, 0}}) == 0);

        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{1}, {0}}) == 0);

        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0}, {1}}) == 0);

        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 1}, {0, 0}}) == 0);

        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0}, {0}}) == 1);
        // The matrix:
        // 1 1 1
        // 1 0 1
        // 1 1 2
        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}) == 2);
        // 1 1 1 1
        // 1 0 1 2
        // 1 1 2 4
        // 1 2 4 8
        Assert.assertTrue(up.uniquePathsWithObstacles(new int[][]{{0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}) == 8);
    }

}