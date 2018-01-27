import org.junit.Test
import kotlin.test.assertFalse

class PalindromeNumberTest {

    @Test
    fun testIsPalindrome() {
        val pn = PalindromeNumber()

        assertFalse(pn.isPalindrome(-1))

        assert(pn.isPalindrome(1))

        assert(pn.isPalindrome(121))

        assert(pn.isPalindrome(1001))

        assertFalse(pn.isPalindrome(1000021))
    }

}