import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortedArrayTest {

    @Test
    public void testMerge() {
        MergeSortedArray msa = new MergeSortedArray();

        int[] array0 = new int[]{1};
        msa.merge(array0, 1, new int[]{}, 0);
        Assert.assertTrue(Arrays.equals(array0, new int[]{1}));

        int[] array1 = new int[]{0};
        msa.merge(array1, 0, new int[]{1}, 1);
        Assert.assertTrue(Arrays.equals(array1, new int[]{1}));

        int[] array2 = new int[]{4, 5, 6, 0, 0, 0};
        msa.merge(array2, 3, new int[]{1, 2, 3}, 3);
        Assert.assertTrue(Arrays.equals(array2, new int[]{1, 2, 3, 4, 5, 6}));

        int[] array3 = new int[]{0, 0, 0, 1, 2, 3, -1, -1, -1};
        msa.merge(array3, 6, new int[]{0, 4}, 2);
        Assert.assertTrue(Arrays.equals(array3, new int[]{0, 0, 0, 0, 1, 2, 3, 4, -1}));

        int[] array4 = new int[]{0, 1, 2, 3, 0, 0, 0, 0, 0};
        msa.merge(array4, 4, new int[]{3, 4, 0}, 2);
        Assert.assertTrue(Arrays.equals(array4, new int[]{0, 1, 2, 3, 3, 4, 0, 0, 0}));

        int[] array5 = new int[]{1, 2, 0, 0};
        msa.merge(array5, 2, new int[]{1}, 1);
        Assert.assertTrue(Arrays.equals(array5, new int[]{1, 1, 2, 0}));

        int[] array6 = new int[]{1, 2, 3, 0, 0, 0};
        msa.merge(array6, 3, new int[]{2, 5, 6}, 3);
        Assert.assertTrue(Arrays.equals(array6, new int[]{1, 2, 2, 3, 5, 6}));
    }

}