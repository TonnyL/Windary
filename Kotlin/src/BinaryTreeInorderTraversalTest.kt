import org.junit.Test

class BinaryTreeInorderTraversalTest {

    @Test
    fun testInorderTraversal() {
        val b = BinaryTreeInorderTraversal()

        assert(b.inorderTraversal(null).isEmpty())

        assert(b.inorderTraversal(BinaryTreeInorderTraversal.TreeNode(1).apply {
            right = BinaryTreeInorderTraversal.TreeNode(2).apply {
                left = BinaryTreeInorderTraversal.TreeNode(3)
            }
        }) == listOf(1, 3, 2))

        assert(b.inorderTraversal(BinaryTreeInorderTraversal.TreeNode(1).apply {
            left = BinaryTreeInorderTraversal.TreeNode(2).apply {
                left = BinaryTreeInorderTraversal.TreeNode(4)
                right = BinaryTreeInorderTraversal.TreeNode(5)
            }
            right = BinaryTreeInorderTraversal.TreeNode(3).apply {
                left = BinaryTreeInorderTraversal.TreeNode(6)
                right = BinaryTreeInorderTraversal.TreeNode(7)
            }
        }) == listOf(4, 2, 5, 1, 6, 3, 7))
    }

}