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

            // Expected: false
            println(st.isSameTree(tn1, TreeNode(2)))

            // Expected: true
            println(st.isSameTree(
                    TreeNode(1).apply {
                        left = TreeNode(1)
                        right = TreeNode(1)
                    },
                    TreeNode(1).apply {
                        left = TreeNode(1)
                        right = TreeNode(1)
                    })
            )
        }

        data class TreeNode(
                var `val`: Int,
                var left: TreeNode? = null,
                var right: TreeNode? = null
        )
    }

}