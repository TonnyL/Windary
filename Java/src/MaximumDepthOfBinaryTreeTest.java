import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() {
        MaximumDepthOfBinaryTree m = new MaximumDepthOfBinaryTree();

        Assert.assertTrue(m.maxDepth(null) == 0);

        MaximumDepthOfBinaryTree.TreeNode node0 = new MaximumDepthOfBinaryTree.TreeNode(3);
        node0.left = new MaximumDepthOfBinaryTree.TreeNode(9);
        node0.right = new MaximumDepthOfBinaryTree.TreeNode(20);
        node0.right.left = new MaximumDepthOfBinaryTree.TreeNode(15);
        node0.right.right = new MaximumDepthOfBinaryTree.TreeNode(7);
        Assert.assertTrue(m.maxDepth(node0) == 3);

        MaximumDepthOfBinaryTree.TreeNode node1 = new MaximumDepthOfBinaryTree.TreeNode(1);
        node1.left = new MaximumDepthOfBinaryTree.TreeNode(2);
        node1.left.left = new MaximumDepthOfBinaryTree.TreeNode(3);
        node1.left.left.left = new MaximumDepthOfBinaryTree.TreeNode(4);
        Assert.assertTrue(m.maxDepth(node1) == 4);
    }

}