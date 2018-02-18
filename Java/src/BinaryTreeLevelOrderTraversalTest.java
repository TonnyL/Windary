import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void testLevelOrder() {
        BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();

        Assert.assertTrue(b.levelOrder(null).isEmpty());

        BinaryTreeLevelOrderTraversal.TreeNode node0 = new BinaryTreeLevelOrderTraversal.TreeNode(1);
        Assert.assertEquals(b.levelOrder(node0), Collections.singletonList(Collections.singletonList(1)));

        BinaryTreeLevelOrderTraversal.TreeNode node1 = new BinaryTreeLevelOrderTraversal.TreeNode(3);
        node1.left = new BinaryTreeLevelOrderTraversal.TreeNode(9);
        node1.right = new BinaryTreeLevelOrderTraversal.TreeNode(20);
        node1.right.left = new BinaryTreeLevelOrderTraversal.TreeNode(15);
        node1.right.right = new BinaryTreeLevelOrderTraversal.TreeNode(7);

        Assert.assertEquals(b.levelOrder(node1), Arrays.asList(Collections.singletonList(3), Arrays.asList(9, 20), Arrays.asList(15, 7)));

    }

}