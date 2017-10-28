/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>?): String {
        if (strs == null || strs.isEmpty()) {
            return ""
        }

        if (strs.size == 1) {
            return strs[0]
        }

        for (i in 0 until strs[0].length) {
            (1 until strs.size)
                    .filter { i == strs[it].length || strs[0][i] != strs[it][i] }
                    .forEach { return strs[0].substring(0, i) }
        }
        return strs[0]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val lcp = LongestCommonPrefix()
            // Expected: "" (empty)
            println(lcp.longestCommonPrefix(arrayOf()))
            // Expected: abc
            println(lcp.longestCommonPrefix(arrayOf("abc")))
            // Expected: abc
            println(lcp.longestCommonPrefix(arrayOf("abcf", "abcd", "abcdefg")))
            // Expected: a
            println(lcp.longestCommonPrefix(arrayOf("aa", "a")))
        }
    }

}