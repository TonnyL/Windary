import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 * <p>
 * Accepted.
 */

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(lists, root, 0);
        Collections.reverse(lists);
        return lists;
    }

    private void helper(List<List<Integer>> res, TreeNode node, int height) {
        if (node == null) {
            return;
        }
        if (height >= res.size()) {
            res.add(new LinkedList<>());
        }
        res.get(height).add(node.val);
        helper(res, node.left, height + 1);
        helper(res, node.right, height + 1);
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
