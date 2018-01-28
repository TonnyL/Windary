import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortColorsTest {

    @Test
    public void testSortColors() {
        SortColors sc = new SortColors();

        int[] array0 = new int[]{};
        sc.sortColors(array0);
        Assert.assertTrue(Arrays.equals(array0, new int[]{}));

        int[] array1 = new int[]{0};
        sc.sortColors(array1);
        Assert.assertTrue(Arrays.equals(array1, new int[]{0}));

        int[] array2 = new int[]{2, 1, 0};
        sc.sortColors(array2);
        Assert.assertTrue(Arrays.equals(array2, new int[]{0, 1, 2}));

        int[] array3 = new int[]{0, 1, 0, 1, 1, 1, 2, 0, 1};
        sc.sortColors(array3);
        Assert.assertTrue(Arrays.equals(array3, new int[]{0, 0, 0, 1, 1, 1, 1, 1, 2}));

        int[] array4 = new int[]{0, 1, 2, 0, 1};
        sc.sortColors(array4);
        Assert.assertTrue(Arrays.equals(array4, new int[]{0, 0, 1, 1, 2}));

        int[] array5 = new int[]{2, 2, 2, 2, 1, 0, 2, 0, 1};
        sc.sortColors(array5);
        Assert.assertTrue(Arrays.equals(array5, new int[]{0, 0, 1, 1, 2, 2, 2, 2, 2}));

        int[] array6 = new int[]{0, 0, 1, 1, 1, 2, 2, 2};
        sc.sortColors(array6);
        Assert.assertTrue(Arrays.equals(array6, new int[]{0, 0, 1, 1, 1, 2, 2, 2}));

        int[] array7 = new int[]{0, 0, 0, 2, 2, 2, 1, 1, 1};
        sc.sortColors(array7);
        Assert.assertTrue(Arrays.equals(array7, new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}));
    }

}