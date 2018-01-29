from unittest import TestCase

from CombinationSumII import CombinationSumII


class TestCombinationSumII(TestCase):
    def test_combinationSum2(self):
        cs = CombinationSumII()

        list0 = cs.combinationSum2([10, 1, 2, 7, 6, 1, 5], 8)
        self.assertTrue(len(list0) == 4)
        self.assertTrue(list0.__contains__([1, 7]))
        self.assertTrue(list0.__contains__([1, 2, 5]))
        self.assertTrue(list0.__contains__([2, 6]))
        self.assertTrue(list0.__contains__([1, 1, 6]))

        self.assertTrue(len(cs.combinationSum2([1], 2)) == 0)

        list1 = cs.combinationSum2([1, 1, 2, 2], 4)
        self.assertTrue(len(list1) == 2)
        self.assertTrue(list1.__contains__([1, 1, 2]))
        self.assertTrue(list1.__contains__([2, 2]))
