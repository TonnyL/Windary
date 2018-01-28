import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * <p>
 * Accepted.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && (c == ')' && stack.peek() == '('
                    || c == ']' && stack.peek() == '['
                    || c == '}' && stack.peek() == '{')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        // System.out.println(stack);

        return stack.isEmpty();
    }

}
