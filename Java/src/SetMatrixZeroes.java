import java.util.HashSet;
import java.util.Set;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * <p>
 * Accepted.
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        Set<Integer> row = new HashSet<>(matrix.length);
        Set<Integer> column = new HashSet<>(matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        for (int i : row) {
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i][k] = 0;
            }
        }

        for (int i : column) {
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][i] = 0;
            }
        }

        // System.out.println(Arrays.deepToString(matrix));
    }

}
