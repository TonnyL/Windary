from unittest import TestCase

from SearchA2DMatrix import SearchA2DMatrix


class TestSearchA2DMatrix(TestCase):
    def test_searchMatrix(self):
        s = SearchA2DMatrix()

        self.assertFalse(s.searchMatrix([], 0))
        
        self.assertFalse(s.searchMatrix([[]], 1))
        
        self.assertTrue(s.searchMatrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50]], 3))
        
        self.assertTrue(s.searchMatrix([[1]], 1))
