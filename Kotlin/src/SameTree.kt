/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Accepted.
 */
class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p == null || q == null) return false

        return p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val st = SameTree()
            // Expected: true
            println(st.isSameTree(null, null))

            val tn1 = TreeNode(1)
            // Expected: false
            println(st.isSameTree(null, tn1))
            // Expected: false
            println(st.isSameTree(tn1, null))

            val tn2 = TreeNode(2)
            // Expected: false
            println(st.isSameTree(tn1, tn2))

            val tn1111 = TreeNode(1)
            tn1111.left = TreeNode(1)
            tn1111.right = TreeNode(1)
            val tn2111 = TreeNode(1)
            tn2111.left = TreeNode(1)
            tn2111.right = TreeNode(1)
            // Expected: true
            println(st.isSameTree(tn1111, tn2111))
        }

        /**
         * Definition for a binary tree node.
         */
        class TreeNode internal constructor(internal var `val`: Int) {
            internal var left: TreeNode? = null
            internal var right: TreeNode? = null
        }
    }

}