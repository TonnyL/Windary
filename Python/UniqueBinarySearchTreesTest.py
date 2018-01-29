from unittest import TestCase

from UniqueBinarySearchTrees import UniqueBinarySearchTrees


class TestUniqueBinarySearchTrees(TestCase):
    def test_numTrees(self):
        u = UniqueBinarySearchTrees()

        self.assertTrue(u.numTrees(0) == 1)

        self.assertTrue(u.numTrees(1) == 1)

        self.assertTrue(u.numTrees(2) == 2)

        self.assertTrue(u.numTrees(3) == 5)

        self.assertTrue(u.numTrees(4) == 14)
