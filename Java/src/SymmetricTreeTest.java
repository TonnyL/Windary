import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeTest {

    @Test
    public void testIsSymmetric() {
        SymmetricTree st = new SymmetricTree();
        Assert.assertTrue(st.isSymmetric(null));

        SymmetricTree.TreeNode node0 = new SymmetricTree.TreeNode(1);
        node0.left = new SymmetricTree.TreeNode(2);
        node0.right = new SymmetricTree.TreeNode(2);
        node0.left.left = new SymmetricTree.TreeNode(3);
        node0.left.right = new SymmetricTree.TreeNode(4);
        node0.right.left = new SymmetricTree.TreeNode(4);
        node0.right.right = new SymmetricTree.TreeNode(3);
        Assert.assertTrue(st.isSymmetric(node0));

        SymmetricTree.TreeNode node1 = new SymmetricTree.TreeNode(1);
        node1.left = new SymmetricTree.TreeNode(2);
        node1.left.right = new SymmetricTree.TreeNode(3);
        node1.right = new SymmetricTree.TreeNode(2);
        node1.right.right = new SymmetricTree.TreeNode(3);
        Assert.assertFalse(st.isSymmetric(node1));
    }

}