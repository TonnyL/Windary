import org.junit.Test

class LengthOfLastWordTest {

    @Test
    fun testLengthOfLastWord() {
        val llw = LengthOfLastWord()

        assert(llw.lengthOfLastWord("Hello World") == 5)

        assert(llw.lengthOfLastWord(" ") == 0)

        assert(llw.lengthOfLastWord("a") == 1)

        assert(llw.lengthOfLastWord("a ") == 1)
    }

}