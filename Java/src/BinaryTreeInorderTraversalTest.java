import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();

        Assert.assertTrue(b.inorderTraversal(null).isEmpty());

        BinaryTreeInorderTraversal.TreeNode node132 = new BinaryTreeInorderTraversal.TreeNode(1);
        BinaryTreeInorderTraversal.TreeNode right = new BinaryTreeInorderTraversal.TreeNode(2);
        right.left = new BinaryTreeInorderTraversal.TreeNode(3);
        node132.right = right;

        List<Integer> list132 = new ArrayList<>(3);
        list132.add(1);
        list132.add(3);
        list132.add(2);
        Assert.assertEquals(b.inorderTraversal(node132), list132);

        BinaryTreeInorderTraversal.TreeNode node4251637 = new BinaryTreeInorderTraversal.TreeNode(1);
        BinaryTreeInorderTraversal.TreeNode node2 = new BinaryTreeInorderTraversal.TreeNode(2);
        BinaryTreeInorderTraversal.TreeNode node3 = new BinaryTreeInorderTraversal.TreeNode(3);
        node2.left = new BinaryTreeInorderTraversal.TreeNode(4);
        node2.right = new BinaryTreeInorderTraversal.TreeNode(5);
        node3.left = new BinaryTreeInorderTraversal.TreeNode(6);
        node3.right = new BinaryTreeInorderTraversal.TreeNode(7);
        node4251637.left = node2;
        node4251637.right = node3;

        List<Integer> list4251637 = new ArrayList<>(7);
        list4251637.add(4);
        list4251637.add(2);
        list4251637.add(5);
        list4251637.add(1);
        list4251637.add(6);
        list4251637.add(3);
        list4251637.add(7);
        Assert.assertEquals(b.inorderTraversal(node4251637), list4251637);
    }

}