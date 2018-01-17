/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * <p>
 * Accepted.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null
                || p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree st = new SameTree();
        // Expected: true
        System.out.println(st.isSameTree(null, null));

        TreeNode tn1 = new TreeNode(1);
        // Expected: false
        System.out.println(st.isSameTree(null, tn1));
        // Expected: false
        System.out.println(st.isSameTree(tn1, null));

        TreeNode tn2 = new TreeNode(2);
        // Expected: false
        System.out.println(st.isSameTree(tn1, tn2));

        TreeNode tn1111 = new TreeNode(1);
        tn1111.left = new TreeNode(1);
        tn1111.right = new TreeNode(1);
        TreeNode tn2111 = new TreeNode(1);
        tn2111.left = new TreeNode(1);
        tn2111.right = new TreeNode(1);
        // Expected: true
        System.out.println(st.isSameTree(tn1111, tn2111));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
