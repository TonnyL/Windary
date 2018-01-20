/**
 * Given an integer, convert it to a roman numeral.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * Accepted.
 */
class IntegerToRoman {

    fun intToRoman(num: Int): String {
        var newNum = num
        val sb = StringBuilder()
        val roman = charArrayOf('M', 'D', 'C', 'L', 'X', 'V', 'I')
        val value = intArrayOf(1000, 500, 100, 50, 10, 5, 1)

        var n = 0
        while (n < 7) {
            val x = newNum / value[n]
            when {
                x < 4 -> for (i in 1..x) {
                    sb.append(roman[n])
                }
                x == 4 -> sb.append(roman[n]).append(roman[n - 1])
                x < 9 -> {
                    sb.append(roman[n - 1])
                    for (i in 6..x) {
                        sb.append(roman[n])
                    }
                }
                x == 9 -> sb.append(roman[n]).append(roman[n - 2])
            }
            newNum %= value[n]
            n += 2
        }
        return sb.toString()
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val i = IntegerToRoman()

            // Expected: "I"
            println(i.intToRoman(1))

            // Expected: "DCXXI"
            println(i.intToRoman(621))

            // Expected: "MCMXCVI"
            println(i.intToRoman(1996))

            // Expected: "CMXCIX"
            println(i.intToRoman(999))
        }
    }

}
