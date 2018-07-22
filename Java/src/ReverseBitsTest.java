import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void testReverseBits() {
        ReverseBits rb = new ReverseBits();

        Assert.assertEquals(0, rb.reverseBits(0));

        Assert.assertEquals(43261596, rb.reverseBits(964176192));
    }

}
