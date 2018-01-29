from unittest import TestCase

from ReverseInteger import ReverseInteger


class TestReverseInteger(TestCase):
    def test_reverse(self):
        ri = ReverseInteger()

        self.assertTrue(ri.reverse(123) == 321)

        self.assertTrue(ri.reverse(-123) == -321)

        self.assertTrue(ri.reverse(1000000003) == 0)

        self.assertTrue(ri.reverse(1534236469) == 0)
