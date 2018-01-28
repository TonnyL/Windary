import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {

    @Test
    public void testUniquePaths() {
        UniquePaths up = new UniquePaths();

        Assert.assertTrue(up.uniquePaths(1, 1) == 1);
        Assert.assertTrue(up.uniquePaths(1, 2) == 1);
        // The matrix:
        // 1 1
        // 1 2(result)
        Assert.assertTrue(up.uniquePaths(2, 2) == 2);
        // The matrix:
        // 1 1 1 1
        // 1 2 3 4
        // 1 3 6 10
        // 1 4 10 20(result)
        Assert.assertTrue(up.uniquePaths(4, 4) == 20);
    }

}