import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {

    @Test
    public void testThreeSumClosest() {
        ThreeSumClosest t = new ThreeSumClosest();

        Assert.assertTrue(t.threeSumClosest(new int[]{-1, 2, 1, 4}, 1) == 2);

        Assert.assertTrue(t.threeSumClosest(new int[]{1, 1, 1, 0}, 100) == 3);

        Assert.assertTrue(t.threeSumClosest(new int[]{1, 1, 1, 0}, -100) == 2);

        Assert.assertTrue(t.threeSumClosest(new int[]{-1, 2, 1, -4}, 1) == 2);
    }

}