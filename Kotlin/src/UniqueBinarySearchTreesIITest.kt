import org.junit.Test

class UniqueBinarySearchTreesIITest {

    @Test
    fun testGenerateTrees() {
        val u = UniqueBinarySearchTreesII()

        assert(u.generateTrees(0).isEmpty())

        assert(u.generateTrees(1) == listOf(UniqueBinarySearchTreesII.TreeNode(1)))

        // Expected:
        // 2  1
        // /   \
        //1    2
        assert(u.generateTrees(2).toSet() == setOf(
                UniqueBinarySearchTreesII.TreeNode(2).apply {
                    left = UniqueBinarySearchTreesII.TreeNode(1)
                },
                UniqueBinarySearchTreesII.TreeNode(1).apply {
                    right = UniqueBinarySearchTreesII.TreeNode(2)
                }
        ))

        // Expected:
        // 1       3     3      2      1
        // \      /     /      / \      \
        // 3     2     1      1  3      2
        ///    /       \                \
        //2   1        2                 3
        assert(u.generateTrees(3).toSet() == setOf(
                UniqueBinarySearchTreesII.TreeNode(1).apply {
                    right = UniqueBinarySearchTreesII.TreeNode(3).apply {
                        left = UniqueBinarySearchTreesII.TreeNode(2)
                    }
                },
                UniqueBinarySearchTreesII.TreeNode(3).apply {
                    left = UniqueBinarySearchTreesII.TreeNode(2).apply {
                        left = UniqueBinarySearchTreesII.TreeNode(1)
                    }
                },
                UniqueBinarySearchTreesII.TreeNode(3).apply {
                    left = UniqueBinarySearchTreesII.TreeNode(1).apply {
                        right = UniqueBinarySearchTreesII.TreeNode(2)
                    }
                },
                UniqueBinarySearchTreesII.TreeNode(2).apply {
                    left = UniqueBinarySearchTreesII.TreeNode(1)
                    right = UniqueBinarySearchTreesII.TreeNode(3)
                },
                UniqueBinarySearchTreesII.TreeNode(1).apply {
                    right = UniqueBinarySearchTreesII.TreeNode(2).apply {
                        right = UniqueBinarySearchTreesII.TreeNode(3)
                    }
                }
        ))
    }

}