import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesesTest {

    @Test
    public void testGenerateParenthesis() {
        GenerateParentheses gp = new GenerateParentheses();

        Assert.assertTrue(gp.generateParenthesis(0).isEmpty());

        Set<String> set = new HashSet<>();
        List<String> list0 = gp.generateParenthesis(1);
        set.add("()");
        Assert.assertEquals(new HashSet<>(list0), set);

        List<String> list1 = gp.generateParenthesis(2);
        set.clear();
        set.addAll(Arrays.asList("()()", "(())"));
        Assert.assertTrue(list1.size() == 2);
        Assert.assertEquals(new HashSet<>(list1), set);

        List<String> list2 = gp.generateParenthesis(3);
        set.clear();
        set.addAll(Arrays.asList("()()()", "()(())", "(()())", "(())()", "((()))"));
        Assert.assertTrue(list2.size() == 5);
        Assert.assertEquals(new HashSet<>(list2), set);

        List<String> list3 = gp.generateParenthesis(4);
        set.clear();
        set.addAll(Arrays.asList("()((()))", "(())(())", "(((())))", "(())()()", "()()(())", "(()())()", "(()(()))", "()()()()", "()(())()", "()(()())", "(()()())", "((()()))", "((()))()", "((())())"));
        Assert.assertTrue(list3.size() == 14);
        Assert.assertEquals(new HashSet<>(list3), set);
    }

}