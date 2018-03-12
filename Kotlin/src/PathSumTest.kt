import org.junit.Assert
import org.junit.Test

class PathSumTest {

    @Test
    fun hasPathSum() {
        val ps = PathSum()

        Assert.assertFalse(ps.hasPathSum(null, 1))

        Assert.assertTrue(ps.hasPathSum(PathSum.TreeNode(1), 1))

        val node = PathSum.TreeNode(5).apply {
            left = PathSum.TreeNode(4).apply {
                left = PathSum.TreeNode(11).apply {
                    left = PathSum.TreeNode(7)
                    right = PathSum.TreeNode(2)
                }
            }
            right = PathSum.TreeNode(8).apply {
                left = PathSum.TreeNode(13)
                right = PathSum.TreeNode(4).apply {
                    right = PathSum.TreeNode(1)
                }
            }
        }

        Assert.assertTrue(ps.hasPathSum(node, 22))
    }

}