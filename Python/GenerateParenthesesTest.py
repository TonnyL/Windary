from unittest import TestCase

from GenerateParentheses import GenerateParentheses


class TestGenerateParentheses(TestCase):
    def test_generateParenthesis(self):
        gp = GenerateParentheses()

        self.assertTrue(len(gp.generateParenthesis(0)) == 0)

        self.assertEqual(gp.generateParenthesis(1), ["()"])

        list0 = gp.generateParenthesis(2)
        self.assertTrue(len(list0) == 2)
        self.assertEqual(set(tuple(list0)), set(tuple(["()()", "(())"])))

        list1 = gp.generateParenthesis(3)
        self.assertTrue(len(list1) == 5)
        self.assertEqual(set(tuple(list1)), set(tuple(["()()()", "()(())", "(()())", "(())()", "((()))"])))

        list2 = gp.generateParenthesis(4)
        self.assertTrue(len(list2) == 14)
        self.assertEqual(set(tuple(list2)), set(tuple(
            ["()()()()", "(()(()))", "(()())()", "()()(())", "(())()()", "(((())))", "(())(())", "()((()))", "()(())()",
             "()(()())", "(()()())", "((()()))", "((()))()", "((())())"])))
