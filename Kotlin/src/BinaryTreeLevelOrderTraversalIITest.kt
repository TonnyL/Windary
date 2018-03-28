import org.junit.Assert
import org.junit.Test

class BinaryTreeLevelOrderTraversalIITest {

    @Test
    fun testLevelOrderBottom() {
        val b = BinaryTreeLevelOrderTraversalII()

        Assert.assertTrue(b.levelOrderBottom(null).isEmpty())

        val node0 = BinaryTreeLevelOrderTraversalII.TreeNode(1)
        Assert.assertEquals(b.levelOrderBottom(node0), listOf(listOf(1)))

        val node1 = BinaryTreeLevelOrderTraversalII.TreeNode(3).apply {
            left = BinaryTreeLevelOrderTraversalII.TreeNode(9)
            right = BinaryTreeLevelOrderTraversalII.TreeNode(20).apply {
                left = BinaryTreeLevelOrderTraversalII.TreeNode(15)
                right = BinaryTreeLevelOrderTraversalII.TreeNode(7)
            }
        }

        Assert.assertEquals(b.levelOrderBottom(node1), listOf(listOf(15, 7), listOf(9, 20), listOf(3)))
    }

}