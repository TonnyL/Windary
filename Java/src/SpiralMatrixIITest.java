import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SpiralMatrixIITest {

    @Test
    public void testGenerateMatrix() {
        SpiralMatrixII sm = new SpiralMatrixII();

        Assert.assertTrue(Arrays.deepEquals(sm.generateMatrix(0),
                new int[][]{}));

        Assert.assertTrue(Arrays.deepEquals(sm.generateMatrix(1),
                new int[][]{{1}}));

        Assert.assertTrue(Arrays.deepEquals(sm.generateMatrix(2),
                new int[][]{{1, 2}, {4, 3}}));

        Assert.assertTrue(Arrays.deepEquals(sm.generateMatrix(4),
                new int[][]{{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}}));
    }

}