import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {

    @Test
    public void testCountAndSay() {
        CountAndSay cas = new CountAndSay();

        Assert.assertEquals(cas.countAndSay(1), "1");

        Assert.assertEquals(cas.countAndSay(2), "11");

        Assert.assertEquals(cas.countAndSay(3), "21");

        Assert.assertEquals(cas.countAndSay(4), "1211");

        Assert.assertEquals(cas.countAndSay(5), "111221");

        Assert.assertEquals(cas.countAndSay(6), "312211");
    }

}