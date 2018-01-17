import java.util.Arrays;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * <p>
 * Consider the following matrix:
 * <p>
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * <p>
 * Accepted.
 */
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][0] == target || matrix[i + 1][0] == target) {
                return true;
            } else if (matrix[i][0] < target && matrix[i + 1][0] > target) {
                return Arrays.binarySearch(matrix[i], target) >= 0;
            }
        }

        return Arrays.binarySearch(matrix[matrix.length - 1], target) >= 0;
    }

    public static void main(String[] args) {
        SearchA2DMatrix s = new SearchA2DMatrix();

        // Expected: false
        System.out.println(s.searchMatrix(new int[][]{}, 0));

        // Expected: false
        System.out.println(s.searchMatrix(new int[][]{{}}, 1));

        // Expected: true
        System.out.println(s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));

        // Expected: true
        System.out.println(s.searchMatrix(new int[][]{{1}}, 1));
    }

}
