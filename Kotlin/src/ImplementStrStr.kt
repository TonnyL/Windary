/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Accepted.
 */
class ImplementStrStr {

    fun strStr(haystack: String, needle: String): Int {
        if (needle.length > haystack.length) return -1
        if (haystack.isEmpty() || needle.isEmpty()) return 0

        return (0..haystack.length - needle.length).firstOrNull { haystack.substring(it, it + needle.length) == needle } ?: -1
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val iss = ImplementStrStr()
            // Expected: 3
            println(iss.strStr("aaab", "b"))
            // Expected: 0
            println(iss.strStr("", ""))
            // Expected: -1
            println(iss.strStr("", "a"))
            // Expected: 4
            println(iss.strStr("whats up", "s "))
        }
    }

}