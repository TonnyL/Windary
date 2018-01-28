import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PermutationsTest {

    @Test
    public void testPermute() {
        Permutations p = new Permutations();

        Assert.assertTrue(p.permute(new int[]{}).isEmpty());

        List<List<Integer>> list0 = p.permute(new int[]{1});
        Assert.assertTrue(list0.size() == 1);
        Assert.assertEquals(new HashSet<>(list0),
                new HashSet<>(Collections.singletonList(Collections.singletonList(1))));

        List<List<Integer>> list1 = p.permute(new int[]{1, 2});
        Assert.assertTrue(list1.size() == 2);
        Assert.assertEquals(new HashSet<>(list1),
                new HashSet<>(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 1))));

        List<List<Integer>> list2 = p.permute(new int[]{1, 2, 3});
        Assert.assertTrue(list2.size() == 6);
        Assert.assertEquals(new HashSet<>(list2),
                new HashSet<>(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2), Arrays.asList(2, 1, 3), Arrays.asList(2, 3, 1), Arrays.asList(3, 1, 2), Arrays.asList(3, 2, 1))));
    }

}