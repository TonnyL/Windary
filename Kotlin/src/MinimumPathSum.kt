/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example 1:
 * [[1,3,1],
 * [1,5,1],
 * [4,2,1]]
 * Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
 */
class MinimumPathSum {

    fun minPathSum(grid: Array<IntArray>): Int {
        if (grid.isEmpty()) return 0
        if (grid.size == 1) {
            if (grid[0].isEmpty()) return 0
            if (grid[0].size == 1) return grid[0][0]
        }

        val matrix = Array(grid.size) { IntArray(grid[0].size) }
        matrix[0][0] = grid[0][0]

        for (i in 1 until grid.size) {
            matrix[i][0] = matrix[i - 1][0] + grid[i][0]
        }

        for (i in 1 until grid[0].size) {
            matrix[0][i] = matrix[0][i - 1] + grid[0][i]
        }

        for (i in 1 until grid.size) {
            for (j in 1 until grid[0].size) {
                matrix[i][j] = Math.min(matrix[i - 1][j] + grid[i][j], matrix[i][j - 1] + grid[i][j])
            }
        }

        return matrix[grid.size - 1][grid[0].size - 1]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mps = MinimumPathSum()

            // Expected: 0
            println(mps.minPathSum(arrayOf<IntArray>()))
            // Expected: 0
            println(mps.minPathSum(arrayOf(intArrayOf())))
            // Expected: 1
            println(mps.minPathSum(arrayOf(intArrayOf(1))))
            // Expected: 7
            // The matrix:
            // 1 4 5
            // 2 7 6
            // 6 8 7
            println(mps.minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))))
            // Expected: 5
            // The matrix:
            // 1 2 3
            // 2 4 4
            // 3 6 5
            println(mps.minPathSum(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 2, 1), intArrayOf(1, 3, 1))))
        }

    }

}