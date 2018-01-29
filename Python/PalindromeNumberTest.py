from unittest import TestCase

from PalindromeNumber import PalindromeNumber


class TestPalindromeNumber(TestCase):
    def test_isPalindrome(self):
        pn = PalindromeNumber()

        self.assertFalse(pn.isPalindrome(-1))

        self.assertTrue(pn.isPalindrome(1))

        self.assertTrue(pn.isPalindrome(121))

        self.assertTrue(pn.isPalindrome(1001))

        self.assertFalse(pn.isPalindrome(1000021))
