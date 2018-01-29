from unittest import TestCase

from Permutations import Permutations


class TestPermutations(TestCase):
    def test_permute(self):
        p = Permutations()

        self.assertTrue(len(p.permute([])) == 0)

        self.assertEqual(p.permute([1]), [[1]])

        list0 = p.permute([1, 2])
        self.assertTrue(len(list0) == 2)
        self.assertEqual(set(tuple(x) for x in list0), set(tuple(x) for x in [[1, 2], [2, 1]]))

        # Expected:
        list1 = p.permute([1, 2, 3])
        self.assertTrue(len(list1) == 6)
        self.assertEqual(set(tuple(x) for x in list1),
                         set(tuple(x) for x in [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]))
