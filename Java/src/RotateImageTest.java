import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateImageTest {

    @Test
    public void testRotate() {
        RotateImage ri = new RotateImage();

        int[][] ints1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ri.rotate(ints1);
        Assert.assertTrue(Arrays.deepEquals(ints1, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}));

        int[][] ints2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        ri.rotate(ints2);
        Assert.assertTrue(Arrays.deepEquals(ints2, new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}));
    }

}