from unittest import TestCase

from RotateArray import RotateArray


class TestRotateArray(TestCase):
    def test_rotate(self):
        ra = RotateArray()

        array0 = [1]
        ra.rotate(array0, 1)
        self.assertEqual(array0, [1])

        array1 = [1, 2]
        ra.rotate(array1, 1)
        self.assertEqual(array1, [2, 1])

        array2 = [1, 2, 3, 4, 5, 6, 7]
        ra.rotate(array2, 3)
        self.assertEqual(array2, [5, 6, 7, 1, 2, 3, 4])
