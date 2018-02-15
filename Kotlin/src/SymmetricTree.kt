/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 *
 * Accepted.
 */
class SymmetricTree {

    fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root, root)
    }

    private fun isMirror(node1: TreeNode?, node2: TreeNode?): Boolean {
        return node1 == null && node2 == null
                || node1 != null && node2 != null && node1.`val` == node2.`val` && isMirror(node1.right, node2.left) && isMirror(node1.left, node2.right)
    }

    class TreeNode internal constructor(internal var `val`: Int) {
        internal var left: TreeNode? = null
        internal var right: TreeNode? = null
    }

}
