import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * For example,
 * Given the following matrix:
 * <p>
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 * <p>
 * Accepted.
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        int capacity = matrix.length * matrix[0].length;
        List<Integer> result = new ArrayList<>(capacity);
        boolean[][] added = new boolean[matrix.length][matrix[0].length];

        if (matrix.length == 1) {
            for (int i : matrix[0]) {
                result.add(i);
            }
            return result;
        }

        if (matrix[0].length == 1) {
            for (int[] ints : matrix) {
                result.add(ints[0]);
            }
            return result;
        }

        int centerX = matrix.length % 2 == 0 ? (matrix.length - 1) / 2 : matrix.length / 2;
        int centerY = matrix[0].length % 2 == 0 ? (matrix[0].length - 1) / 2 : matrix[0].length / 2;
        int i = 0, j = 0, depth = 0;
        while (i <= centerX && j <= centerY && depth <= centerX && depth <= centerY) {
            for (j = depth, i = depth; j < matrix[0].length - depth; j++) {
                if (!added[i][j]) {
                    result.add(matrix[i][j]);
                    added[i][j] = true;
                }
            }

            for (j--, i++; i < matrix.length - depth; i++) {
                if (!added[i][j]) {
                    result.add(matrix[i][j]);
                    added[i][j] = true;
                }
            }

            for (i--, j--; j >= depth; j--) {
                if (!added[i][j]) {
                    result.add(matrix[i][j]);
                    added[i][j] = true;
                }
            }

            for (j++, i--; i > depth; i--) {
                if (!added[i][j]) {
                    result.add(matrix[i][j]);
                    added[i][j] = true;
                }
            }

            depth++;
        }
        return result;
    }

}
