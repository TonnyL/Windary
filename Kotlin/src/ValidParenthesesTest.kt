import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidParenthesesTest {

    @Test
    fun testIsValid() {
        val vp = ValidParentheses()

        assertTrue(vp.isValid("()"))

        assertTrue(vp.isValid("()[]{}"))

        assertFalse(vp.isValid("("))

        assertFalse(vp.isValid("(]"))

        assertFalse(vp.isValid("([)]"))
    }

}