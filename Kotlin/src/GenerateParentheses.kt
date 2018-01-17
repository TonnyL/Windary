/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * Accepted.
 */
class GenerateParentheses {

    fun generateParenthesis(n: Int): List<String> {
        val set = mutableSetOf<String>()
        val list = mutableListOf<String>()

        if (n <= 0) {
            return list
        }
        if (n == 1) {
            return list.apply {
                add("()")
            }
        }

        generateParenthesis(n - 1).forEach { s ->
            val sb = StringBuilder()
            val chars = s.toCharArray()

            for (j in chars.indices) {
                sb.append(chars[j])
                if (chars[j] == '(') {
                    val builder = StringBuilder(sb)
                    builder.append("()")
                    for (k in j + 1 until chars.size) {
                        builder.append(chars[k])
                    }
                    set.add(builder.toString())
                }
            }

            set.add(s + "()")
        }

        return list.apply {
            addAll(set)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val gp = GenerateParentheses()

            // Expected: []
            println(gp.generateParenthesis(0))

            // Expected: [()]
            println(gp.generateParenthesis(1))

            // Expected: [()(), (())]
            println(gp.generateParenthesis(2))

            // Expected: [()()(), ()(()), (()()), (())(), ((()))]
            println(gp.generateParenthesis(3))

            // Expected: [()()()(), (()(())), (()())(), ()()(()), (())()(), (((()))), (())(()),
            // ()((())), ()(())(), ()(()()), (()()()), ((()())), ((()))(), ((())())]
            println(gp.generateParenthesis(4))
        }
    }

}
