import java.util.Stack;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * 2
 * / \
 * 1   3
 * Binary tree [2,1,3], return true.
 * Example 2:
 * 1
 * / \
 * 2   3
 * Binary tree [1,2,3], return false.
 * <p>
 * Accepted.
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && root.val <= pre.val) {
                return false;
            }
            pre = root;
            root = root.right;
        }

        return true;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree v = new ValidateBinarySearchTree();

        // Expected: true
        System.out.println(v.isValidBST(null));

        TreeNode node213 = new TreeNode(2);
        node213.left = new TreeNode(1);
        node213.right = new TreeNode(3);
        // Expected: true
        System.out.println(v.isValidBST(node213));

        // Expected: true
        System.out.println(v.isValidBST(new TreeNode(1)));

        TreeNode node123 = new TreeNode(1);
        node123.left = new TreeNode(2);
        node123.right = new TreeNode(3);
        // Expected: false
        System.out.println(v.isValidBST(node123));

        TreeNode node321 = new TreeNode(3);
        node321.left = new TreeNode(2);
        node321.left.left = new TreeNode(1);
        // Expected: true
        System.out.println(v.isValidBST(node321));

        TreeNode node10 = new TreeNode(1);
        node10.right = new TreeNode(0);
        // Expected: false
        System.out.println(v.isValidBST(node10));

        TreeNode node0Minus1 = new TreeNode(0);
        node0Minus1.left = new TreeNode(-1);
        // Expected: false
        System.out.println(v.isValidBST(node0Minus1));
    }

}
