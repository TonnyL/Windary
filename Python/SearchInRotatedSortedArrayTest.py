from unittest import TestCase

from SearchInRotatedSortedArray import SearchInRotatedSortedArray


class TestSearchInRotatedSortedArray(TestCase):
    def test_search(self):
        s = SearchInRotatedSortedArray()

        self.assertTrue(s.search([], 1) == -1)

        self.assertTrue(s.search([0, 1, 2, 4, 5, 6, 7], 7) == 6)

        self.assertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 7) == 3)

        self.assertTrue(s.search([5, 6, 7, 0, 1, 2, 4], 7) == 2)

        self.assertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 8) == -1)
