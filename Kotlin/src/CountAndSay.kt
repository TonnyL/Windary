/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 *
 * Accepted.
 */
class CountAndSay {

    fun countAndSay(n: Int): String {
        if (n <= 0) return "0"
        if (n == 1) return "1"

        val sb = StringBuilder()
        val chars = countAndSay(n - 1).toCharArray()
        var i = 0
        while (i < chars.size - 1) {
            var count = 1
            while (i + 1 < chars.size && chars[i] == chars[i + 1]) {
                count++
                i++
            }

            sb.append(count)
            sb.append(chars[i])
            i++
        }

        if (chars.size - 2 >= 0 && chars[chars.size - 1] == chars[chars.size - 2]) {
            sb.replace(sb.length - 2, sb.length - 1, Integer.valueOf(sb.substring(sb.length - 2, sb.length - 1)).toString())
        } else {
            sb.append(chars[chars.size - 1])
            sb.append("1")
        }

        return sb.toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cas = CountAndSay()

            // Expected: 1
            println(cas.countAndSay(1))
            // Expected: 11
            println(cas.countAndSay(2))
            // Expected: 21
            println(cas.countAndSay(3))
            // Expected: 1211
            println(cas.countAndSay(4))
            // Expected: 111221
            println(cas.countAndSay(5))
            // Expected: 312211
            println(cas.countAndSay(6))
        }
    }

}
