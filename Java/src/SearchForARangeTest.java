import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SearchForARangeTest {

    @Test
    public void testSearchRange() {
        SearchForARange sr = new SearchForARange();

        Assert.assertTrue(Arrays.equals(sr.searchRange(new int[]{1}, 1), new int[]{0, 0}));

        Assert.assertTrue(Arrays.equals(sr.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 11), new int[]{-1, -1}));

        Assert.assertTrue(Arrays.equals(sr.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8), new int[]{3, 4}));
    }

}