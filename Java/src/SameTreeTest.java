import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void testIsSameTree() {
        SameTree st = new SameTree();

        Assert.assertTrue(st.isSameTree(null, null));

        SameTree.TreeNode tn1 = new SameTree.TreeNode(1);
        Assert.assertFalse(st.isSameTree(null, tn1));
        Assert.assertFalse(st.isSameTree(tn1, null));

        SameTree.TreeNode tn2 = new SameTree.TreeNode(2);
        Assert.assertFalse(st.isSameTree(tn1, tn2));

        SameTree.TreeNode tn1111 = new SameTree.TreeNode(1);
        tn1111.left = new SameTree.TreeNode(1);
        tn1111.right = new SameTree.TreeNode(1);
        SameTree.TreeNode tn2111 = new SameTree.TreeNode(1);
        tn2111.left = new SameTree.TreeNode(1);
        tn2111.right = new SameTree.TreeNode(1);
        Assert.assertTrue(st.isSameTree(tn1111, tn2111));
    }

}