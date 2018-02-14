/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * <code>
 *  3
 * / \
 * 9 20
 *   / \
 *  15 7
 * </code>
 * return its depth = 3.
 * <p>
 * Accepted.
 */

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if (root != null) {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }

        return maxDepth;
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
