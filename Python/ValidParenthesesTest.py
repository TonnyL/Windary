from unittest import TestCase

from ValidParentheses import ValidParentheses


class TestValidParentheses(TestCase):
    def test_isValid(self):
        vp = ValidParentheses()

        self.assertTrue(vp.isValid("()"))

        self.assertTrue(vp.isValid("()[]{}"))

        self.assertFalse(vp.isValid("("))

        self.assertFalse(vp.isValid("(]"))

        self.assertFalse(vp.isValid("([)]"))
