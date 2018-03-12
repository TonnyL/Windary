/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * <p>
 * For example:
 * Given the below binary tree and sum = 22,
 * <p>
 * 5
 * / \
 * 4  8
 * /  / \
 * 11 13 4
 * /  \   \
 * 7  2   1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * <p>
 * Accepted.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        return root != null && (root.left == null && root.right == null && sum == root.val || hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TreeNode) {
                TreeNode node = (TreeNode) obj;
                if (this.val != node.val) {
                    return false;
                }
                if (this.left == null) {
                    if (this.right == null) {
                        return node.left == null && node.right == null;
                    }
                    return this.right.equals(node.right);
                }
                if (this.right == null) {
                    return node.right == null;
                }
                return this.left.equals(node.left) && this.right.equals(node.right);
            }
            return false;
        }

    }

}
