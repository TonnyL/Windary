import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class PascalsTriangleIITest {

    @Test
    public void testGetRow() {
        PascalsTriangleII p = new PascalsTriangleII();

        Assert.assertEquals(p.getRow(0), Collections.singletonList(1));

        Assert.assertEquals(p.getRow(1), Arrays.asList(1, 1));

        Assert.assertEquals(p.getRow(2), Arrays.asList(1, 2, 1));

        Assert.assertEquals(p.getRow(3), Arrays.asList(1, 3, 3, 1));

        Assert.assertEquals(p.getRow(4), Arrays.asList(1, 4, 6, 4, 1));
    }

}