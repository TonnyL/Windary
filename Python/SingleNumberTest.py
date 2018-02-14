from unittest import TestCase

from SingleNumber import SingleNumber


class TestSingleNumber(TestCase):
    def test_singleNumber(self):
        sn = SingleNumber()
        self.assertTrue(sn.singleNumber(None) == 0)

        self.assertTrue(sn.singleNumber([1]) == 1)

        self.assertTrue(sn.singleNumber([1, 1, 2]) == 2)

        self.assertTrue(sn.singleNumber([1, 1, 2, 2, 3]) == 3)
