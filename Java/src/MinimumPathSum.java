/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example 1:
 * [[1,3,1],
 * [1,5,1],
 * [4,2,1]]
 * Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
 * <p>
 * Accepted.
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        if (grid.length == 1) {
            if (grid[0].length == 0) {
                return 0;
            }
            if (grid[0].length == 1) {
                return grid[0][0];
            }
        }

        int[][] matrix = new int[grid.length][grid[0].length];
        matrix[0][0] = grid[0][0];

        for (int i = 1; i < grid.length; i++) {
            matrix[i][0] = matrix[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < grid[0].length; i++) {
            matrix[0][i] = matrix[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                matrix[i][j] = Math.min(matrix[i - 1][j] + grid[i][j], matrix[i][j - 1] + grid[i][j]);
            }
        }

        return matrix[grid.length - 1][grid[0].length - 1];
    }

}
