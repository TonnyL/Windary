import org.junit.Assert;
import org.junit.Test;

public class ToLowerCaseTest {

    @Test
    public void testToLowerCase() {
        ToLowerCase tlc = new ToLowerCase();

        Assert.assertEquals(tlc.toLowerCase("Hello"), "hello");
        Assert.assertEquals(tlc.toLowerCase("here"), "here");
        Assert.assertEquals(tlc.toLowerCase("LOVELY"), "lovely");
    }

}
