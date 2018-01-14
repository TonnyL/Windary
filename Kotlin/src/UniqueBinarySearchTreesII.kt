/**
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 *
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 *
 * 1       3     3      2      1
 * \      /     /      / \      \
 * 3     2     1      1  3      2
 * /    /       \                \
 * 2   1        2                 3
 *
 * Accepted.
 */
class UniqueBinarySearchTreesII {

    fun generateTrees(n: Int): List<TreeNode?> {
        val list = mutableListOf<TreeNode>()

        return if (n <= 0) {
            list
        } else gen(1, n)
    }

    private fun gen(start: Int, end: Int): List<TreeNode?> {
        val list = mutableListOf<TreeNode?>()
        if (start > end) {
            list.add(null)
            return list
        }
        if (start == end) {
            list.add(TreeNode(start))
            return list
        }

        for (i in start..end) {
            for (m in gen(start, i - 1)) {
                gen(i + 1, end).mapTo(list) {
                    TreeNode(i).apply {
                        left = m
                        right = it
                    }
                }
            }
        }

        return list
    }

    data class TreeNode(
            var `val`: Int,
            var left: TreeNode? = null,
            var right: TreeNode? = null
    )

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val u = UniqueBinarySearchTreesII()

            // Expected:
            // null
            println(u.generateTrees(0))

            // Expected:
            // 1
            println(u.generateTrees(1))

            // Expected:
            // 2  1
            // /   \
            //1    2
            println(u.generateTrees(2))

            // Expected:
            // 1       3     3      2      1
            // \      /     /      / \      \
            // 3     2     1      1  3      2
            ///    /       \                \
            //2   1        2                 3
            println(u.generateTrees(3))
        }
    }

}
