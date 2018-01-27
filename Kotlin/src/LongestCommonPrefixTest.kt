import org.junit.Test

class LongestCommonPrefixTest {

    @Test
    fun testLongestCommonPrefix() {
        val lcp = LongestCommonPrefix()

        assert(lcp.longestCommonPrefix(arrayOf()).isEmpty())

        assert(lcp.longestCommonPrefix(arrayOf("abc")) == "abc")

        assert(lcp.longestCommonPrefix(arrayOf("abcf", "abcd", "abcdefg")) == "abc")

        assert(lcp.longestCommonPrefix(arrayOf("aa", "a")) == "a")
    }

}