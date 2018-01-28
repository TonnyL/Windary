import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MergeIntervalsTest {

    @Test
    public void testMerge() {
        MergeIntervals mi = new MergeIntervals();

        Assert.assertEquals(mi.merge(Collections.singletonList(new MergeIntervals.Interval(1, 1))),
                Collections.singletonList(new MergeIntervals.Interval(1, 1)));

        Assert.assertEquals(mi.merge(Arrays.asList(new MergeIntervals.Interval(1, 2), new MergeIntervals.Interval(2, 2))),
                Collections.singletonList(new MergeIntervals.Interval(1, 2)));

        Assert.assertEquals(mi.merge(Arrays.asList(new MergeIntervals.Interval(1, 2), new MergeIntervals.Interval(4, 5), new MergeIntervals.Interval(7, 8))),
                Arrays.asList(new MergeIntervals.Interval(1, 2), new MergeIntervals.Interval(4, 5), new MergeIntervals.Interval(7, 8)));

        Assert.assertEquals(mi.merge(Arrays.asList(new MergeIntervals.Interval(1, 3), new MergeIntervals.Interval(2, 4))),
                Collections.singletonList(new MergeIntervals.Interval(1, 4)));

        Assert.assertEquals(mi.merge(Arrays.asList(new MergeIntervals.Interval(1, 4), new MergeIntervals.Interval(2, 3))),
                Collections.singletonList(new MergeIntervals.Interval(1, 4)));
    }

}