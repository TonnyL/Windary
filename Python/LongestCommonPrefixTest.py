from unittest import TestCase

from LongestCommonPrefix import LongestCommonPrefix


class TestLongestCommonPrefix(TestCase):
    def test_longestCommonPrefix(self):
        lcp = LongestCommonPrefix()

        self.assertTrue(len(lcp.longestCommonPrefix([""])) == 0)

        self.assertEqual(lcp.longestCommonPrefix(["abc"]), "abc")

        self.assertEqual(lcp.longestCommonPrefix(["abcf", "abcd", "abcdefg"]), "abc")

        self.assertEqual(lcp.longestCommonPrefix(["aa", "a"]), "a")
