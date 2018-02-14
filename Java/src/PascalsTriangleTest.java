import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleTest {

    @Test
    public void generate() {
        PascalsTriangle pt = new PascalsTriangle();

        List<List<Integer>> lists = new ArrayList<>();
        Assert.assertEquals(pt.generate(0), lists);

        lists.add(Collections.singletonList(1));
        Assert.assertEquals(pt.generate(1), lists);

        lists.add(Arrays.asList(1, 1));
        Assert.assertEquals(pt.generate(2), lists);

        lists.add(Arrays.asList(1, 2, 1));
        Assert.assertEquals(pt.generate(3), lists);

        lists.add(Arrays.asList(1, 3, 3, 1));
        Assert.assertEquals(pt.generate(4), lists);

        lists.add(Arrays.asList(1, 4, 6, 4, 1));
        Assert.assertEquals(pt.generate(5), lists);
    }

}