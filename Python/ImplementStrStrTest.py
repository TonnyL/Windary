from unittest import TestCase

from ImplementStrStr import ImplementStrStr


class TestImplementStrStr(TestCase):
    def test_strStr(self):
        iss = ImplementStrStr()

        self.assertTrue(iss.strStr("aaab", "b") == 3)

        self.assertTrue(iss.strStr("", "") == 0)

        self.assertTrue(iss.strStr("", "a") == -1)

        self.assertTrue(iss.strStr("whats up", "s ") == 4)
