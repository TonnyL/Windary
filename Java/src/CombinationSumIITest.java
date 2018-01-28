import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumIITest {

    @Test
    public void testCombinationSum2() {
        CombinationSumII cs = new CombinationSumII();

        // Expected: [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
        List<List<Integer>> list0 = cs.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        Set<List<Integer>> set = new HashSet<>();
        set.add(Arrays.asList(1, 7));
        set.add(Arrays.asList(1, 2, 5));
        set.add(Arrays.asList(2, 6));
        set.add(Arrays.asList(1, 1, 6));
        Assert.assertTrue(list0.size() == 4);
        Assert.assertEquals(new HashSet<>(list0), set);

        // Expected: []
        Assert.assertTrue(cs.combinationSum2(new int[]{1}, 2).isEmpty());

        // Expected: [[1, 1, 2], [2, 2]]
        set.clear();
        List<List<Integer>> list1 = cs.combinationSum2(new int[]{1, 1, 2, 2}, 4);
        set.add(Arrays.asList(1, 1, 2));
        set.add(Arrays.asList(2, 2));
        Assert.assertTrue(list1.size() == 2);
        Assert.assertEquals(new HashSet<>(list1), set);
    }

}