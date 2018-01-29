from unittest import TestCase

from Combinations import Combinations


class TestCombinations(TestCase):
    def test_combine(self):
        c = Combinations()

        self.assertTrue(len(c.combine(2, 0)) == 0)

        list0 = c.combine(2, 1)
        self.assertTrue(len(list0) == 2)
        self.assertTrue(list0.__contains__([1]))
        self.assertTrue(list0.__contains__([2]))

        list1 = c.combine(4, 2)
        self.assertTrue(len(list1) == 6)
        self.assertTrue(list1.__contains__([2, 4]))
        self.assertTrue(list1.__contains__([3, 4]))
        self.assertTrue(list1.__contains__([2, 3]))
        self.assertTrue(list1.__contains__([1, 2]))
        self.assertTrue(list1.__contains__([1, 3]))
        self.assertTrue(list1.__contains__([1, 4]))

        list2 = c.combine(4, 3)
        self.assertTrue(len(list2))
        self.assertTrue(list2.__contains__([1, 2, 3]))
        self.assertTrue(list2.__contains__([1, 2, 4]))
        self.assertTrue(list2.__contains__([1, 3, 4]))
        self.assertTrue(list2.__contains__([2, 3, 4]))
