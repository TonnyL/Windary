import org.junit.Test

class UniquePathsIITest {

    @Test
    fun testUniquePathsWithObstacles() {
        val up = UniquePathsII()

        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0, 0))) == 1)

        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0, 1, 0))) == 0)

        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(1), intArrayOf(0))) == 0)

        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0), intArrayOf(1))) == 0)

        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(0, 0))) == 0)

        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0), intArrayOf(0))) == 1)
        // Expected: 2
        // The matrix:
        // 1 1 1
        // 1 0 1
        // 1 1 2
        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))) == 2)
        // Expected: 8
        // 1 1 1 1
        // 1 0 1 2
        // 1 1 2 4
        // 1 2 4 8
        assert(up.uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))) == 8)
    }

}