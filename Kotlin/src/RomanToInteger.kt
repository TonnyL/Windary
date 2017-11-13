/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * Accepted.
 */
class RomanToInteger {

    fun romanToInt(s: String): Int {
        val dict = mapOf(
                Pair('I', 1),
                Pair('V', 5),
                Pair('X', 10),
                Pair('L', 50),
                Pair('C', 100),
                Pair('D', 500),
                Pair('M', 1000))

        val chars = s.toCharArray()
        var result = 0
        var i = 0
        while (i < chars.size) {
            if (i + 1 < chars.size
                    && (dict[chars[i + 1]]!! > dict[chars[i]]!!)
                    && (chars[i] == 'I' || chars[i] == 'X' || chars[i] == 'C')) {
                result += dict[chars[i + 1]]!! - dict[chars[i]]!!

                i++
            } else {
                result += dict[chars[i]]!!
            }
            i++
        }

        return result
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val rtt = RomanToInteger()
            // Expected: 621 = 500 + 100 + 10 + 10 +1
            println(rtt.romanToInt("DCXXI"))
            // Expected: 1996 = 1000 - (100 - 1000) - (10 - 100) + 5 + 1
            println(rtt.romanToInt("MCMXCVI"))
            // Expected: 999 = - (100 - 1000) - (10 - 100) - (1 - 10)
            println(rtt.romanToInt("CMXCIX"))
        }
    }

}