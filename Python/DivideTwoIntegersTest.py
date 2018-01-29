from unittest import TestCase

from DivideTwoIntegers import DivideTwoIntegers


class TestDivideTwoIntegers(TestCase):
    def test_divide(self):
        d = DivideTwoIntegers()

        self.assertTrue(d.divide(1, 1) == 1)

        self.assertTrue(d.divide(0, 1) == 0)

        self.assertTrue(d.divide(-1, -1) == 1)

        self.assertTrue(d.divide(2147483647, 1) == 2147483647)

        self.assertTrue(d.divide(2147483647, -2147483648) == 0)

        self.assertTrue(d.divide(-2147483648, -1) == 2147483647)

        self.assertTrue(d.divide(100, 6) == 16)
