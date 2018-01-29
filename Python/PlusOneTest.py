from unittest import TestCase

from PlusOne import PlusOne


class TestPlusOne(TestCase):
    def test_plusOne(self):
        po = PlusOne()

        self.assertEqual(po.plusOne([1]), [2])

        self.assertEqual(po.plusOne([9]), [1, 0])

        self.assertEqual(po.plusOne([9, 9]), [1, 0, 0])

        self.assertEqual(po.plusOne([2, 8, 9, 9, 9]), [2, 9, 0, 0, 0])

        self.assertEqual(po.plusOne([2, 8, 8, 9]), [2, 8, 9, 0])
