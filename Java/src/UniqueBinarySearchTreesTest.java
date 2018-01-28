import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreesTest {

    @Test
    public void testNumTrees() {
        UniqueBinarySearchTrees u = new UniqueBinarySearchTrees();

        Assert.assertTrue(u.numTrees(0) == 1);

        Assert.assertTrue(u.numTrees(1) == 1);

        Assert.assertTrue(u.numTrees(2) == 2);

        Assert.assertTrue(u.numTrees(3) == 5);

        Assert.assertTrue(u.numTrees(4) == 14);
    }

}