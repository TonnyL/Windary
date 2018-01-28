import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueBinarySearchTreesIITest {

    @Test
    public void testGenerateTrees() {
        UniqueBinarySearchTreesII u = new UniqueBinarySearchTreesII();

        Assert.assertTrue(u.generateTrees(0).isEmpty());

        UniqueBinarySearchTreesII.TreeNode node0 = new UniqueBinarySearchTreesII.TreeNode(1);
        Assert.assertEquals(u.generateTrees(1), Collections.singletonList(node0));

        // Expected:
        // 2  1
        // /   \
        //1    2
        List<UniqueBinarySearchTreesII.TreeNode> list0 = u.generateTrees(2);
        UniqueBinarySearchTreesII.TreeNode node1 = new UniqueBinarySearchTreesII.TreeNode(2);
        node1.left = new UniqueBinarySearchTreesII.TreeNode(1);
        UniqueBinarySearchTreesII.TreeNode node2 = new UniqueBinarySearchTreesII.TreeNode(1);
        node2.right = new UniqueBinarySearchTreesII.TreeNode(2);
        Assert.assertTrue(list0.size() == 2);
        Assert.assertTrue(list0.containsAll(Arrays.asList(node1, node2)));

        // Expected:
        // 1       3     3      2      1
        // \      /     /      / \      \
        // 3     2     1      1  3      2
        ///    /       \                \
        //2   1        2                 3
        UniqueBinarySearchTreesII.TreeNode node3 = new UniqueBinarySearchTreesII.TreeNode(1);
        node3.right = new UniqueBinarySearchTreesII.TreeNode(3);
        node3.right.left = new UniqueBinarySearchTreesII.TreeNode(2);
        UniqueBinarySearchTreesII.TreeNode node4 = new UniqueBinarySearchTreesII.TreeNode(3);
        node4.left = new UniqueBinarySearchTreesII.TreeNode(2);
        node4.left.left = new UniqueBinarySearchTreesII.TreeNode(1);
        UniqueBinarySearchTreesII.TreeNode node5 = new UniqueBinarySearchTreesII.TreeNode(3);
        node5.left = new UniqueBinarySearchTreesII.TreeNode(1);
        node5.left.right = new UniqueBinarySearchTreesII.TreeNode(2);
        UniqueBinarySearchTreesII.TreeNode node6 = new UniqueBinarySearchTreesII.TreeNode(2);
        node6.left = new UniqueBinarySearchTreesII.TreeNode(1);
        node6.right = new UniqueBinarySearchTreesII.TreeNode(3);
        UniqueBinarySearchTreesII.TreeNode node7 = new UniqueBinarySearchTreesII.TreeNode(1);
        node7.right = new UniqueBinarySearchTreesII.TreeNode(2);
        node7.right.right = new UniqueBinarySearchTreesII.TreeNode(3);
        List<UniqueBinarySearchTreesII.TreeNode> list1 = u.generateTrees(3);
        Assert.assertTrue(list1.size() == 5);
        Assert.assertTrue(list1.containsAll(Arrays.asList(node3, node4, node5, node6, node7)));
    }

}