/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * Accepted.
 */
class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        var flag = false
        digits[digits.size - 1]++

        for (i in digits.indices.reversed()) {
            if (flag) digits[i]++
            if (digits[i] >= 10) {
                flag = true
                digits[i] %= 10
            } else {
                flag = false
            }
        }

        if (flag) {
            val result = IntArray(digits.size + 1)
            result[0] = 1
            System.arraycopy(digits, 0, result, 1, digits.size)
            return result
        }

        return digits
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val po = PlusOne()

            // Expected: {2}
            po.plusOne(intArrayOf(1))
                    .forEach { print("$it ") }
            println()
            // Expected: {1, 0}
            po.plusOne(intArrayOf(9))
                    .forEach { print("$it ") }
            println()
            // Expected: {1, 0, 0}
            po.plusOne(intArrayOf(9, 9))
                    .forEach { print("$it ") }
            println()
            // Expected: {2, 9, 0, 0, 0}
            po.plusOne(intArrayOf(2, 8, 9, 9, 9))
                    .forEach { print("$it ") }
            println()
            // Expected: {2, 8, 9, 0}
            po.plusOne(intArrayOf(2, 8, 8, 9))
                    .forEach { print("$it ") }
            println()
        }
    }

}