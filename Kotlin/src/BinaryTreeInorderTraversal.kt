/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree [1,null,2,3],
 * 1
 * \
 * 2
 * /
 * 3
 * return [1,3,2].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 */

class BinaryTreeInorderTraversal {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        if (root == null) {
            return list
        }

        val stack = mutableListOf<TreeNode>()
        var node = root
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.add(node)
                node = node.left
            }
            node = stack[stack.size - 1]
            stack.removeAt(stack.size - 1)
            list.add(node.`val`)
            node = node.right
        }

        return list
    }

    // Recursive solution.
    /*fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()

        if (root == null) {
            return list
        }

        root.left?.let {
            list.addAll(inorderTraversal(root.left))
        }

        list.add(root.`val`)

        root.right?.let {
            list.addAll(inorderTraversal(it))
        }

        return list
    }*/

    data class TreeNode(
            var `val`: Int,
            var left: TreeNode? = null,
            var right: TreeNode? = null
    )

}
