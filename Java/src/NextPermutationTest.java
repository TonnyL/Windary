import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NextPermutationTest {

    @Test
    public void testNextPermutation() {
        NextPermutation np = new NextPermutation();

        int[] array123 = new int[]{1, 2, 3};
        np.nextPermutation(array123);
        Assert.assertTrue(Arrays.equals(array123, new int[]{1, 3, 2}));

        int[] array321 = new int[]{3, 2, 1};
        np.nextPermutation(array321);
        Assert.assertTrue(Arrays.equals(array321, new int[]{1, 2, 3}));

        int[] array115 = new int[]{1, 1, 5};
        np.nextPermutation(array115);
        Assert.assertTrue(Arrays.equals(array115, new int[]{1, 5, 1}));
    }

}