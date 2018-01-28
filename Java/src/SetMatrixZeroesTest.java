import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SetMatrixZeroesTest {

    @Test
    public void testSetZeroes() {
        SetMatrixZeroes smz = new SetMatrixZeroes();

        int[][] array0 = new int[][]{};
        smz.setZeroes(array0);
        Assert.assertTrue(Arrays.deepEquals(array0, new int[][]{}));

        int[][] array1 = new int[][]{{0, 1}};
        smz.setZeroes(array1);
        Assert.assertTrue(Arrays.deepEquals(array1, new int[][]{{0, 0}}));

        int[][] array2 = new int[][]{{1, 0, 2}, {3, 4, 5}, {6, 7, 8}};
        smz.setZeroes(array2);
        Assert.assertTrue(Arrays.deepEquals(array2, new int[][]{{0, 0, 0}, {3, 0, 5}, {6, 0, 8}}));

        int[][] array3 = new int[][]{{0, 1, 1}, {2, 0, 2}, {3, 3, 0}};
        smz.setZeroes(array3);
        Assert.assertTrue(Arrays.deepEquals(array3, new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));

        int[][] array4 = new int[][]{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}};
        smz.setZeroes(array4);
        Assert.assertTrue(Arrays.deepEquals(array4, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 0, 0}, {0, 0, 0, 3}, {0, 0, 0, 0}}));
    }

}