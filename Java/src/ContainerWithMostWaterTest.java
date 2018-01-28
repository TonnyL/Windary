import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea() {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();

        Assert.assertTrue(cwmw.maxArea(new int[]{1, 1}) == 1);

        Assert.assertTrue(cwmw.maxArea(new int[]{1, 4, 9}) == 4);

        Assert.assertTrue(cwmw.maxArea(new int[]{1, 4, 9, 4}) == 8);
    }

}