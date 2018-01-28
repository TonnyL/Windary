import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CombinationSumTest {

    @Test
    public void testCombinationSum() {
        CombinationSum cs = new CombinationSum();

        List<List<Integer>> list0 = cs.combinationSum(new int[]{2, 3, 6, 7}, 7);
        Set<List<Integer>> set = new HashSet<>();
        set.add(Collections.singletonList(7));
        set.add(Arrays.asList(2, 2, 3));
        Assert.assertTrue(list0.size() == 2);
        Assert.assertEquals(new HashSet<>(list0), set);

        List<List<Integer>> list1 = cs.combinationSum(new int[]{1}, 3);
        set.clear();
        set.add(Arrays.asList(1, 1, 1));
        Assert.assertTrue(list1.size() == 1);
        Assert.assertEquals(new HashSet<>(list1), set);

        List<List<Integer>> list2 = cs.combinationSum(new int[]{1, 2}, 4);
        set.clear();
        set.add(Arrays.asList(1, 1, 1, 1));
        set.add(Arrays.asList(1, 1, 2));
        set.add(Arrays.asList(2, 2));
        Assert.assertTrue(list2.size() == 3);
        Assert.assertEquals(new HashSet<>(list2), set);
    }

}