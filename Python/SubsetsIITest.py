from unittest import TestCase

from SubsetsII import SubsetsII


class TestSubsetsII(TestCase):
    def test_subsetsWithDup(self):
        s = SubsetsII()

        self.assertTrue(len(s.subsetsWithDup([])) == 0)

        self.assertEqual(set(tuple(x) for x in s.subsetsWithDup([1])), set(tuple(x) for x in [[1], []]))

        self.assertEqual(set(tuple(x) for x in s.subsetsWithDup([1, 1])), set(tuple(x) for x in [[], [1], [1, 1]]))

        self.assertEqual(set(tuple(x) for x in s.subsetsWithDup([1, 2])), set(tuple(x) for x in [[1], [2], [1, 2], []]))

        self.assertEqual(set(tuple(x) for x in s.subsetsWithDup([1, 2, 2])),
                         set(tuple(x) for x in [[2], [1], [1, 2, 2], [2, 2], [1, 2], []]))

        self.assertEqual(set(tuple(x) for x in s.subsetsWithDup([4, 4, 4, 1, 4])),
                         set(tuple(x) for x in
                             [[], [1], [1, 4], [1, 4, 4], [1, 4, 4, 4], [1, 4, 4, 4, 4], [4], [4, 4], [4, 4, 4],
                              [4, 4, 4, 4]]))
