import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SearchInRotatedSortedArrayIITest {

    @Test
    fun testSearch() {
        val s = SearchInRotatedSortedArrayII()

        assertFalse(s.search(intArrayOf(3, 2), 4))

        assertFalse(s.search(intArrayOf(3, 1, 2), 4))

        assertTrue(s.search(intArrayOf(3, 1, 2), 2))

        assertTrue(s.search(intArrayOf(2, 2, 2, 2, 3, 4, 1, 1), 4))

        assertTrue(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 2))

        assertTrue(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 7))

        assertTrue(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 5))
    }

}