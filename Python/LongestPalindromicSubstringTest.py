from unittest import TestCase

from LongestPalindromicSubstring import LongestPalindromicSubstring


class TestLongestPalindromicSubstring(TestCase):
    def test_longestPalindrome(self):
        lps = LongestPalindromicSubstring()

        s = lps.longestPalindrome("babad")
        self.assertTrue(s == "bab" or s == "aba")

        self.assertEqual(lps.longestPalindrome("cbbd"), "bb")

        self.assertEqual(lps.longestPalindrome("babaddtattarrattatddetartrateedredividerb"), "ddtattarrattatdd")
