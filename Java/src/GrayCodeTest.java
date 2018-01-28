import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class GrayCodeTest {

    @Test
    public void testGrayCode() {
        GrayCode gc = new GrayCode();

        Assert.assertEquals(gc.grayCode(0), Collections.singletonList(0));

        Assert.assertEquals(gc.grayCode(2), Arrays.asList(0, 1, 3, 2));

        Assert.assertEquals(gc.grayCode(3), Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4));
    }

}