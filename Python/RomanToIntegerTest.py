from unittest import TestCase

from RomanToInteger import RomanToInteger


class TestRomanToInteger(TestCase):
    def test_romanToInt(self):
        rtt = RomanToInteger()
        # Expected: 621 = 500 + 100 + 10 + 10 +1
        self.assertTrue(rtt.romanToInt("DCXXI") == 621)
        # Expected: 1996 = 1000 - (100 - 1000) - (10 - 100) + 5 + 1
        self.assertTrue(rtt.romanToInt("MCMXCVI") == 1996)
        # Expected: 999 = - (100 - 1000) - (10 - 100) - (1 - 10)
        self.assertTrue(rtt.romanToInt("CMXCIX") == 999)
