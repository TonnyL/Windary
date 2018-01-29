from unittest import TestCase

from CountAndSay import CountAndSay


class TestCountAndSay(TestCase):
    def test_countAndSay(self):
        cas = CountAndSay()

        self.assertTrue(cas.countAndSay(1) == "1")

        self.assertTrue(cas.countAndSay(2) == "11")

        self.assertTrue(cas.countAndSay(3) == "21")

        self.assertTrue(cas.countAndSay(4) == "1211")

        self.assertTrue(cas.countAndSay(5) == "111221")

        self.assertTrue(cas.countAndSay(6) == "312211")
