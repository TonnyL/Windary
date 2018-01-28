/**
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * <p>
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * <code>
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * </code>
 * The total number of unique paths is 2.
 * <p>
 * Note: m and n will be at most 100.
 * <p>
 * Accepted.
 */
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        if (obstacleGrid.length == 1) {
            for (int i : obstacleGrid[0]) {
                if (i == 1) {
                    return 0;
                }
            }
            return 1;
        }

        int[][] matrix = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                for (int j = i; j < obstacleGrid.length; j++) {
                    matrix[j][0] = 0;
                }
                break;
            } else {
                matrix[i][0] = 1;
            }
        }

        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                for (int j = i; j < obstacleGrid[0].length; j++) {
                    matrix[0][i] = 0;
                }
                break;
            } else {
                matrix[0][i] = 1;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = obstacleGrid[i][j] == 1 ? 0 : (matrix[i - 1][j] + matrix[i][j - 1]);
            }
        }

        return matrix[matrix.length - 1][matrix[0].length - 1];
    }

}
