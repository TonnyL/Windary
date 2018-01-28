import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SpiralMatrixTest {

    @Test
    public void testSpiralOrder() {
        SpiralMatrix sm = new SpiralMatrix();

        Assert.assertEquals(sm.spiralOrder(new int[][]{}), Collections.emptyList());

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1}, {2}, {3}}),
                Arrays.asList(1, 2, 3));

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1, 2, 3}}),
                Arrays.asList(1, 2, 3));

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}}),
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11));

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1, 2}, {3, 4}}),
                Arrays.asList(1, 2, 4, 3));

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1, 2}, {3, 4}, {5, 6}}),
                Arrays.asList(1, 2, 4, 6, 5, 3));

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5));

        Assert.assertEquals(sm.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}),
                Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
    }

}