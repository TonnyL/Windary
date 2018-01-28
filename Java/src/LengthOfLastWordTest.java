import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() {
        LengthOfLastWord llw = new LengthOfLastWord();

        Assert.assertTrue(llw.lengthOfLastWord("Hello World") == 5);

        Assert.assertTrue(llw.lengthOfLastWord(" ") == 0);

        Assert.assertTrue(llw.lengthOfLastWord("a") == 1);

        Assert.assertTrue(llw.lengthOfLastWord("a ") == 1);
    }
    
}