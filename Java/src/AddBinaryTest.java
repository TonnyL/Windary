import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void testAddBinary() {
        AddBinary ab = new AddBinary();

        Assert.assertEquals(ab.addBinary("0", "0"), "0");

        Assert.assertEquals(ab.addBinary("11", "1"), "100");

        Assert.assertEquals(ab.addBinary("101", "101"), "1010");
    }

}
