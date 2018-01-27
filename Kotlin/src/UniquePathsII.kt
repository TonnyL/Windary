/**
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 *
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * ```
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * ```
 * The total number of unique paths is 2.
 *
 * Note: m and n will be at most 100.
 *
 * Accepted.
 */
class UniquePathsII {

    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        if (obstacleGrid[0][0] == 1) {
            return 0
        }
        if (obstacleGrid.size == 1) {
            return if (obstacleGrid[0].contains(1)) 0 else 1
        }

        val matrix = Array(obstacleGrid.size) { IntArray(obstacleGrid[0].size, { 0 }) }

        obstacleGrid.indices
                .takeWhile {
                    obstacleGrid[it][0] != 1
                }
                .forEach {
                    matrix[it][0] = 1
                }

        (0 until obstacleGrid[0].size)
                .takeWhile {
                    obstacleGrid[0][it] != 1
                }
                .forEach {
                    matrix[0][it] = if (obstacleGrid[0][it] == 1) 0 else 1
                }

        for (i in 1 until matrix.size) {
            for (j in 1 until matrix[0].size) {
                matrix[i][j] = if (obstacleGrid[i][j] == 1) 0 else matrix[i - 1][j] + matrix[i][j - 1]
            }
        }

        return matrix[matrix.size - 1][matrix[0].size - 1]
    }

}
