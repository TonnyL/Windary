# -*- coding: UTF-8 -*-
# Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
# determine if the input string is valid.
#
# The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
#
# Python, Python 3 all accepted.


class ValidParentheses:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if s is None or len(s) == 0 or len(s) == 1:
            return False

        stack = Stack()
        for c in s:
            if stack.isEmpty() is False and (
                            (c == ')' and stack.peek() == '(') or (c == ']' and stack.peek() == '[') or (
                                    c == '}' and stack.peek() == '{')):
                stack.pop()
            else:
                stack.push(c)

        # print(stack)

        return stack.isEmpty()


# http://interactivepython.org/courselib/static/pythonds/BasicDS/ImplementingaStackinPython.html
class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.insert(0, item)

    def pop(self):
        return self.items.pop(0)

    def peek(self):
        return self.items[0]

    def size(self):
        return len(self.items)
