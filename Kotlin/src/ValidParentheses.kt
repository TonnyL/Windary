import java.util.*

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * Accepted.
 */
class ValidParentheses {

    fun isValid(s: String): Boolean {
        if (s.isEmpty() || s.length == 1) return false

        val stack = Stack<Char>()
        for (c in s.toCharArray()) {
            if (!stack.isEmpty() && (c == ')' && stack.peek() == '('
                    || c == ']' && stack.peek() == '['
                    || c == '}' && stack.peek() == '{')) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }

//        System.out.println("======")
//        for (c in stack) {
//            System.out.print("$c ")
//        }
//        System.out.println("\n*****")

        return stack.isEmpty()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val vp = ValidParentheses()
            // Expected: true
            println(vp.isValid("()"))
            // Expected: true
            println(vp.isValid("()[]{}"))
            // Expected: false
            println(vp.isValid("("))
            // Expected: false
            println(vp.isValid("(]"))
            // Expected: false
            println(vp.isValid("([)]"))
        }
    }

}