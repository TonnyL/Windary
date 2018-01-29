from unittest import TestCase

from FourSum import FourSum


class TestFourSum(TestCase):
    def test_fourSum(self):
        fs = FourSum()

        list0 = fs.fourSum([1, 0, -1, 0, -2, 2], 0)
        self.assertTrue(len(list0))
        self.assertTrue(list0.__contains__([-1, 0, 0, 1]))
        self.assertTrue(list0.__contains__([-2, -1, 1, 2]))
        self.assertTrue(list0.__contains__([-2, 0, 0, 2]))

        list1 = fs.fourSum([-5, 5, 4, -3, 0, 0, 4, -2], 4)
        self.assertTrue(len(list1) == 2)
        self.assertTrue(list1.__contains__([-5, 0, 4, 5]))
        self.assertTrue(list1.__contains__([-3, -2, 4, 5]))
