# -*- coding: UTF-8 -*-
# 
# Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
#
# For example, given n = 3, a solution set is:
#
# [
# "((()))",
# "(()())",
# "(())()",
# "()(())",
# "()()()"
# ]
#
# Python, Python 3 all accepted.


class GenerateParentheses:
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        m_set = set()

        if n <= 0:
            return list(m_set)
        if n == 1:
            m_set.add("()")
            return list(m_set)

        for s in self.generateParenthesis(n - 1):
            string = ""
            chars = list(s)
            for j in range(len(chars)):
                string += chars[j]
                if chars[j] == '(':
                    builder = "" + string
                    builder += "()"
                    for k in range(j + 1, len(chars)):
                        builder += chars[k]
                    m_set.add(builder)
            m_set.add(s + "()")

        return list(m_set)
