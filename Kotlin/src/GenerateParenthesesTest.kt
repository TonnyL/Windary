import org.junit.Test

class GenerateParenthesesTest {

    @Test
    fun testGenerateParenthesis() {
        val gp = GenerateParentheses()

        assert(gp.generateParenthesis(0).isEmpty())

        val list0 = gp.generateParenthesis(1)
        assert(list0.size == 1)
        assert(list0.containsAll(listOf("()")))

        val list1 = gp.generateParenthesis(2)
        assert(list1.size == 2)
        assert(list1.containsAll(listOf("()()", "(())")))

        val list2 = gp.generateParenthesis(3)
        assert(list2.size == 5)
        assert(list2.containsAll(listOf("()()()", "()(())", "(()())", "(())()", "((()))")))

        val list3 = gp.generateParenthesis(4)
        assert(list3.size == 14)
        assert(list3.containsAll(listOf("()((()))", "(())(())", "(((())))", "(())()()", "()()(())", "(()())()", "(()(()))", "()()()()", "()(())()", "()(()())", "(()()())", "((()()))", "((()))()", "((())())")))
    }

}