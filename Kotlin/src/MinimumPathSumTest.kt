import org.junit.Test

class MinimumPathSumTest {

    @Test
    fun testMinPathSum() {
        val mps = MinimumPathSum()

        assert(mps.minPathSum(arrayOf<IntArray>()) == 0)

        assert(mps.minPathSum(arrayOf(intArrayOf())) == 0)

        assert(mps.minPathSum(arrayOf(intArrayOf(1))) == 1)
        // Expected: 7
        // The matrix:
        // 1 4 5
        // 2 7 6
        // 6 8 7
        assert(mps.minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))) == 7)
        // Expected: 5
        // The matrix:
        // 1 2 3
        // 2 4 4
        // 3 6 5
        assert(mps.minPathSum(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 2, 1), intArrayOf(1, 3, 1))) == 5)
    }

}