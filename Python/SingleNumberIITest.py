from unittest import TestCase

from SingleNumberII import SingleNumberII


class TestSingleNumberII(TestCase):
    def test_singleNumber(self):
        s = SingleNumberII()

        self.assertTrue(s.singleNumber([1]) == 1)

        self.assertTrue(s.singleNumber([1, 1, 1]) == 0)

        self.assertTrue(s.singleNumber([1, 1, 1, 2]) == 2)

        self.assertTrue(s.singleNumber([1, 1, 1, 2, 2, 2, 3]) == 3)
