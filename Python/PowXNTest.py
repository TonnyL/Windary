from unittest import TestCase

from PowXN import PowXN


class TestPowXN(TestCase):
    def test_myPow(self):
        pxn = PowXN()

        self.assertTrue(pxn.myPow(2, 2) == 4)

        self.assertEqual(str.format("{:.5f}", pxn.myPow(8.88023, 3)), "700.28148")

        self.assertTrue(pxn.myPow(2.0, -2) == 0.25)

        self.assertTrue(pxn.myPow(0.00001, 2147483647) == 0.0)

        self.assertEqual(str.format("{:.5f}", pxn.myPow(34.00515, -3)), "0.00003")
