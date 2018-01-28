import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SubsetsIITest {

    @Test
    public void testSubsetsWithDup() {
        SubsetsII s = new SubsetsII();

        Assert.assertTrue(s.subsetsWithDup(null).isEmpty());

        Assert.assertTrue(s.subsetsWithDup(new int[]{}).isEmpty());

        Assert.assertEquals(s.subsetsWithDup(new int[]{1}),
                Arrays.asList(Collections.emptyList(), Collections.singletonList(1)));

        Assert.assertEquals(new HashSet<>(s.subsetsWithDup(new int[]{1, 1})),
                new HashSet<>(Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Arrays.asList(1, 1))));

        Assert.assertEquals(new HashSet<>(s.subsetsWithDup(new int[]{1, 2})),
                new HashSet<>(Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(2), Arrays.asList(1, 2))));

        Assert.assertEquals(new HashSet<>(s.subsetsWithDup(new int[]{1, 2, 2})),
                new HashSet<>(Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(2), Arrays.asList(1, 2), Arrays.asList(2, 2), Arrays.asList(1, 2, 2))));

        Assert.assertEquals(new HashSet<>(s.subsetsWithDup(new int[]{4, 4, 4, 1, 4})),
                new HashSet<>(Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(4), Arrays.asList(1, 4), Arrays.asList(1, 4, 4), Arrays.asList(1, 4, 4, 4), Arrays.asList(1, 4, 4, 4, 4), Arrays.asList(4, 4), Arrays.asList(4, 4, 4), Arrays.asList(4, 4, 4, 4))));
    }

}