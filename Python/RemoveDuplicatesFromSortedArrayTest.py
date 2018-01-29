from unittest import TestCase

from RemoveDuplicatesFromSortedArray import RemoveDuplicatesFromSortedArray


class TestRemoveDuplicatesFromSortedArray(TestCase):
    def test_removeDuplicates(self):
        r = RemoveDuplicatesFromSortedArray()

        self.assertTrue(r.removeDuplicates([]) == 0)

        self.assertTrue(r.removeDuplicates([1, 2, 2]) == 2)

        self.assertTrue(r.removeDuplicates([1, 1, 1]) == 1)

        self.assertTrue(r.removeDuplicates([1, 1, 2, 3, 4]) == 4)
