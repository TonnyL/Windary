/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Accepted.
 */
class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return p == null && q == null
                || p != null && q != null && p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }

    data class TreeNode(
            var `val`: Int,
            var left: TreeNode? = null,
            var right: TreeNode? = null
    )

}