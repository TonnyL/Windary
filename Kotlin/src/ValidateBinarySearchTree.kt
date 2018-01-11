import java.util.Stack

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
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
 *
 * Accepted.
 */
class ValidateBinarySearchTree {

    fun isValidBST(root: TreeNode?): Boolean {
        var node: TreeNode? = root ?: return true

        val stack = Stack<TreeNode>()
        var pre: TreeNode? = null
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node)
                node = node.left
            }
            node = stack.pop()
            if (pre != null && node.`val` <= pre.`val`) {
                return false
            }
            pre = node
            node = node.right
        }

        return true
    }

    data class TreeNode(
            var `val`: Int,
            var left: TreeNode? = null,
            var right: TreeNode? = null
    )

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val v = ValidateBinarySearchTree()

            // Expected: true
            println(v.isValidBST(null))

            // Expected: true
            println(v.isValidBST(TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }))

            // Expected: true
            println(v.isValidBST(TreeNode(1)))

            // Expected: false
            println(v.isValidBST(TreeNode(1).apply {
                left = TreeNode(2)
                right = TreeNode(3)
            }))

            // Expected: true
            println(v.isValidBST(TreeNode(3).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                }
            }))

            // Expected: false
            println(v.isValidBST(TreeNode(1).apply {
                right = TreeNode(0)
            }))

            // Expected: true
            println(v.isValidBST(TreeNode(0).apply {
                left = TreeNode(-1)
            }))
        }
    }

}
