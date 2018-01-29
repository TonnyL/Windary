from unittest import TestCase

from NextPermutation import NextPermutation


class TestNextPermutation(TestCase):
    def test_nextPermutation(self):
        np = NextPermutation()

        array123 = [1, 2, 3]
        np.nextPermutation(array123)
        self.assertEqual(array123, [1, 3, 2])

        array321 = [3, 2, 1]
        np.nextPermutation(array321)
        self.assertEqual(array321, [1, 2, 3])

        array115 = [1, 1, 5]
        np.nextPermutation(array115)
        self.assertEqual(array115, [1, 5, 1])
