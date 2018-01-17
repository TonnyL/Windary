/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example,
 * Given s = "Hello World",
 * return 5.
 *
 * Accepted.
 */
class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        val strs = s.split(" ".toRegex())
                .dropLastWhile {
                    it.isEmpty()
                }
                .toTypedArray()

        return if (strs.isEmpty()) 0 else strs[strs.size - 1].length
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val llw = LengthOfLastWord()
            // Expected: 5
            println(llw.lengthOfLastWord("Hello World"))
            // Expected: 0
            println(llw.lengthOfLastWord(" "))
            // Expected: 1
            println(llw.lengthOfLastWord("a"))
            // Expected: 1
            println(llw.lengthOfLastWord("a "))
        }
    }

}