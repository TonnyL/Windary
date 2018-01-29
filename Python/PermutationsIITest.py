from unittest import TestCase

from PermutationsII import PermutationsII


class TestPermutationsII(TestCase):
    def test_permuteUnique(self):
        p = PermutationsII()

        self.assertTrue(len(p.permuteUnique([])) == 0)

        self.assertEqual(p.permuteUnique([1]), [[1]])

        self.assertEqual(set(tuple(x) for x in p.permuteUnique([1, 1, 2])),
                         set(tuple(x) for x in [[1, 1, 2], [1, 2, 1], [2, 1, 1]]))
