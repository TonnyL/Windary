import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {

    @Test
    public void testStrStr() {
        ImplementStrStr iss = new ImplementStrStr();

        Assert.assertTrue(iss.strStr("aaab", "b") == 3);

        Assert.assertTrue(iss.strStr("", "") == 0);

        Assert.assertTrue(iss.strStr("", "a") == -1);

        Assert.assertTrue(iss.strStr("whats up", "s ") == 4);
    }

}