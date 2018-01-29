from unittest import TestCase

from SearchForARange import SearchForARange


class TestSearchForARange(TestCase):
    def test_searchRange(self):
        sr = SearchForARange()

        self.assertEqual(sr.searchRange([1], 1), [0, 0])

        self.assertEqual(sr.searchRange([5, 7, 7, 8, 8, 10], 11), [-1, -1])

        self.assertEqual(sr.searchRange([5, 7, 7, 8, 8, 10], 8), [3, 4])
