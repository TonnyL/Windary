/**
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 *
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 *
 * Accepted.
 */
class StringToIntegerAtoi {

    fun myAtoi(str: String): Int {
        val s = str.trim()
        if (s.isEmpty()) {
            return 0
        }
        if (s.length == 1) {
            return if (s[0] <= '0' || s[0] >= '9') 0 else s.toInt()
        }

        val plus = s[0] == '+'
        val minus = s[0] == '-'

        var result = 0
        val startIndex = if (plus || minus) 1 else 0
        for (i in startIndex until s.length) {
            if (s[i] in '0'..'9') {
                if (Integer.MAX_VALUE / 10 - (s[i] - '0') <= result) {
                    if (minus && result * 10 + (s[i] - '0') == Integer.MAX_VALUE) {
                        return -Integer.MAX_VALUE
                    }
                    return if (minus) Integer.MIN_VALUE else Integer.MAX_VALUE
                }
                result = result * 10 + (s[i] - '0')
            } else {
                return if (minus) -result else result
            }
        }

        return if (minus) -result else result
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val atoi = StringToIntegerAtoi()

            // Expected: 0
            println(atoi.myAtoi("+-1"))

            // Expected: -123
            println(atoi.myAtoi("-00123a66"))

            // Expected: -1
            println(atoi.myAtoi("-1"))

            // Expected: 2147483647
            println(atoi.myAtoi("    10522545459"))

            // Expected: -2147483647
            println(atoi.myAtoi("-2147483647"))

            // Expected: 2147483647
            println(atoi.myAtoi("2147483648"))

            // Expected: -2147483648
            println(atoi.myAtoi("-2147483649"))

            // Expected: 2147483647
            println(atoi.myAtoi("2147483647"))
        }
    }

}