from unittest import TestCase

from RemoveDuplicatesFromSortedArrayII import RemoveDuplicatesFromSortedArrayII


class TestRemoveDuplicatesFromSortedArrayII(TestCase):
    def test_removeDuplicates(self):
        r = RemoveDuplicatesFromSortedArrayII()

        self.assertTrue(r.removeDuplicates([1, 1, 1, 2, 2, 3]) == 5)

        self.assertTrue(r.removeDuplicates([1, 1, 2, 2, 3]) == 5)

        self.assertTrue(r.removeDuplicates(None) == 0)

        self.assertTrue(r.removeDuplicates([1, 1]) == 2)

        self.assertTrue(r.removeDuplicates([1, 1, 1, 1]) == 2)
