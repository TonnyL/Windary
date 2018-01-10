/**
 * Divide two integers without using multiplication, division and mod operator.
 *
 * If it is overflow, return MAX_INT.
 *
 * Accepted.
 */
class DivideTwoIntegers {

    fun divide(dividend: Int, divisor: Int): Int {
        var longDividend = Math.abs(dividend.toLong())
        val longDivisor = Math.abs(divisor.toLong())
        var result: Long = 0

        while (longDividend >= longDivisor) {
            var tmpDivisor = longDivisor
            var i = 0

            while (tmpDivisor <= longDividend) {
                longDividend -= tmpDivisor
                tmpDivisor = tmpDivisor shl 1
                result += (1 shl i).toLong()
                i++
            }

        }

        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            result = -result
        }

        return if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) Integer.MAX_VALUE else result.toInt()
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val d = DivideTwoIntegers()

            // Expected: 1
            println(d.divide(1, 1))

            // Expected: 0
            println(d.divide(0, 1))

            // Expected: 1
            println(d.divide(-1, -1))

            // Expected: 2147483647
            println(d.divide(Int.MAX_VALUE, 1))

            // Expected: 0
            println(d.divide(Int.MAX_VALUE, Int.MIN_VALUE))

            // Expected: 2147483647
            println(d.divide(Int.MIN_VALUE, -1))

            // Expected: 16
            println(d.divide(100, 6))
        }
    }

}
