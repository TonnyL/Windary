/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Result: Accepted
 */
class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        val resultBuilder = StringBuilder()
        val tmpBuilder = StringBuilder()
        val inputChars = s.toCharArray()

        for (i in inputChars.indices) {
            if (tmpBuilder.toString().contains(inputChars[i].toString())) {
                val s1 = tmpBuilder.toString().substring(tmpBuilder.toString().lastIndexOf(inputChars[i]) + 1)
                tmpBuilder.delete(0, tmpBuilder.length)
                tmpBuilder.append(s1)
            }
            tmpBuilder.append(inputChars[i])

            if (tmpBuilder.length > resultBuilder.length) {
                resultBuilder.delete(0, resultBuilder.length)
                resultBuilder.append(tmpBuilder)
            }
        }

        return resultBuilder.toString().length
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ls = LongestSubstringWithoutRepeatingCharacters()
            // Expected: 3
            // wke, length = 3
            println(ls.lengthOfLongestSubstring("pwwkew"))
            // Expected:
            // b, length = 1
            println(ls.lengthOfLongestSubstring("bbbbbb"))
            // Expected:
            // abc, length = 3
            println(ls.lengthOfLongestSubstring("abcabcbb"))
            // Expected:
            // vdf, length = 3
            println(ls.lengthOfLongestSubstring("dvdf"))
        }
    }

}