import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateBinarySearchTreeTest {

    @Test
    fun testIsValidBST() {
        val v = ValidateBinarySearchTree()

        assertTrue(v.isValidBST(null))

        assertTrue(v.isValidBST(ValidateBinarySearchTree.TreeNode(2).apply {
            left = ValidateBinarySearchTree.TreeNode(1)
            right = ValidateBinarySearchTree.TreeNode(3)
        }))

        assertTrue(v.isValidBST(ValidateBinarySearchTree.TreeNode(1)))

        assertFalse(v.isValidBST(ValidateBinarySearchTree.TreeNode(1).apply {
            left = ValidateBinarySearchTree.TreeNode(2)
            right = ValidateBinarySearchTree.TreeNode(3)
        }))

        assertTrue(v.isValidBST(ValidateBinarySearchTree.TreeNode(3).apply {
            left = ValidateBinarySearchTree.TreeNode(2).apply {
                left = ValidateBinarySearchTree.TreeNode(1)
            }
        }))

        assertFalse(v.isValidBST(ValidateBinarySearchTree.TreeNode(1).apply {
            right = ValidateBinarySearchTree.TreeNode(0)
        }))

        assertTrue(v.isValidBST(ValidateBinarySearchTree.TreeNode(0).apply {
            left = ValidateBinarySearchTree.TreeNode(-1)
        }))
    }

}