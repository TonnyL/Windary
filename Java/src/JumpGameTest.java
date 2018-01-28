import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {

    @Test
    public void testCanJump() {
        JumpGame jg = new JumpGame();

        Assert.assertFalse(jg.canJump(null));

        Assert.assertFalse(jg.canJump(new int[]{}));

        Assert.assertTrue(jg.canJump(new int[]{1}));

        Assert.assertTrue(jg.canJump(new int[]{0}));

        Assert.assertTrue(jg.canJump(new int[]{2, 3, 1, 1, 4}));

        Assert.assertFalse(jg.canJump(new int[]{3, 2, 1, 0, 4}));

        Assert.assertTrue(jg.canJump(new int[]{4, 0, 0, 0}));
    }

}