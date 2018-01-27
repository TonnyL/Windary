import org.junit.Test

class SearchInsertPositionTest {

    @Test
    fun testSearchInsert() {
        val sip = SearchInsertPosition()

        assert(sip.searchInsert(intArrayOf(1), 0) == 0)

        assert(sip.searchInsert(intArrayOf(1, 3, 5, 6), 5) == 2)

        assert(sip.searchInsert(intArrayOf(1, 3, 5, 6), 2) == 1)

        assert(sip.searchInsert(intArrayOf(1, 3, 5, 6), 7) == 4)

        assert(sip.searchInsert(intArrayOf(1, 3, 5, 6), 0) == 0)
    }

}