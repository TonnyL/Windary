import org.junit.Assert
import org.junit.Test

class SymmetricTreeTest {

    @Test
    fun testIsSymmetric() {
        val st = SymmetricTree()
        Assert.assertTrue(st.isSymmetric(null))

        val node0 = SymmetricTree.TreeNode(1).apply {
            left = SymmetricTree.TreeNode(2).apply {
                left = SymmetricTree.TreeNode(3)
                right = SymmetricTree.TreeNode(4)
            }
            right = SymmetricTree.TreeNode(2).apply {
                left = SymmetricTree.TreeNode(4)
                right = SymmetricTree.TreeNode(3)
            }
        }
        Assert.assertTrue(st.isSymmetric(node0))

        val node1 = SymmetricTree.TreeNode(1).apply {
            left = SymmetricTree.TreeNode(2).apply {
                right = SymmetricTree.TreeNode(3)
            }
            right = SymmetricTree.TreeNode(2).apply {
                right = SymmetricTree.TreeNode(3)
            }
        }
        Assert.assertFalse(st.isSymmetric(node1))
    }

}