import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CombinationsTest {

    @Test
    public void testCombine() {
        Combinations c = new Combinations();

        Assert.assertTrue(c.combine(2, 0).isEmpty());

        List<List<Integer>> list0 = c.combine(2, 1);
        Set<List<Integer>> tmp = new HashSet<>();
        tmp.add(Collections.singletonList(1));
        tmp.add(Collections.singletonList(2));
        Assert.assertTrue(list0.size() == 2);
        Assert.assertEquals(new HashSet<>(list0), tmp);

        tmp.clear();
        List<List<Integer>> list1 = c.combine(4, 2);
        tmp.add(Arrays.asList(2, 4));
        tmp.add(Arrays.asList(3, 4));
        tmp.add(Arrays.asList(2, 3));
        tmp.add(Arrays.asList(1, 2));
        tmp.add(Arrays.asList(1, 3));
        tmp.add(Arrays.asList(1, 4));
        Assert.assertTrue(list1.size() == 6);
        Assert.assertEquals(new HashSet<>(list1), tmp);

        tmp.clear();
        List<List<Integer>> list2 = c.combine(4, 3);
        tmp.add(Arrays.asList(1, 2, 3));
        tmp.add(Arrays.asList(1, 2, 4));
        tmp.add(Arrays.asList(1, 3, 4));
        tmp.add(Arrays.asList(2, 3, 4));
        Assert.assertTrue(list2.size() == 4);
        Assert.assertEquals(new HashSet<>(list2), tmp);
    }

}