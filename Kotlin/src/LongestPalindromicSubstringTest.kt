import org.junit.Test

class LongestPalindromicSubstringTest {

    @Test
    fun testLongestPalindrome() {
        val l = LongestPalindromicSubstring()

        val s0 = l.longestPalindrome("babad")
        assert(s0 == "bab" || s0 == "aba")

        assert(l.longestPalindrome("cbbd") == "bb")

        assert(l.longestPalindrome("babaddtattarrattatddetartrateedredividerb") == "ddtattarrattatdd")
    }

}