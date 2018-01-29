from unittest import TestCase

from MergeIntervals import MergeIntervals, Interval


class TestMergeIntervals(TestCase):
    def test_merge(self):
        mi = MergeIntervals()

        self.assertEqual(mi.merge([Interval(1, 1)]), [Interval(1, 1)])

        self.assertEqual(mi.merge([Interval(1, 2), Interval(2, 2)]), [Interval(1, 2)])

        self.assertEqual(mi.merge([Interval(1, 2), Interval(4, 5), Interval(7, 8)]),
                         [Interval(1, 2), Interval(4, 5), Interval(7, 8)])

        self.assertEqual(mi.merge([Interval(1, 3), Interval(2, 4)]),
                         [Interval(1, 4)])

        self.assertEqual(mi.merge([Interval(1, 4), Interval(2, 3)]),
                         [Interval(1, 4)])
