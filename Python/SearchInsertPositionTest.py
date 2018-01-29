from unittest import TestCase

from SearchInsertPosition import SearchInsertPosition


class TestSearchInsertPosition(TestCase):
    def test_searchInsert(self):
        sip = SearchInsertPosition()

        self.assertTrue(sip.searchInsert([1], 0) == 0)

        self.assertTrue(sip.searchInsert([1], 2) == 1)

        self.assertTrue(sip.searchInsert([1, 3, 5, 6], 5) == 2)

        self.assertTrue(sip.searchInsert([1, 3, 5, 6], 2) == 1)

        self.assertTrue(sip.searchInsert([1, 3, 5, 6], 7) == 4)

        self.assertTrue(sip.searchInsert([1, 3, 5, 6], 0) == 0)
