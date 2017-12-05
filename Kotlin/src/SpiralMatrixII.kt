import java.util.*

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 * For example,
 * Given n = 3,
 *
 * You should return the following matrix:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 *
 * Accepted.
 */
class SpiralMatrixII {

    fun generateMatrix(n: Int): Array<IntArray> {
        if (n <= 0) return arrayOf()
        if (n == 1) return arrayOf(intArrayOf(1))

        val matrix = Array(n) { IntArray(n) }
        val centerX = if (n % 2 == 0) (n - 1) / 2 else n / 2
        val centerY = if (n % 2 == 0) (n - 1) / 2 else n / 2
        var i = 0
        var j = 0
        var depth = 0
        var result = 1
        while (i <= centerX && j <= centerY && depth <= centerX && depth <= centerY) {
            j = depth
            i = depth
            while (j < matrix[0].size - depth) {
                if (matrix[i][j] == 0) matrix[i][j] = result++
                j++
            }
            j--

            i++
            while (i < matrix.size - depth) {
                if (matrix[i][j] == 0) matrix[i][j] = result++
                i++
            }
            i--

            j--
            while (j >= depth) {
                if (matrix[i][j] == 0) matrix[i][j] = result++
                j--
            }
            j++

            i--
            while (i > depth) {
                if (matrix[i][j] == 0) matrix[i][j] = result++
                i--
            }

            depth++
        }

        return matrix
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sm = SpiralMatrixII()

            // Expected: []
            println("[${sm.generateMatrix(0).joinToString { "[${it.joinToString()}]" }}]")

            // Expected:
            // [
            //  [1]
            // ]
            println("[${sm.generateMatrix(1).joinToString { "[${it.joinToString()}]" }}]")

            // Expected:
            // [
            //  [1, 2],
            //  [4, 3]
            // ]
            println("[${sm.generateMatrix(2).joinToString { "[${it.joinToString()}]" }}]")

            // Expected:
            // [
            //  [1, 2, 3, 4],
            //  [12, 13, 14, 5],
            //  [11, 16, 15, 6],
            //  [10, 9, 8, 7]
            // ]
            println("[${sm.generateMatrix(4).joinToString { "[${it.joinToString()}]" }}]")
        }
    }

}