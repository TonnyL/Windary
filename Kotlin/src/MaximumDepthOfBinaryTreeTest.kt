import org.junit.Assert
import org.junit.Test

class MaximumDepthOfBinaryTreeTest {

    @Test
    fun maxDepth() {
        val m = MaximumDepthOfBinaryTree()

        Assert.assertTrue(m.maxDepth(null) == 0)

        val node0 = MaximumDepthOfBinaryTree.TreeNode(3).apply {
            left = MaximumDepthOfBinaryTree.TreeNode(9)
            right = MaximumDepthOfBinaryTree.TreeNode(20).apply {
                left = MaximumDepthOfBinaryTree.TreeNode(15)
                right = MaximumDepthOfBinaryTree.TreeNode(7)
            }
        }
        Assert.assertTrue(m.maxDepth(node0) == 3)

        val node1 = MaximumDepthOfBinaryTree.TreeNode(1).apply {
            left = MaximumDepthOfBinaryTree.TreeNode(2).apply {
                left = MaximumDepthOfBinaryTree.TreeNode(3).apply {
                    left = MaximumDepthOfBinaryTree.TreeNode(4)
                }
            }
        }
        Assert.assertTrue(m.maxDepth(node1) == 4)
    }

}