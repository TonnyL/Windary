import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * <p>
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * <p>
 * 1       3     3      2      1
 * \      /     /      / \      \
 * 3     2     1      1  3      2
 * /    /       \                \
 * 2   1        2                 3
 * <p>
 * Accepted.
 */
public class UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<>();
        if (n <= 0) {
            return list;
        }

        return gen(1, n);
    }

    private List<TreeNode> gen(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        if (start == end) {
            list.add(new TreeNode(start));
            return list;
        }

        for (int i = start; i <= end; i++) {
            for (TreeNode m : gen(start, i - 1)) {
                for (TreeNode n : gen(i + 1, end)) {
                    TreeNode root = new TreeNode(i);
                    root.left = m;
                    root.right = n;
                    list.add(root);
                }
            }
        }

        return list;
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
