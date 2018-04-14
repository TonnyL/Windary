import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateArrayTest {

    @Test
    public void testRotate() {
        RotateArray ra = new RotateArray();

        int[] array0 = {1};
        ra.rotate(array0, 1);
        Assert.assertTrue(Arrays.equals(array0, new int[]{1}));

        int[] array1 = {1, 2};
        ra.rotate(array1, 1);
        Assert.assertTrue(Arrays.equals(array1, new int[]{2, 1}));

        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        ra.rotate(array2, 3);
        Assert.assertTrue(Arrays.equals(array2, new int[]{5, 6, 7, 1, 2, 3, 4}));
    }

}