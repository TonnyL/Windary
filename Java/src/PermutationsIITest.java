import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class PermutationsIITest {

    @Test
    public void testPermuteUnique() {
        PermutationsII p = new PermutationsII();

        Assert.assertTrue(p.permuteUnique(new int[]{}).isEmpty());

        Assert.assertEquals(p.permuteUnique(new int[]{1}),
                Collections.singletonList(Collections.singletonList(1)));

        Assert.assertEquals(new HashSet<>(p.permuteUnique(new int[]{1, 1, 2})),
                new HashSet<>(Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), Arrays.asList(2, 1, 1))));
    }

}