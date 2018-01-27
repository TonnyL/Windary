import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SearchA2DMatrixTest {

    @Test
    fun testSearchMatrix() {
        val s = SearchA2DMatrix()

        assertFalse(s.searchMatrix(arrayOf(), 0))

        assertFalse(s.searchMatrix(arrayOf(intArrayOf()), 1))

        assertTrue(s.searchMatrix(arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 50)), 3))

        assertTrue(s.searchMatrix(arrayOf(intArrayOf(1)), 1))
    }

}