import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreeLevelOrderTraversalIITest {

    @Test
    public void testLevelOrderBottom() {
        BinaryTreeLevelOrderTraversalII b = new BinaryTreeLevelOrderTraversalII();

        Assert.assertTrue(b.levelOrderBottom(null).isEmpty());

        BinaryTreeLevelOrderTraversalII.TreeNode node0 = new BinaryTreeLevelOrderTraversalII.TreeNode(1);
        Assert.assertEquals(b.levelOrderBottom(node0), Collections.singletonList(Collections.singletonList(1)));

        BinaryTreeLevelOrderTraversalII.TreeNode node1 = new BinaryTreeLevelOrderTraversalII.TreeNode(3);
        node1.left = new BinaryTreeLevelOrderTraversalII.TreeNode(9);
        node1.right = new BinaryTreeLevelOrderTraversalII.TreeNode(20);
        node1.right.left = new BinaryTreeLevelOrderTraversalII.TreeNode(15);
        node1.right.right = new BinaryTreeLevelOrderTraversalII.TreeNode(7);

        Assert.assertEquals(b.levelOrderBottom(node1), Arrays.asList(Arrays.asList(15, 7), Arrays.asList(9, 20), Collections.singletonList(3)));
    }

}