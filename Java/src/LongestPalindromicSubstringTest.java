import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome() {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();

        String s = l.longestPalindrome("babad");
        Assert.assertTrue(s.equals("bab") || s.equals("aba"));

        Assert.assertEquals(l.longestPalindrome("cbbd"), "bb");

        Assert.assertEquals(l.longestPalindrome("babaddtattarrattatddetartrateedredividerb"), "ddtattarrattatdd");
    }

}