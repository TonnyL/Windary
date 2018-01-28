import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void testLetterCombinations() {
        LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();

        Assert.assertTrue(l.letterCombinations("").isEmpty());

        Assert.assertTrue(l.letterCombinations("1").isEmpty());

        List<String> list0 = l.letterCombinations("2");
        Assert.assertTrue(list0.size() == 3);
        Assert.assertEquals(new HashSet<>(list0), new HashSet<>(Arrays.asList("a", "b", "c")));

        List<String> list1 = l.letterCombinations("23");
        Assert.assertTrue(list1.size() == 9);
        Assert.assertEquals(new HashSet<>(list1), new HashSet<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));

        List<String> list2 = l.letterCombinations("234");
        Assert.assertTrue(list2.size() == 27);
        Assert.assertEquals(new HashSet<>(list2), new HashSet<>(Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi")));
    }

}