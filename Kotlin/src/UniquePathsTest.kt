import org.junit.Test

class UniquePathsTest {

    @Test
    fun testUniquePaths() {
        val up = UniquePaths()

        assert(up.uniquePaths(1, 1) == 1)

        assert(up.uniquePaths(1, 2) == 1)

        assert(up.uniquePaths(2, 2) == 2)

        assert(up.uniquePaths(4, 4) == 20)
    }

}