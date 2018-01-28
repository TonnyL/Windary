import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testIntToRoman() {
        IntegerToRoman i = new IntegerToRoman();

        Assert.assertEquals(i.intToRoman(1), "I");

        Assert.assertEquals(i.intToRoman(621), "DCXXI");

        Assert.assertEquals(i.intToRoman(1996), "MCMXCVI");

        Assert.assertEquals(i.intToRoman(999), "CMXCIX");
    }

}