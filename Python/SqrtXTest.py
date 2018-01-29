from unittest import TestCase

from SqrtX import SqrtX


class TestSqrtX(TestCase):
    def test_mySqrt(self):
        sx = SqrtX()

        self.assertTrue(sx.mySqrt(0) == 0)

        self.assertTrue(sx.mySqrt(1) == 1)

        self.assertTrue(sx.mySqrt(2147395599) == 46339)

        self.assertTrue(sx.mySqrt(2147395600) == 46340)

        self.assertTrue(sx.mySqrt(6) == 2)
