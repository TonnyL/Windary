import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {
        PalindromeNumber pn = new PalindromeNumber();

        Assert.assertFalse(pn.isPalindrome(-1));

        Assert.assertTrue(pn.isPalindrome(1));

        Assert.assertTrue(pn.isPalindrome(121));

        Assert.assertTrue(pn.isPalindrome(1001));

        Assert.assertFalse(pn.isPalindrome(1000021));
    }

}