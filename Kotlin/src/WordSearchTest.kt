import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordSearchTest {

    @Test
    fun testExist() {
        val ws = WordSearch()

        // Expected: false
        assertFalse(ws.exist(arrayOf(charArrayOf()), "AB"))

        val chars = arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E'))

        assertTrue(ws.exist(chars, "ABCCED"))

        assertTrue(ws.exist(chars, "SEE"))

        assertFalse(ws.exist(chars, "ABCB"))
    }

}