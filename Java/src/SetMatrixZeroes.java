//import java.util.Arrays;
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

//        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        SetMatrixZeroes smz = new SetMatrixZeroes();

        smz.setZeroes(new int[][]{});
        // The matrix:
        // {
        //  {0, 0}
        // }
        smz.setZeroes(new int[][]{{0, 1}});
        // The matrix:
        // {
        //  {0, 0, 0},
        //  {3, 0, 5},
        //  {6, 0, 8}
        // }
        smz.setZeroes(new int[][]{{1, 0, 2}, {3, 4, 5}, {6, 7, 8}});
        // The matrix:
        // {
        //  {0, 0, 0},
        //  {0, 0, 0},
        //  {0, 0, 0},
        // }
        smz.setZeroes(new int[][]{{0, 1, 1}, {2, 0, 2}, {3, 3, 0}});
        // The matrix:
        // {
        //  {0, 0, 0, 0},
        //  {0, 0, 0, 4},
        //  {0, 0, 0, 0},
        //  {0, 0, 0, 3},
        //  {0, 0, 0, 0}
        // }
        smz.setZeroes(new int[][]{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}});
    }

}
