/**
 * matrix robot is located at the top-left corner of matrix m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
 * corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * <p>
 * Note: m and n will be at most 100.
 * <p>
 * Accepted.
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            matrix[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }

        return matrix[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePaths up = new UniquePaths();

        // Expected: 1
        System.out.println(up.uniquePaths(1, 1));
        // Expected: 1
        System.out.println(up.uniquePaths(1, 2));
        // Expected: 2
        // The matrix:
        // 1 1
        // 1 2(result)
        System.out.println(up.uniquePaths(2, 2));
        // Expected: 20
        // The matrix:
        // 1 1 1 1
        // 1 2 3 4
        // 1 3 6 10
        // 1 4 10 20(result)
        System.out.println(up.uniquePaths(4, 4));
    }

}
