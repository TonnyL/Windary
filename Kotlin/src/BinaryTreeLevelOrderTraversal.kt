/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9 20
 * /\
 * 15 7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 * Accepted.
 */

class BinaryTreeLevelOrderTraversal {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val lists = mutableListOf<MutableList<Int>>()
        helper(lists, root, 0)
        return lists
    }

    private fun helper(res: MutableList<MutableList<Int>>, node: TreeNode?, height: Int) {
        if (node == null) {
            return
        }
        if (height >= res.size) {
            res.add(mutableListOf())
        }
        res[height].add(node.`val`)
        helper(res, node.left, height + 1)
        helper(res, node.right, height + 1)
    }

    data class TreeNode(

            var `val`: Int,
            var left: TreeNode? = null,
            var right: TreeNode? = null

    )

}
