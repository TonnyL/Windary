import org.junit.Assert;
import org.junit.Test;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testIsValidBST() {
        ValidateBinarySearchTree v = new ValidateBinarySearchTree();

        Assert.assertTrue(v.isValidBST(null));

        ValidateBinarySearchTree.TreeNode node213 = new ValidateBinarySearchTree.TreeNode(2);
        node213.left = new ValidateBinarySearchTree.TreeNode(1);
        node213.right = new ValidateBinarySearchTree.TreeNode(3);
        Assert.assertTrue(v.isValidBST(node213));

        Assert.assertTrue(v.isValidBST(new ValidateBinarySearchTree.TreeNode(1)));

        ValidateBinarySearchTree.TreeNode node123 = new ValidateBinarySearchTree.TreeNode(1);
        node123.left = new ValidateBinarySearchTree.TreeNode(2);
        node123.right = new ValidateBinarySearchTree.TreeNode(3);
        Assert.assertFalse(v.isValidBST(node123));

        ValidateBinarySearchTree.TreeNode node321 = new ValidateBinarySearchTree.TreeNode(3);
        node321.left = new ValidateBinarySearchTree.TreeNode(2);
        node321.left.left = new ValidateBinarySearchTree.TreeNode(1);
        Assert.assertTrue(v.isValidBST(node321));

        ValidateBinarySearchTree.TreeNode node10 = new ValidateBinarySearchTree.TreeNode(1);
        node10.right = new ValidateBinarySearchTree.TreeNode(0);
        Assert.assertFalse(v.isValidBST(node10));

        ValidateBinarySearchTree.TreeNode node0Minus1 = new ValidateBinarySearchTree.TreeNode(0);
        node0Minus1.left = new ValidateBinarySearchTree.TreeNode(-1);
        Assert.assertTrue(v.isValidBST(node0Minus1));
    }

}