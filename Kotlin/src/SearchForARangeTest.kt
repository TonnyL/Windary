import org.junit.Test

class SearchForARangeTest {

    @Test
    fun testSearchRange() {
        val sr = SearchForARange()

        // Expected: [0, 0]
        assert(sr.searchRange(intArrayOf(1), 1).contentEquals(intArrayOf(0, 0)))

        // Expected: [-1, -1]
        assert(sr.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 11).contentEquals(intArrayOf(-1, -1)))

        // Expected: [3, 4]
        assert(sr.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).contentEquals(intArrayOf(3, 4)))
    }

}