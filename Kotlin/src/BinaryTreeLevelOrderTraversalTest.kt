import org.junit.Assert
import org.junit.Test

class BinaryTreeLevelOrderTraversalTest {

    @Test
    fun testLevelOrder() {
        val b = BinaryTreeLevelOrderTraversal()

        Assert.assertTrue(b.levelOrder(null).isEmpty())

        val node0 = BinaryTreeLevelOrderTraversal.TreeNode(1)
        Assert.assertEquals(b.levelOrder(node0), listOf(listOf(1)))

        val node1 = BinaryTreeLevelOrderTraversal.TreeNode(3).apply {
            left = BinaryTreeLevelOrderTraversal.TreeNode(9)
            right = BinaryTreeLevelOrderTraversal.TreeNode(20).apply {
                left = BinaryTreeLevelOrderTraversal.TreeNode(15)
                right = BinaryTreeLevelOrderTraversal.TreeNode(7)
            }
        }

        Assert.assertEquals(b.levelOrder(node1), listOf(listOf(3), listOf(9, 20), listOf(15, 7)))
    }

}