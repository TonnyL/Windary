/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
 *
 * Note:
 *
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * Accepted.
 */
class MultiplyStrings {

    fun multiply(num1: String, num2: String): String {
        val ints = IntArray(num1.length + num2.length)
        for (i in num1.length - 1 downTo 0) {
            for (j in num2.length - 1 downTo 0) {
                ints[num1.length - i - 1 + (num2.length - j - 1)] += (num1[i] - '0') * (num2[j] - '0')
            }
        }

        val sb = StringBuilder()
        for (i in ints.indices) {
            val digit = ints[i] % 10
            val carry = ints[i] / 10
            sb.insert(0, digit)
            if (i < ints.size - 1) {
                ints[i + 1] += carry
            }
        }

        while (sb.isNotEmpty() && sb[0] == '0') {
            sb.deleteCharAt(0)
        }

        return if (sb.isEmpty()) "0" else sb.toString()
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val ms = MultiplyStrings()

            println(ms.multiply("", "") == "0")

            println(ms.multiply("0", "0") == "0")

            println(ms.multiply("100", "1") == "100")

            println(ms.multiply("123", "45") == "5535")

            println(ms.multiply("99", "99") == "9801")

            println(ms.multiply("123", "123") == "15129")

            println(ms.multiply("123456789", "123456789") == "15241578750190521")
        }
    }

}
