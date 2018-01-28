import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();

        Assert.assertTrue(ls.lengthOfLongestSubstring("pwwkew") == 3);

        Assert.assertTrue(ls.lengthOfLongestSubstring("bbbbbb") == 1);

        Assert.assertTrue(ls.lengthOfLongestSubstring("abcabcbb") == 3);

        Assert.assertTrue(ls.lengthOfLongestSubstring("dvdf") == 3);
    }

}