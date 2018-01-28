import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumTest {

    @Test
    public void testFourSum() {
        FourSum fs = new FourSum();

        List<List<Integer>> list0 = fs.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        Set<List<Integer>> set = new HashSet<>();
        set.add(Arrays.asList(-1, 0, 0, 1));
        set.add(Arrays.asList(-2, -1, 1, 2));
        set.add(Arrays.asList(-2, 0, 0, 2));
        Assert.assertTrue(list0.size() == 3);
        Assert.assertEquals(new HashSet<>(list0), set);

        set.clear();
        List<List<Integer>> list1 = fs.fourSum(new int[]{-5, 5, 4, -3, 0, 0, 4, -2}, 4);
        set.add(Arrays.asList(-5, 0, 4, 5));
        set.add(Arrays.asList(-3, -2, 4, 5));
        Assert.assertEquals(new HashSet<>(list1), set);
    }

}