from unittest import TestCase

from SortColors import SortColors


class TestSortColors(TestCase):
    def test_sortColors(self):
        sc = SortColors()

        array0 = []
        sc.sortColors(array0)
        self.assertEqual(array0, [])

        array1 = [0]
        sc.sortColors(array1)
        self.assertEqual(array1, [0])

        array2 = [2, 1, 0]
        sc.sortColors(array2)
        self.assertEqual(array2, [0, 1, 2])

        array3 = [0, 1, 0, 1, 1, 1, 2, 0, 1]
        sc.sortColors(array3)
        self.assertEqual(array3, [0, 0, 0, 1, 1, 1, 1, 1, 2])

        array4 = [0, 1, 2, 0, 1]
        sc.sortColors(array4)
        self.assertEqual(array4, [0, 0, 1, 1, 2])

        array5 = [2, 2, 2, 2, 1, 0, 2, 0, 1]
        sc.sortColors(array5)
        self.assertEqual(array5, [0, 0, 1, 1, 2, 2, 2, 2, 2])

        array6 = [0, 0, 1, 1, 1, 2, 2, 2]
        sc.sortColors(array6)
        self.assertEqual(array6, [0, 0, 1, 1, 1, 2, 2, 2])

        array7 = [0, 0, 0, 2, 2, 2, 1, 1, 1]
        sc.sortColors(array7)
        self.assertEqual(array7, [0, 0, 0, 1, 1, 1, 2, 2, 2])
