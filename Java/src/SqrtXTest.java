import org.junit.Assert;
import org.junit.Test;

public class SqrtXTest {

    @Test
    public void testMySqrt() {
        SqrtX sx = new SqrtX();

        Assert.assertTrue(sx.mySqrt(0) == 0);

        Assert.assertTrue(sx.mySqrt(1) == 1);

        Assert.assertTrue(sx.mySqrt(2147395599) == 46339);

        Assert.assertTrue(sx.mySqrt(2147395600) == 46340);

        Assert.assertTrue(sx.mySqrt(6) == 2);
    }
    
}