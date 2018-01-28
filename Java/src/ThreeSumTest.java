import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum ts = new ThreeSum();

        Assert.assertTrue(ts.threeSum(new int[]{-1, 0}).isEmpty());

        Assert.assertEquals(new HashSet<>(ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4})),
                new HashSet<>(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))));

        Assert.assertEquals(ts.threeSum(new int[]{0, 0, 0}), Collections.singletonList(Arrays.asList(0, 0, 0)));

        Assert.assertEquals(new HashSet<>(ts.threeSum(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6})),
                new HashSet<>(Arrays.asList(Arrays.asList(-4, -2, 6), Arrays.asList(-4, 0, 4), Arrays.asList(-4, 1, 3), Arrays.asList(-4, 2, 2), Arrays.asList(-2, -2, 4), Arrays.asList(-2, 0, 2))));
    }

}