from unittest import TestCase

from PascalsTriangleII import PascalsTriangleII


class TestPascalsTriangleII(TestCase):
    def test_getRow(self):
        p = PascalsTriangleII()

        self.assertEqual(p.getRow(0), [1])

        self.assertEqual(p.getRow(1), [1, 1])

        self.assertEqual(p.getRow(2), [1, 2, 1])

        self.assertEqual(p.getRow(3), [1, 3, 3, 1])

        self.assertEqual(p.getRow(4), [1, 4, 6, 4, 1])
