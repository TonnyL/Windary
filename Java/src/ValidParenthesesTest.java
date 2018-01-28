import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void testsValid() {
        ValidParentheses vp = new ValidParentheses();

        Assert.assertTrue(vp.isValid("()"));

        Assert.assertTrue(vp.isValid("()[]{}"));

        Assert.assertFalse(vp.isValid("("));

        Assert.assertFalse(vp.isValid("(]"));

        Assert.assertFalse(vp.isValid("([)]"));
    }

}