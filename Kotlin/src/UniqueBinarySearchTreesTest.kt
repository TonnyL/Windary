import org.junit.Test

class UniqueBinarySearchTreesTest {

    @Test
    fun testNumTrees() {
        val u = UniqueBinarySearchTrees()

        assert(u.numTrees(0) == 1)

        assert(u.numTrees(1) == 1)

        assert(u.numTrees(2) == 2)

        assert(u.numTrees(3) == 5)

        assert(u.numTrees(4) == 14)
    }

}