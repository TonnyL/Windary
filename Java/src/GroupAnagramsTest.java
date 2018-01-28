import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams() {
        GroupAnagrams ga = new GroupAnagrams();

        Assert.assertTrue(ga.groupAnagrams(new String[]{}).isEmpty());

        List<List<String>> list0 = ga.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Set<Set<String>> set = new HashSet<>();
        set.add(new HashSet<>(Arrays.asList("ate", "eat", "tea")));
        set.add(new HashSet<>(Arrays.asList("nat", "tan")));
        set.add(new HashSet<>(Collections.singletonList("bat")));
        Assert.assertTrue(list0.size() == 3);
        Assert.assertEquals(list0.stream().map((Function<List<String>, HashSet>) HashSet::new).collect(Collectors.toSet()), set);
    }

}