import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * <p>
 * For example:
 * Given binary tree [1,null,2,3],
 * 1
 * \
 * 2
 * /
 * 3
 * return [1,3,2].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 */

public class BinaryTreeInorderTraversal {

    // Iterative solution.
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

        return list;
    }

    // Recursive solution.
    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        if (root.left != null) {
            list.addAll(inorderTraversal(root.left));
        }

        list.add(root.val);

        if (root.right != null) {
            list.addAll(inorderTraversal(root.right));
        }

        return list;
    }*/

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
