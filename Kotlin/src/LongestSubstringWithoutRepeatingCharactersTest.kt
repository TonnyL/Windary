import org.junit.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun testLengthOfLongestSubstring() {
        val ls = LongestSubstringWithoutRepeatingCharacters()

        assert(ls.lengthOfLongestSubstring("pwwkew") == 3)

        assert(ls.lengthOfLongestSubstring("bbbbbb") == 1)

        assert(ls.lengthOfLongestSubstring("abcabcbb") == 3)

        assert(ls.lengthOfLongestSubstring("dvdf") == 3)
    }

}