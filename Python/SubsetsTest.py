from unittest import TestCase

from Subsets import Subsets


class TestSubsets(TestCase):
    def test_subsets(self):
        s = Subsets()

        self.assertEqual(s.subsets([]), [[]])

        self.assertEqual(s.subsets(None), [[]])

        self.assertEqual(set(tuple(x) for x in s.subsets([1])), set(tuple(x) for x in [[], [1]]))

        self.assertEqual(set(tuple(x) for x in s.subsets([1, 2])), set(tuple(x) for x in [[], [1], [2], [1, 2]]))

        self.assertEqual(set(tuple(x) for x in s.subsets([1, 2, 3])),
                         set(tuple(x) for x in [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]))
