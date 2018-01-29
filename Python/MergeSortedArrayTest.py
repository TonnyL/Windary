from unittest import TestCase

from MergeSortedArray import MergeSortedArray


class TestMergeSortedArray(TestCase):
    def test_merge(self):
        msa = MergeSortedArray()

        array0 = [1]
        msa.merge(array0, 1, [], 0)
        self.assertEqual(array0, [1])

        array1 = [0]
        msa.merge(array1, 0, [1], 1)
        self.assertEqual(array1, [1])

        array2 = [4, 5, 6, 0, 0, 0]
        msa.merge(array2, 3, [1, 2, 3], 3)
        self.assertEqual(array2, [1, 2, 3, 4, 5, 6])

        array3 = [0, 0, 0, 1, 2, 3, -1, -1, -1]
        # Expected:
        msa.merge(array3, 6, [0, 4], 2)
        self.assertEqual(array3, [0, 0, 0, 0, 1, 2, 3, 4, -1])

        array4 = [0, 1, 2, 3, 0, 0, 0, 0, 0]
        msa.merge(array4, 4, [3, 4, 0], 2)
        self.assertEqual(array4, [0, 1, 2, 3, 3, 4, 0, 0, 0, 0])

        array5 = [1, 2, 0, 0]
        msa.merge(array5, 2, [1], 1)
        self.assertEqual(array5, [1, 1, 2, 0])

        array6 = [1, 2, 3, 0, 0, 0]
        msa.merge(array6, 3, [2, 5, 6], 3)
        self.assertEqual(array6, [1, 2, 2, 3, 5, 6])
