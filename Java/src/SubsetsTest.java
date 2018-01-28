import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SubsetsTest {

    @Test
    public void testSubsets() {
        Subsets s = new Subsets();

        Assert.assertEquals(s.subsets(new int[]{}),
                Collections.singletonList(Collections.emptyList()));

        Assert.assertEquals(s.subsets(null),
                Collections.singletonList(Collections.emptyList()));

        Assert.assertEquals(s.subsets(new int[]{1}),
                Arrays.asList(Collections.emptyList(), Collections.singletonList(1)));

        Assert.assertEquals(s.subsets(new int[]{1, 2}),
                Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(2), Arrays.asList(1, 2)));

        Assert.assertEquals(s.subsets(new int[]{1, 2, 3}),
                Arrays.asList(Collections.emptyList(), Collections.singletonList(1), Collections.singletonList(2), Arrays.asList(1, 2), Collections.singletonList(3), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(1, 2, 3)));
    }

}