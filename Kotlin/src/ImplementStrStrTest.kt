import org.junit.Test

class ImplementStrStrTest {

    @Test
    fun testStrStr() {
        val iss = ImplementStrStr()

        assert(iss.strStr("aaab", "b") == 3)

        assert(iss.strStr("", "") == 0)

        assert(iss.strStr("", "a") == -1)

        assert(iss.strStr("whats up", "s ") == 4)
    }

}