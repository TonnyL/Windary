from unittest import TestCase

from TwoSum import TwoSum


class TestTwoSum(TestCase):
    def test_twoSum(self):
        twoSum = TwoSum()

        self.assertEqual(twoSum.twoSum([2, 5, 5, 11], 10), [1, 2])

        self.assertEqual(twoSum.twoSum([2, 7, 11, 15], 9), [0, 1])

        self.assertEqual(twoSum.twoSum([3, 2, 3], 6), [0, 2])
