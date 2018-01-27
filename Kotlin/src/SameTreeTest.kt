import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SameTreeTest {

    @Test
    fun testIsSameTree() {
        val st = SameTree()

        assertTrue(st.isSameTree(null, null))

        val tn1 = SameTree.TreeNode(1)

        assertFalse(st.isSameTree(null, tn1))
        assertFalse(st.isSameTree(tn1, null))

        assertFalse(st.isSameTree(tn1, SameTree.TreeNode(2)))

        assertTrue(st.isSameTree(
                SameTree.TreeNode(1).apply {
                    left = SameTree.TreeNode(1)
                    right = SameTree.TreeNode(1)
                },
                SameTree.TreeNode(1).apply {
                    left = SameTree.TreeNode(1)
                    right = SameTree.TreeNode(1)
                })
        )
    }

}