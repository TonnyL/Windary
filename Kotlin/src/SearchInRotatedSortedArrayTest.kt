import org.junit.Test

class SearchInRotatedSortedArrayTest {

    @Test
    fun testSearch() {
        val s = SearchInRotatedSortedArray()

        assert(s.search(intArrayOf(), 1) == -1)

        assert(s.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 7) == 6)

        assert(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 7) == 3)

        assert(s.search(intArrayOf(5, 6, 7, 0, 1, 2, 4), 7) == 2)

        assert(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 8) == -1)
    }

}