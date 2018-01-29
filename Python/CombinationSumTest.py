from unittest import TestCase

from CombinationSum import CombinationSum


class TestCombinationSum(TestCase):
    def test_combinationSum(self):
        cs = CombinationSum()

        list0 = cs.combinationSum([2, 3, 6, 7], 7)
        self.assertTrue(len(list0) == 2)
        self.assertTrue(list0.__contains__([7]))
        self.assertTrue(list0.__contains__([2, 2, 3]))

        self.assertEqual(cs.combinationSum([1], 3), [[1, 1, 1]])

        list1 = cs.combinationSum([1, 2], 4)
        self.assertTrue(len(list1))
        self.assertTrue(list1.__contains__([1, 1, 1, 1]))
        self.assertTrue(list1.__contains__([1, 1, 2]))
        self.assertTrue(list1.__contains__([2, 2]))
