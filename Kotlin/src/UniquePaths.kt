/**
 * matrix robot is located at the top-left corner of matrix m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
 * corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 *
 * Note: m and n will be at most 100.
 *
 * Accepted.
 */
class UniquePaths {

    fun uniquePaths(m: Int, n: Int): Int {
        if (m == 1 || n == 1) {
            return 1
        }

        // Init the elements of the 2d matrix with 1s
        val matrix = Array(m) { IntArray(n, { 1 }) }
        for (i in 1 until m) {
            for (j in 1 until n) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]
            }
        }

        return matrix[m - 1][n - 1]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val up = UniquePaths()

            // Expected: 1
            println(up.uniquePaths(1, 1))
            // Expected: 1
            println(up.uniquePaths(1, 2))
            // Expected: 2
            // The matrix:
            // 1 1
            // 1 2(result)
            println(up.uniquePaths(2, 2))
            // Expected: 20
            // The matrix:
            // 1 1 1 1
            // 1 2 3 4
            // 1 3 6 10
            // 1 4 10 20(result)
            println(up.uniquePaths(4, 4))
        }
    }

}