import org.junit.Assert;
import org.junit.Test;

public class PathSumTest {

    @Test
    public void hasPathSum() {
        PathSum ps = new PathSum();

        Assert.assertFalse(ps.hasPathSum(null, 1));

        Assert.assertTrue(ps.hasPathSum(new PathSum.TreeNode(1), 1));

        PathSum.TreeNode node = new PathSum.TreeNode(5);
        node.left = new PathSum.TreeNode(4);
        node.right = new PathSum.TreeNode(8);
        node.left.left = new PathSum.TreeNode(11);
        node.left.left.left = new PathSum.TreeNode(7);
        node.left.left.right = new PathSum.TreeNode(2);
        node.right = new PathSum.TreeNode(8);
        node.right.left = new PathSum.TreeNode(13);
        node.right.right = new PathSum.TreeNode(4);
        node.right.right.right = new PathSum.TreeNode(1);

        Assert.assertTrue(ps.hasPathSum(node, 22));
    }

}