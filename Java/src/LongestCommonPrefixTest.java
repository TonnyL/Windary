import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        
        Assert.assertTrue(lcp.longestCommonPrefix(new String[]{}).isEmpty());

        Assert.assertEquals(lcp.longestCommonPrefix(new String[]{"abc"}), "abc");

        Assert.assertEquals(lcp.longestCommonPrefix(new String[]{"abcf", "abcd", "abcdefg"}), "abc");

        Assert.assertEquals(lcp.longestCommonPrefix(new String[]{"aa", "a"}), "a");
    }
    
}