from unittest import TestCase

from PascalsTriangle import PascalsTriangle


class TestPascalsTriangle(TestCase):
    def test_generate(self):
        pt = PascalsTriangle()

        lists = []
        self.assertEqual(pt.generate(0), lists)

        lists.append([1])
        self.assertEqual(pt.generate(1), lists)

        lists.append([1, 1])
        self.assertEqual(pt.generate(2), lists)

        lists.append([1, 2, 1])
        self.assertEqual(pt.generate(3), lists)

        lists.append([1, 3, 3, 1])
        self.assertEqual(pt.generate(4), lists)

        lists.append([1, 4, 6, 4, 1])
        self.assertEqual(pt.generate(5), lists)
