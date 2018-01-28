import java.util.*;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * <p>
 * Accepted.
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        if (n <= 0) {
            return list;
        }
        if (n == 1) {
            list.add("()");
            return list;
        }

        for (String s : generateParenthesis(n - 1)) {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                sb.append(chars[j]);
                if (chars[j] == '(') {
                    StringBuilder builder = new StringBuilder(sb);
                    builder.append("()");
                    for (int k = j + 1; k < chars.length; k++) {
                        builder.append(chars[k]);
                    }
                    set.add(builder.toString());
                }
            }

            set.add(s + "()");
        }

        list.addAll(set);
        return list;
    }

}
