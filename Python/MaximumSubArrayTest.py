from unittest import TestCase

from MaximumSubArray import MaximumSubArray


class TestMaximumSubArray(TestCase):
    def test_maxSubArray(self):
        ms = MaximumSubArray()

        self.assertTrue(ms.maxSubArray([1]) == 1)
        
        self.assertTrue(ms.maxSubArray([-4, -2]) == -2)
        
        self.assertTrue(ms.maxSubArray([1, 0, -1]) == 1)
        
        self.assertTrue(ms.maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]) == 6)
