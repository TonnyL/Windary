from unittest import TestCase

from SearchInRotatedSortedArrayII import SearchInRotatedSortedArrayII


class TestSearchInRotatedSortedArrayII(TestCase):
    def test_search(self):
        s = SearchInRotatedSortedArrayII()

        self.assertFalse(s.search([3, 2], 4))

        self.assertFalse(s.search([3, 1, 2], 4))

        self.assertTrue(s.search([3, 1, 2], 2))

        self.assertTrue(s.search([2, 2, 2, 2, 3, 4, 1, 1], 4))

        self.assertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 2))

        self.assertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 7))

        self.assertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 5))

        self.assertTrue(s.search([1], 1))
