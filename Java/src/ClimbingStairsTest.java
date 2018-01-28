import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        ClimbingStairs cs = new ClimbingStairs();

        Assert.assertTrue(cs.climbStairs(1) == 1);

        Assert.assertTrue(cs.climbStairs(3) == 3);

        Assert.assertTrue(cs.climbStairs(5) == 8);
    }

}