# -*- coding: UTF-8 -*-
#
# Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
#
# Note:
# You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
# The number of elements initialized in nums1 and nums2 are m and n respectively.
#
# Python, Python 3 accepted.
class MergeSortedArray:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        if n != 0:
            nums1[m:m + n] = nums2
            nums1[0:m + n] = sorted(nums1[0:m + n])
            # print(nums1)


msa = MergeSortedArray()
# Expected: [1]
msa.merge([1], 1, [], 0)
# Expected: []
msa.merge([0], 0, [1], 1)
# Expected: [1, 2, 3, 4, 5, 6]
msa.merge([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3)
# Expected: [0, 0, 0, 0, 1, 2, 3, 4, -1]
msa.merge([0, 0, 0, 1, 2, 3, -1, -1, -1], 6, [0, 4], 2)
# Expected: [0, 1, 2, 3, 3, 4, 0, 0, 0]
msa.merge([0, 1, 2, 3, 0, 0, 0, 0, 0], 4, [3, 4, 0], 2)
# Expected: [1, 1, 2, 0]
msa.merge([1, 2, 0, 0], 2, [1], 1)
# Expected: [1, 2, 2, 3, 5, 6]
msa.merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)
